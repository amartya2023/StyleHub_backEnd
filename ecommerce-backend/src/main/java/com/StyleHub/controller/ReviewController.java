package com.StyleHub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StyleHub.exception.ProductException;
import com.StyleHub.exception.UserException;
import com.StyleHub.model.Review;
import com.StyleHub.model.User;
import com.StyleHub.request.ReviewRequest;
import com.StyleHub.service.ReviewService;
import com.StyleHub.service.UserService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<Review> createReviewReview(@RequestBody ReviewRequest req,
			@RequestHeader("Authorization")String jwt) throws UserException, ProductException{
		
		User user=userService.findUserProfileByJwt(jwt);
		
		Review review=reviewService.createReive(req, user);
		
		return new ResponseEntity<>(review, HttpStatus.CREATED);
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<List<Review>> getProductsReview(@PathVariable Long productId) throws UserException, ProductException {
		
		List<Review>reviews=reviewService.getAllReview(productId);
		return new ResponseEntity<>(reviews, HttpStatus.CREATED);
	}

}
