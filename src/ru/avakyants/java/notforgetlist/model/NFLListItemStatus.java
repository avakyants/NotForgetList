package ru.avakyants.java.notforgetlist.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NFLListItemStatus {

	ACTIVE(1), COMPLETED(2), REJECTED(3), PENDING(4), EXPECTED(5);
	
	int value;
	
	NFLListItemStatus(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	private static Map<Integer, NFLListItemStatus> map = new HashMap<>();

    static {
        for (NFLListItemStatus status : NFLListItemStatus.values()) {
            map.put(status.value, status);
        }
    }
	
	@JsonCreator
    public static NFLListItemStatus forValue(int value) {
        return map.get(value);
    }

    @JsonValue
    public int toValue() {
        return this.value;
    }
	
}
