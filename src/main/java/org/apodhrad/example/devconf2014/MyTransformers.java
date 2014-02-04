package org.apodhrad.example.devconf2014;

import org.switchyard.annotations.Transformer;

public final class MyTransformers {

	@Transformer
	public Order transformStringToOrder(String from) {
		Order order = new Order();
		order.setItemId(from);
		order.setQuantity(1);
		return order;
	}

	@Transformer
	public String transformOrderAckToString(OrderAck from) {
		return from.toString();
	}

}
