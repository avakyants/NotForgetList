package ru.avakyants.java.notforgetlist.restapi;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.avakyants.java.notforgetlist.model.ListItem;
import ru.avakyants.java.notforgetlist.model.ListItemStatus;


@Path("/{listid}/items")
public class ListItemAPI {
	
	/*
	 * преобразует ответ из объекта в json
	 * */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ListItem> sayPlainTextHello(@PathParam("listid") long listId){
		
		ListItem i1 = new ListItem(1L,listId,"Item 1");
		ListItem i2 = new ListItem(2L,listId,"Item 2",ListItemStatus.COMPLETED);
		ListItem i3 = new ListItem(3L,listId,"Item 3");
		ListItem i4 = new ListItem(4L,listId,"Item 4",ListItemStatus.EXPECTED);
		ListItem i5 = new ListItem(5L,listId,"Item 5");
		
		return List.of(i1,i2,i3,i4,i5);		
		
	}
	
}
