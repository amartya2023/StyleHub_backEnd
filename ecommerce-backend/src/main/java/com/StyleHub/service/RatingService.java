package com.StyleHub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StyleHub.exception.ProductException;
import com.StyleHub.model.Rating;
import com.StyleHub.model.User;
import com.StyleHub.request.RatingRequest;


public interface RatingService {
	
	public Rating createRating(RatingRequest req, User user) throws ProductException;
	public List<Rating> getProductRating(Long productId);

}
