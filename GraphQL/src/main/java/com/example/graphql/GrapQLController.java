package com.example.graphql;

import com.example.graphql.model.Coach;
import com.example.graphql.model.FitnessClass;
import graphql.GraphQLContext;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphql")
public class GrapQLController {

    @PostMapping
    public List<FitnessClass> schedule(@Argument Coach coach,
                                       GraphQLContext context){


    }

}
