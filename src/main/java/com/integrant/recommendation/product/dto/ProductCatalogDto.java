package com.integrant.recommendation.product.dto;

import java.io.Serializable;
import java.util.List;

import com.integrant.recommendation.product.model.Product;

public class ProductCatalogDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String catalogName;
	
	private String categoryName;
	
	private List<Product> products;

	public ProductCatalogDto(String catalogName, String categoryName, List<Product> products) {
		this.catalogName = catalogName;
		this.categoryName = categoryName;
		this.products = products;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "ProductCatalogDto [catalogName=" + catalogName + ", categoryName=" + categoryName + ", products="
				+ products + "]";
	}
}

