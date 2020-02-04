package com.integrant.recommendation.product.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * The Class Product.
 */
public class Product implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	@Field("_id")
	private String id;
	
	/** The product name. */
	@Field("product_name")
	private String productName;
	
	/** The product description. */
	@Field("description")
	private String productDescription;
	
	/** The product stock. */
	@Field("stock")
	private String productStock;
	
	/** The product specs. */
	@Field("specification")
	private ProductSpecs productSpecs;

	/**
	 * Instantiates a new product.
	 *
	 * @param productName the product name
	 * @param productDescription the product description
	 * @param productStock the product stock
	 * @param productSpecs the product specs
	 */
	public Product(String productName, String productDescription, String productStock,
			ProductSpecs productSpecs) {
		this.id = UUID.randomUUID().toString();;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productStock = productStock;
		this.productSpecs = productSpecs;
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
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Gets the product description.
	 *
	 * @return the product description
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * Gets the product stock.
	 *
	 * @return the product stock
	 */
	public String getProductStock() {
		return productStock;
	}

	/**
	 * Gets the product specs.
	 *
	 * @return the product specs
	 */
	public ProductSpecs getProductSpecs() {
		return productSpecs;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", productStock=" + productStock + ", productSpecs=" + productSpecs + "]";
	}
}

