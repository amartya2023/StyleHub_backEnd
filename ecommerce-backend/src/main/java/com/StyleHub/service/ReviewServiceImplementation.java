package com.StyleHub.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.StyleHub.exception.ProductException;
import com.StyleHub.model.Product;
import com.StyleHub.model.Review;
import com.StyleHub.model.User;
import com.StyleHub.repository.ProductRepository;
import com.StyleHub.repository.ReviewRepository;
import com.StyleHub.request.ReviewRequest;

@Service
public class ReviewServiceImplementation implements ReviewService {
	
	private ReviewRepository reviewRepository;
	private ProductService productService;
	private ProductRepository productRepository;
	
	public ReviewServiceImplementation(ReviewRepository reviewRepository,
			ProductService productService,
			ProductRepository productRepository) {
		 this.reviewRepository=reviewRepository;
		 this.productService=productService;
		 this.productRepository=productRepository;
	}

	@Override
	public Review createReive(ReviewRequest req, User user) throws ProductException {
		 Product product=productService.findProductById(req.getProductId());
		 
		 Review review=new Review();
		 review.setUser(user);
		 review.setProduct(product);
		 review.setReview(req.getReview());
		 review.setCreatedAt(LocalDateTime.now());
		 
		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReview(Long productId) {
		return reviewRepository.getAllProductsReview(productId);
	}

}
