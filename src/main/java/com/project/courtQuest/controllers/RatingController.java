package com.project.courtQuest.controllers;

import com.project.courtQuest.entities.Rating;
import com.project.courtQuest.services.RatingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public Rating rateUser(@RequestParam Long ratingUserId, @RequestParam Long ratedUserId, @RequestParam Double rating) {
        return ratingService.rateUser(ratingUserId, ratedUserId, rating);
    }

    @GetMapping("/user/{userId}")
    public List<Rating> getRatingsForUser(@PathVariable Long userId) {
        return ratingService.getRatingsForUser(userId);
    }
}

