package com.ref.settlementapi.security;

import com.ref.settlementapi.model.User;
import com.ref.settlementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> dbUserOptional = this.userRepository.findByUsername(username);
        if (dbUserOptional.isPresent()) {
            User dbUser = dbUserOptional.get();
            Collection<GrantedAuthority> grantedAuthorities = dbUser.getRoles()
                    .stream()
                    .map(role -> new SimpleGrantedAuthority(role))
                    .collect(Collectors.toList());

            org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(
                    dbUser.getUsername(), dbUser.getPassword(), grantedAuthorities);
            return user;
        } else {
            throw new UsernameNotFoundException(String.format("User '%s' not found", username));
        }
    }

}