package com.integrant.recommendation.product.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Field;

public class ProductSpecs implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Field("size")
	private String size;
	
	@Field("product_color")
	private String productColor;
	
	@Field("product_price")
	private String productPrice;
	
	@Field("image_url")
	private String imageUrl;

	public ProductSpecs(String size, String productColor, String productPrice, String imageUrl) {
		this.size = size;
		this.productColor = productColor;
		this.productPrice = productPrice;
		this.imageUrl = imageUrl;
	}

	public String getSize() {
		return size;
	}

	public String getProductColor() {
		return productColor;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	@Override
	public String toString() {
		return "ProductSpecs [size=" + size + ", productColor=" + productColor + ", productPrice=" + productPrice
				+ ", imageUrl=" + imageUrl + "]";
	}
}
