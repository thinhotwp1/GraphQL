package com.example.graphql.service;

import com.example.graphql.model.Post;
import com.example.graphql.model.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FacebookService {
    RestTemplate restTemplate = new RestTemplate();

    public List<User> getListUser() throws Exception {

        String urlGetListUser = "https://jsonplaceholder.typicode.com/users";
        String response = restTemplate.getForEntity(urlGetListUser, String.class).getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> userList = objectMapper.readValue(response, new TypeReference<>() {});
//        System.out.println("userList: " + userList);
        return userList;
    }

    public List<Post> getListPost() throws Exception {
        String urlGetListUser = "https://jsonplaceholder.typicode.com/posts";
        String response = restTemplate.getForEntity(urlGetListUser, String.class).getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Post> postList = objectMapper.readValue(response, new TypeReference<>() {
        });
//        System.out.println("postList: " + postList);
        return postList;
    }
}
