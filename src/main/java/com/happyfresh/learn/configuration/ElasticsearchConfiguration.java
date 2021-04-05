package com.happyfresh.learn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


// README: For some reason, this configuration is not needed anymore with 4.0.0 release

//@Configuration
//@EnableElasticsearchRepositories
//public class ElasticsearchConfiguration {
//
//    @Bean
//    public RestHighLevelClient client() {
//        ClientConfiguration clientConfiguration
//                = ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//
//    @Bean
//    public ElasticsearchOperations elasticsearchTemplate() {
//        return new ElasticsearchRestTemplate(client());
//    }
//}