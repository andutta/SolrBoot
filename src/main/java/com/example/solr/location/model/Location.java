package com.example.solr.location.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Created by adutta on 9/1/2014.
 */
@SolrDocument(solrCoreName = "location")
public class Location {


/*
    <field name="id" type="string" indexed="true" stored="true"/>
    <field name="loc.id" type="string" indexed="true" stored="true"/>
    <field name="loc.pid" type="string" indexed="true" stored="true"/>
    <field name="loc.continent.id" type="string" indexed="true" stored="true"/>
    <field name="loc.georegion.id" type="string" indexed="true" stored="true"/>
    <field name="loc.country.id" type="string" indexed="true" stored="true"/>
    <field name="loc.country.code" type="prefix_token_latin" indexed="true" stored="true" multiValued="true"/>
    <field name="loc.country.code.exact" type="exact_token_latin" indexed="true" stored="true" multiValued="true"/>
    <field name="loc.state.id" type="string" indexed="true" stored="true"/>
    <field name="loc.state.code" type="prefix_token_latin" indexed="true" stored="true" multiValued="true"/>
    <field name="loc.state.code.exact" type="exact_token_latin" indexed="true" stored="true" multiValued="true"/>
    <field name="loc.metroarea.id" type="string" indexed="true" stored="true"/>
    <field name="loc.city.id" type="string" indexed="true" stored="true"/>
    <field name="loc.city.code" type="prefix_token_latin" indexed="true" stored="true" multiValued="true"/>
    <field name="loc.city.code.exact" type="exact_token_latin" indexed="true" stored="true" multiValued="true"/>
    <field name="loc.nbrhood.id" type="string" indexed="true" stored="true"/>
    <field name="loc.airport.code" type="prefix_token_latin" indexed="true" stored="true"/>
    <field name="loc.airport.code.exact" type="exact_token_latin" indexed="true" stored="true"/>
    <field name="loc.latitude" type="sfloat" indexed="true" stored="true"/>
    <field name="loc.longitude" type="sfloat" indexed="true" stored="true"/>
    <field name="loc.level" type="sint" indexed="true" stored="true"/>
    <field name="loc.plevel" type="string" indexed="true" stored="true"/>
    <field name="loc.locationName" type="string" indexed="true" stored="true"/>
    <field name="loc.code" type="prefix_token_latin" indexed="true" stored="true"/>
    <field name="loc.code.exact" type="exact_token_latin" indexed="true" stored="true"/>
    <field name="loc.haschild" type="boolean" indexed="true" stored="true" default="false"/>
    <field name="loc.hotelCount" type="integer" indexed="true" stored="true" default="0"/>
    <field name="loc.keyword" type="keyword_text" indexed="true" stored="true" multiValued="true"/>
    <field name="loc.keyword.disambiguate" type="keyword_text" indexed="true" stored="true" multiValued="true"/> */

    @Id
    private String id;
    @Field("loc.id")
    private String locId;
    @Field("loc.country.id")
    private String locCountryId;
    @Field("loc.country.code")
    private String locCountryCode;
    @Field("loc.state.id")
    private String locStateId;
    @Field("loc.state.code")
    private String locStateCode;
    @Field("loc.latitude")
    private Float locLatitude;
    @Field("loc.longitude")
    private Float locLongitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getLocCountryId() {
        return locCountryId;
    }

    public void setLocCountryId(String locCountryId) {
        this.locCountryId = locCountryId;
    }

    public String getLocCountryCode() {
        return locCountryCode;
    }

    public void setLocCountryCode(String locCountryCode) {
        this.locCountryCode = locCountryCode;
    }

    public String getLocStateId() {
        return locStateId;
    }

    public void setLocStateId(String locStateId) {
        this.locStateId = locStateId;
    }

    public String getLocStateCode() {
        return locStateCode;
    }

    public void setLocStateCode(String locStateCode) {
        this.locStateCode = locStateCode;
    }

    public Float getLocLatitude() {
        return locLatitude;
    }

    public void setLocLatitude(Float locLatitude) {
        this.locLatitude = locLatitude;
    }

    public Float getLocLongitude() {
        return locLongitude;
    }

    public void setLocLongitude(Float locLongitude) {
        this.locLongitude = locLongitude;
    }
}
