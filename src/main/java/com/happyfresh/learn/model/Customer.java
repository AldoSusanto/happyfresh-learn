package com.happyfresh.learn.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.annotation.Id;

//import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document(indexName= "customer-test")
public class Customer implements Serializable {

    @Id
    private String id;
    private String name;
    private String cardNumber;
    private String lastItemBought;
}
