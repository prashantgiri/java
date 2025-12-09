package com.technoviral.springbootmysql.controller;
import  com.technoviral.springbootmysql.model.User;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {

	@RequestMapping("/{userId}")
    public User getUsers(@PathVariable("userId") String userId) {
		return new User(id:userId, username:"Prashant", password:"123", firstName:"Prash", lastName:"Giri", roles : null);
        //UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId, UserRating.class);

//        return userRating.getRatings().stream()
//                .map(rating -> {
//                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
//                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
//                })
//                .collect(Collectors.toList());
		
		

    }
}
