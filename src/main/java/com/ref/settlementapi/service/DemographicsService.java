package com.ref.settlementapi.service;

import com.ref.settlementapi.model.Demographics;
import com.ref.settlementapi.model.DemographicsEntity;

import java.io.IOException;
import java.util.List;

public interface DemographicsService {
    List<Demographics> getAllDemographics();

    List<DemographicsEntity> saveAllDemographics(List<Demographics> demographicsList);

    List<Demographics> loadDemographicsFromResources() throws IOException;

}
