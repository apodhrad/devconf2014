package org.apodhrad.example.devconf2014;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(OrderService.class)
public class OrderServiceBean implements OrderService {

	@Inject @Reference
	private ItemService itemService;
	
	@Override
	public OrderAck submitOrder(Order order) {
		OrderAck orderAck = new OrderAck();
		orderAck.setStatus("NOK");
		
		Item item = itemService.getItem(order.getItemId());
		
		if(item.getItemId() != null) {
			orderAck.setStatus("OK");
			orderAck.setPrize(item.getPrize());
		}
		
		return orderAck;
	}

}
