package com.integrant.recommendation.product.service;

import java.util.List;

import com.integrant.recommendation.product.dto.ProductCatalogDto;
import com.integrant.recommendation.product.model.ProductCatalog;

public interface ProductService {
	
	public String saveProductCatalog(ProductCatalogDto productCatalogDto);
	
	public List<ProductCatalog> findAllProductCatalogs();
	
	public ProductCatalog findProductCatalogs(String productCatalogId);
}
