package com.example.solr.location.repository;

import com.example.solr.location.model.Location;
import org.springframework.data.repository.Repository;
import org.springframework.data.solr.repository.Query;

import java.util.List;


/**
 * Created by adutta on 9/1/2014.
 */
public interface LocationRepository extends Repository<Location, String> {


    public List<Location> findByLocId(String id);

    public List<Location> findLocation(String id);

}
