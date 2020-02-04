package com.integrant.recommendation.product.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrant.recommendation.product.dto.ProductCatalogDto;
import com.integrant.recommendation.product.model.ProductCatalog;
import com.integrant.recommendation.product.repository.ProductCatalogRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductCatalogRepository productCatalogRepository;
	
    /** The logger. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void saveProductCatalog(ProductCatalogDto productCatalogDto) {
		
		ProductCatalog productCatalog = new ProductCatalog().buildProductCatalog(productCatalogDto);
		
		productCatalogRepository.save(productCatalog);
	}
	
	public List<ProductCatalog> findAllProductCatalogs() {
		return productCatalogRepository.findAll();
	}
	
	public ProductCatalog findProductCatalogs(String productCatalogId) {
		return productCatalogRepository.findById(productCatalogId).orElse(null);
	}

}
