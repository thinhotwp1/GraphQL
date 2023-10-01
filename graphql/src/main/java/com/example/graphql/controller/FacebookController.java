package com.example.graphql.controller;

import com.example.graphql.model.Post;
import com.example.graphql.model.User;
import com.example.graphql.service.FacebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FacebookController {
    @Autowired
    FacebookService facebookService;

    @QueryMapping
    public User UserById(@Argument String id) throws Exception {
        return User.getById(id, facebookService.getListUser());
    }

    /**
     * Lưu ý khi sử dụng @SchemaMapping thì phải đặt đúng tên của trường cần nối, ở đây là posts ở trong schema cũng như
     * ở User model, nếu khác tên sẽ không mapping được dữ liệu.
     */
    @SchemaMapping
    public List<Post> posts(User user) throws Exception {
        return Post.getByIdUser(user.getId(), facebookService.getListPost());
    }

}
