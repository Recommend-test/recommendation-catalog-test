package com.integrant.recommendation.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.integrant.recommendation.product.model.ProductCatalog;

/**
 * The Interface ProductCatalogRepository.
 */
@Repository
public interface ProductCatalogRepository extends MongoRepository<ProductCatalog, String>{

}
