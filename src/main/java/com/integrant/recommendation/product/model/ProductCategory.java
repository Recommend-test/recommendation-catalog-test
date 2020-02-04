package com.integrant.recommendation.product.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * The Class ProductCategory.
 */
public class ProductCategory implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Field("_id")
	private String id;
	
	/** The category name. */
	@Field("category_name")
	private String categoryName;
	
	/** The products. */
	@Field("products")
	private List<Product> products;

	/**
	 * Instantiates a new product category.
	 *
	 * @param categoryName the category name
	 * @param products the products
	 */
	public ProductCategory(String categoryName, List<Product> products) {
		this.id = UUID.randomUUID().toString();
		this.categoryName = categoryName;
		this.products = products;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the category name.
	 *
	 * @return the category name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ProductCategory [id=" + id + ", categoryName=" + categoryName + ", products=" + products + "]";
	}
}



