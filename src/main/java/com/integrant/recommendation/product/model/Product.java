package com.integrant.recommendation.product.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Field;

public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Field("_id")
	private String id;
	
	@Field("product_name")
	private String productName;
	
	@Field("description")
	private String productDescription;
	
	@Field("stock")
	private String productStock;
	
	@Field("specification")
	private ProductSpecs productSpecs;

	public Product(String productName, String productDescription, String productStock,
			ProductSpecs productSpecs) {
		this.id = UUID.randomUUID().toString();;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productStock = productStock;
		this.productSpecs = productSpecs;
	}

	public String getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public String getProductStock() {
		return productStock;
	}

	public ProductSpecs getProductSpecs() {
		return productSpecs;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", productStock=" + productStock + ", productSpecs=" + productSpecs + "]";
	}
}

