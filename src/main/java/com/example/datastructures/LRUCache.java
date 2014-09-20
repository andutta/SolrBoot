package com.example.datastructures;

import java.util.HashMap;

public class LRUCache {

	private HashMap<Integer, Integer> index;
	private MyQueue<String> lruQueue;
	private int lruSize;
	
	public LRUCache(int capacity){
		index = new HashMap<Integer, Integer>();
		lruQueue = new MyQueue<String>();
		lruSize = capacity;
	}
	
	public void addToCache(Integer key, String value){
		Integer position = searchIndex(key);
		
		if (position == null){
			lruQueue.push(value);
		}
		
		if (position != null){
			
		}
		
	}
	
	private Integer searchIndex(Integer key){
		return index.get(key);
	}
	
	
}
