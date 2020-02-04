package com.integrant.recommendation.product.dto;

import java.io.Serializable;
import java.util.List;

import com.integrant.recommendation.product.model.Product;

/**
 * The Class ProductCatalogDto.
 */
public class ProductCatalogDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The catalog name. */
	private String catalogName;
	
	/** The category name. */
	private String categoryName;
	
	/** The products. */
	private List<Product> products;

	/**
	 * Instantiates a new product catalog dto.
	 *
	 * @param catalogName the catalog name
	 * @param categoryName the category name
	 * @param products the products
	 */
	public ProductCatalogDto(String catalogName, String categoryName, List<Product> products) {
		this.catalogName = catalogName;
		this.categoryName = categoryName;
		this.products = products;
	}

	/**
	 * Gets the catalog name.
	 *
	 * @return the catalog name
	 */
	public String getCatalogName() {
		return catalogName;
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
		return "ProductCatalogDto [catalogName=" + catalogName + ", categoryName=" + categoryName + ", products="
				+ products + "]";
	}
}

