package com.sau.groups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
GET /groups
GET /groups/{id}
POST /groups
PUT /groups/{id}
DELETE /groups/{id}
*/

@SpringBootApplication
public class GroupsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroupsApplication.class, args);
    }

}