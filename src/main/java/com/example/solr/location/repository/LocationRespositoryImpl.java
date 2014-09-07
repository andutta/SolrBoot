package com.example.solr.location.repository;

import com.example.solr.location.model.Location;

import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.Query;

import java.util.List;

/**
 * Created by adutta on 9/1/2014.
 */
public class LocationRespositoryImpl implements LocationRepository{

    @Autowired
    private SolrTemplate solrTemplate;

    @Override
    @Query("loc.id:?0")
    public List<Location> findByLocId(String id) {
        return null;
    }

    @Override
    public List<Location> findLocation(String id) {
        final SolrQuery query = new SolrQuery();

        // 2 edismax query setup
        query.set("q", "Chicago");
        query.set("qt", "suggestForHotelMatchByName");
        query.set("locale","en_US");
        query.set("pos","ORB");
        query.set("wt","xml");
/*
        solrTemplate.queryForObject(query, Location.class);

        // 3 paging
        query.setStart(page.getOffset());
        query.setRows(page.getPageSize()); */
return null;
    }
}
