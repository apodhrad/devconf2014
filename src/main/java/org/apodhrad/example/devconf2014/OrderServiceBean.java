package org.apodhrad.example.devconf2014;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(OrderService.class)
public class OrderServiceBean implements OrderService {

	@Inject
	@Reference
	private ItemService itemService;

	@Override
	public OrderAck submitOrder(Order order) {
		OrderAck orderAck = new OrderAck();
		orderAck.setStatus("NOK");

		Item item = itemService.getItem(order.getItemId());

		if (item.getQuantity() >= order.getQuantity()) {
			orderAck.setStatus("OK");
			orderAck.setPrize(getPrize(item.getItemId()) * order.getQuantity());
		}

		return orderAck;
	}

	public double getPrize(String itemId) {
		if ("ITEM001".equals(itemId)) {
			return 100.0;
		}
		if ("ITEM002".equals(itemId)) {
			return 200.0;
		}
		if ("ITEM003".equals(itemId)) {
			return 300.0;
		}
		return 0.0;
	}

}
