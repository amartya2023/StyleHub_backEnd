package com.StyleHub.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.StyleHub.exception.ProductException;
import com.StyleHub.model.Product;
import com.StyleHub.model.Rating;
import com.StyleHub.model.User;
import com.StyleHub.repository.RatingRepository;
import com.StyleHub.request.RatingRequest;

@Service
public class RatingServiceImplementation implements RatingService {
	
	private RatingRepository ratingRepository;
	private ProductService productService;
	
	public RatingServiceImplementation(RatingRepository ratingRepository,
			ProductService productService) {
		 this.ratingRepository=ratingRepository;
		 this.productService=productService;
	}

	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		 Product product=productService.findProductById(req.getProductId());
		 
		 Rating rating=new Rating();
		 rating.setProduct(product);
		 rating.setUser(user);
		 rating.setRating(req.getRating());
		 rating.setCreatedAt(LocalDateTime.now());
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductRating(Long productId) {
		return ratingRepository.getAllProductsRating(productId);
	}

}
