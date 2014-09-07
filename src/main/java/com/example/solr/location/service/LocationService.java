package com.example.solr.location.service;

import com.example.solr.location.model.Location;

import java.util.List;

/**
 * Created by adutta on 9/1/2014.
 */
public interface LocationService {

    public List<Location> findById(String id);
}
