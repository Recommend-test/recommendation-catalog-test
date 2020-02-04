package com.integrant.recommendation.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integrant.recommendation.product.dto.ProductCatalogDto;
import com.integrant.recommendation.product.model.ProductCatalog;
import com.integrant.recommendation.product.service.ProductService;

/**
 * The Class ProductCatalogController.
 */
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ProductCatalogController {
	
	/** The product service. */
	@Autowired
	private ProductService productService;
	
    /** The logger. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * Save new catalog.
	 *
	 * @param productCatalogDto the product catalog dto
	 */
	@PostMapping("/products")
	public void saveNewCatalog(@Validated @RequestBody ProductCatalogDto productCatalogDto) {
		
		productService.saveProductCatalog(productCatalogDto);
		
	}
	
	/**
	 * Gets the all catalogs.
	 *
	 * @return the all catalogs
	 */
	@GetMapping("/products")
	public List<ProductCatalog> getAllCatalogs() {
		
		return productService.findAllProductCatalogs();
	}
	
	/**
	 * Gets the all catalogs.
	 *
	 * @param id the id
	 * @return the all catalogs
	 */
	@GetMapping("/products/{id}")
	public ProductCatalog getAllCatalogs(@Validated @PathVariable String id) {
		
		return productService.findProductCatalogs(id);
	}
}
