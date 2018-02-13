package ru.avakyants.java.notforgetlist.model;

import java.util.List;

public class NFLList {
	private long id;
	private String title;
	private NFLUser user;
	private List<NFLListItem> items;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public NFLUser getUser() {
		return user;
	}
	public void setUser(NFLUser user) {
		this.user = user;
	}
	public List<NFLListItem> getItems() {
		return items;
	}
	public void setItems(List<NFLListItem> items) {
		this.items = items;
	}
	
}
