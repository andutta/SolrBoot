package com.example.solr.location.web;

import com.example.solr.book.model.Book;
import com.example.solr.location.model.Location;
import com.example.solr.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by adutta on 9/1/2014.
 */
@RestController
@Scope("prototype")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value="/loc/search", produces="application/json")
    public List<Location> search(@RequestParam String id){
        System.out.println(locationService.toString());
        return locationService.findById(id);
        //return new ArrayList<Book>();
    }
}
