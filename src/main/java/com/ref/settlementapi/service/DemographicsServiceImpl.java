package com.ref.settlementapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ref.settlementapi.model.Demographics;
import com.ref.settlementapi.model.DemographicsEntity;
import com.ref.settlementapi.repository.DemographicsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DemographicsServiceImpl implements DemographicsService {

    @Value("classpath:data.json")
    Resource resource;

    @Autowired
    private DemographicsRepository demographicsRepository;

    @Override
    public List<Demographics> getAllDemographics() {
        List<DemographicsEntity> demographicsEntityList = demographicsRepository.findAll();
        return demographicsEntityList.stream()
                .map(e -> {
                    Demographics d = new Demographics();
                    BeanUtils.copyProperties(e, d);
                    return d;
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<DemographicsEntity> saveAllDemographics(List<Demographics> demographicsList) {
        List<DemographicsEntity> demographicsEntities = demographicsList.stream()
                .map(d -> {
                    DemographicsEntity e = new DemographicsEntity();
                    BeanUtils.copyProperties(d, e);
                    return e;
                })
                .collect(Collectors.toList());

        return demographicsRepository.saveAll(demographicsEntities);
    }

    @Override
    public List<Demographics> loadDemographicsFromResources() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Demographics[] response =  mapper.readValue(resource.getFile(), Demographics[].class);
        List<Demographics> list = Arrays.asList(response);
        saveAllDemographics(list);
        return list;
    }
}
