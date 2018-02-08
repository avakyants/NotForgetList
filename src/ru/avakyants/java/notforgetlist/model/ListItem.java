package ru.avakyants.java.notforgetlist.model;

public class ListItem {
	
	private long id;
	private long listId;
	private String text;
	private ListItemStatus status = ListItemStatus.ACTIVE;
	
	public ListItem(long listId,String text) {
		this(0L,listId,text);
	}
	
	public ListItem(long id, long listId, String text) {
		this(id,listId,text,ListItemStatus.ACTIVE);
	}
	
	public ListItem(long id, long listId, String text, ListItemStatus status) {
		this.id = id;
		this.text = text;
		this.status = status;
		this.listId = listId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public ListItemStatus getStatus() {
		return status;
	}
	
	public void setStatus(ListItemStatus status) {
		this.status = status;
	}

	public long getListId() {
		return listId;
	}

	public void setListId(long listId) {
		this.listId = listId;
	}

}
