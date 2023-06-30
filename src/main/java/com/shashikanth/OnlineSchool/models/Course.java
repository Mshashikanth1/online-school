package com.shashikanth.OnlineSchool.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String teacher;
}
