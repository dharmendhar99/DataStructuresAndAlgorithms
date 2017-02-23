package org.dpathipati.com.datastructures.chapter1;

import java.util.Map;

public class Association implements Map.Entry {
	
	protected Object key;
	protected Object value;
	
	public Association(Object key) {
		this.key = key;
	}
	
	public Association(Object key, Object value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public Object getKey() {
		return this.key;
	}

	@Override
	public Object getValue() {
		return this.value;
	}

	@Override
	public Object setValue(Object value) {
		return this.value = value;
	}
	
	public boolean equals(Object other) {
		Association otherAssociation = (Association)other;
		if(this.key == otherAssociation.getKey()) {
			return true;
		}
	return false;
	}

}
