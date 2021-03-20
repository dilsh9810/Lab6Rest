package com;


import model.Item;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.google.gson.*;

import org.jsoup.*;
import org.jsoup.parser.*;
import org.jsoup.nodes.Document;


@Path("/Items")


public class ItemService {

	Item item  = new Item();
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	
	public String readItems() {
		
		return "Hello";
		
	}
	

}
