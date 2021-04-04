package com.ref.settlementapi.repository;

import com.ref.settlementapi.model.DemographicsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemographicsRepository extends MongoRepository<DemographicsEntity, String> {

}
