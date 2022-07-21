package com.liujinhang.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Entity
@Document(collection = "Book")
public class Book {

    // ”_id“
    @Id
    @Getter @Setter private Long id;


    @Getter @Setter
    private String name;

}
