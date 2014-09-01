package com.example.solr.book;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@EnableSolrRepositories(basePackages = { "com.example.solr.book" }, multicoreSupport = true)
public class SolrConfig {
	
	  @Bean
	  public SolrServer solrServer() {
	    return new HttpSolrServer("http://localhost:8983/solr");
	  }


	  
	  
}
