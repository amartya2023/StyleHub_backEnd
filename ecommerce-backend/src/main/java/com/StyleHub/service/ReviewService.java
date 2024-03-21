package com.StyleHub.service;

import java.util.List;

import com.StyleHub.exception.ProductException;
import com.StyleHub.model.Review;
import com.StyleHub.model.User;
import com.StyleHub.request.ReviewRequest;

public interface ReviewService {
	
	public Review createReive(ReviewRequest req, User user) throws ProductException;
	public List<Review> getAllReview(Long productId);

}
