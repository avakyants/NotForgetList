package ru.avakyants.java.notforgetlist.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ListItemStatus {

	ACTIVE(1), COMPLETED(2), REJECTED(3), PENDING(4), EXPECTED(5);
	
	int value;
	
	ListItemStatus(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	private static Map<Integer, ListItemStatus> map = new HashMap<>();

    static {
        for (ListItemStatus status : ListItemStatus.values()) {
            map.put(status.value, status);
        }
    }
	
	@JsonCreator
    public static ListItemStatus forValue(int value) {
        return map.get(value);
    }

    @JsonValue
    public int toValue() {
        return this.value;
    }
	
}
