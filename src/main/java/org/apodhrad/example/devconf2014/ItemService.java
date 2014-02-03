package org.apodhrad.example.devconf2014;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/warehouse")
public interface ItemService {

	@GET
	@Path("/items/{itemId}")
	Item getItem(@PathParam("itemId") String itemId);
}
