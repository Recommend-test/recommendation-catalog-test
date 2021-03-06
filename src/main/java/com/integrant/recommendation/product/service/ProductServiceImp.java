package com.integrant.recommendation.product.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrant.recommendation.product.dto.ProductCatalogDto;
import com.integrant.recommendation.product.model.ProductCatalog;
import com.integrant.recommendation.product.repository.ProductCatalogRepository;

/**
 * The Class ProductService.
 */
@Service
public class ProductServiceImp implements ProductService{
	
	/** The product catalog repository. */
	@Autowired
	private ProductCatalogRepository productCatalogRepository;
	
    /** The logger. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * Save product catalog.
	 *
	 * @param productCatalogDto the product catalog dto
	 */
    @Override
	public String saveProductCatalog(ProductCatalogDto productCatalogDto) {
		
		ProductCatalog productCatalog = new ProductCatalog().buildProductCatalog(productCatalogDto);
		
		productCatalogRepository.save(productCatalog);
		
		return productCatalog.getId();
	}
	
	/**
	 * Find all product catalogs.
	 *
	 * @return the list
	 */
    @Override
	public List<ProductCatalog> findAllProductCatalogs() {
		return productCatalogRepository.findAll();
	}
	
	/**
	 * Find product catalogs.
	 *
	 * @param productCatalogId the product catalog id
	 * @return the product catalog
	 */
    @Override
	public ProductCatalog findProductCatalogs(String productCatalogId) {
		return productCatalogRepository.findById(productCatalogId).orElse(null);
	}

}
