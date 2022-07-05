package com.qa.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample<T> {
	
	private T object;
	
	public void add(T object) {
		this.object = object;
	}
	
	public T get() {
		
		return object;
	}
	
	
	
	
	
	
	
	
	

//	private List<T> storage = new ArrayList<>();
//
//	public void addToStorage(T input) {
//
//		storage.add(input);
//	}
//
//	public T getFromStorage(int index) {
//
//		return storage.get(index);
//
//	}
}
