package com.example.graphql.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {

    private String id;
    private String title;
    private String userId;
    private String body;


    public static Post getById(String id, List<Post> list) {
        return list.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public static List<Post> getByIdUser(String idUser, List<Post> listPost) {
        List<Post> resutl = new ArrayList<>();
        for(Post post: listPost){
            if(post.getUserId().equals(idUser)){
                resutl.add(post);
            }
        }
        return resutl;
    }
}
