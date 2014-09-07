package com.example.solr.location.service;

import com.example.solr.location.model.Location;
import com.example.solr.location.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;

import java.util.List;

/**
 * Created by adutta on 9/1/2014.
 */
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    SolrTemplate solrTemplate;

    @Override
    public List<Location> findById(String id) {

        return locationRepository.findByLocId(id);
    }
}
