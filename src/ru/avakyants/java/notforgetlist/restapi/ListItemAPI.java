package ru.avakyants.java.notforgetlist.restapi;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import ru.avakyants.java.notforgetlist.model.NFLListItem;
import ru.avakyants.java.notforgetlist.model.NFLListItemStatus;


@Path("/{listid}/items")
public class ListItemAPI {
	
	/*
	 * преобразует ответ из объекта в json
	 * 
	 * Объекты которые можно достать из запроса:
	 * UriInfo, Request, HttpHeaders, SecurityContext, Providers
	 * 
	 * */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<NFLListItem> sayPlainTextHello(@PathParam("listid") long listId, @QueryParam("key") String key, @Context UriInfo uriInfo){
		
		System.out.println("KEY is: "+key);
		//MultivaluedMap<String, String> queryParams = uriInfo.getQueryParameters();
		List<String> keys = uriInfo.getQueryParameters().get("key");
		keys.forEach(System.out::println);
		//.forEach((k,v)->System.out.println(k+":"+v));
		
		NFLListItem i1 = new NFLListItem(1L,listId,"Item 1");
		NFLListItem i2 = new NFLListItem(2L,listId,"Item 2",NFLListItemStatus.COMPLETED);
		NFLListItem i3 = new NFLListItem(3L,listId,"Item 3");
		NFLListItem i4 = new NFLListItem(4L,listId,"Item 4",NFLListItemStatus.EXPECTED);
		NFLListItem i5 = new NFLListItem(5L,listId,"Item 5");
		
		return List.of(i1,i2,i3,i4,i5);		
		
	}
	
}
