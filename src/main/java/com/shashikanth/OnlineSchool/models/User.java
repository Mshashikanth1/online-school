package com.shashikanth.OnlineSchool.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String email;
    private String handle;
}
