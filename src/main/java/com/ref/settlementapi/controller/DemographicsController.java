package com.ref.settlementapi.controller;

import com.ref.settlementapi.model.Demographics;
import com.ref.settlementapi.service.DemographicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/rest/demographics")
public class DemographicsController {

    @Autowired
    private DemographicsService demographicsService;

    @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getName(@PathVariable(value = "name") String name) {
        return ResponseEntity.ok(String.format("Hello %s", name));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Demographics>> getDemographics() {
        return new ResponseEntity<>(demographicsService.getAllDemographics(), HttpStatus.OK);
    }

    @GetMapping(value = "/load", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Demographics>> loadDemographics() throws IOException {
        return new ResponseEntity<>(demographicsService.loadDemographicsFromResources(), HttpStatus.OK);
    }
}
