package com.integrant.recommendation.product.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Field;

public class ProductCategory implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Field("_id")
	private String id;
	
	@Field("category_name")
	private String categoryName;
	
	@Field("products")
	private List<Product> products;

	public ProductCategory(String categoryName, List<Product> products) {
		this.id = UUID.randomUUID().toString();
		this.categoryName = categoryName;
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "ProductCategory [id=" + id + ", categoryName=" + categoryName + ", products=" + products + "]";
	}
}



