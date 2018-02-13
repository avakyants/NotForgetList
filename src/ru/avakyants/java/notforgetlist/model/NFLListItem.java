package ru.avakyants.java.notforgetlist.model;

public class NFLListItem {
	
	private long id;
	private long listId;
	private String text;
	private NFLListItemStatus status = NFLListItemStatus.ACTIVE;
	
	public NFLListItem(long listId,String text) {
		this(0L,listId,text);
	}
	
	public NFLListItem(long id, long listId, String text) {
		this(id,listId,text,NFLListItemStatus.ACTIVE);
	}
	
	public NFLListItem(long id, long listId, String text, NFLListItemStatus status) {
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
	
	public NFLListItemStatus getStatus() {
		return status;
	}
	
	public void setStatus(NFLListItemStatus status) {
		this.status = status;
	}

	public long getListId() {
		return listId;
	}

	public void setListId(long listId) {
		this.listId = listId;
	}

}
