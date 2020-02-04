package com.integrant.recommendation.product.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.integrant.recommendation.product.dto.ProductCatalogDto;

@Document("product_catalogs")
public class ProductCatalog implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Field("_id")
	private String id;
	
	@Field("catalog_name")
	private String catalogName;
	
	@Field("categories")
	private List<ProductCategory> categories;

	
	public ProductCatalog() {
	}

	public ProductCatalog(String catalogName, List<ProductCategory> categories) {
		this.id = UUID.randomUUID().toString();
		this.catalogName = catalogName;
		this.categories = categories;
	}

	public String getId() {
		return id;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public List<ProductCategory> getCategories() {
		return categories;
	}
	
	public ProductCatalog buildProductCatalog(ProductCatalogDto productCatalogDto) {
		
		List<ProductCategory> categories = new ArrayList<ProductCategory>();
		
		ProductCategory productCategory = new ProductCategory(productCatalogDto.getCategoryName(), productCatalogDto.getProducts());
		
		categories.add(productCategory);
		
		return new ProductCatalog(productCatalogDto.getCatalogName(), categories);
		
	}

	@Override
	public String toString() {
		return "ProductCatalog [id=" + id + ", catalogName=" + catalogName + ", categories=" + categories + "]";
	}
}

