package org.apodhrad.example.devconf2014;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {

	private String itemId;
	private int quantity;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
