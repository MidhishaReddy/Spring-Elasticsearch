package com.onemore.onemore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="midhisha")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class customer {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private int age;

}
