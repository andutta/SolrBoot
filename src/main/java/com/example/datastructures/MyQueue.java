/**
 * 
 */
package com.example.datastructures;

import com.example.datastructures.MyLinkedList.Node;

/**
 * @author anshumandutta
 *
 */
public class MyQueue<V> {
	
	private MyLinkedList<V> queue;
	private V lastPushed;
	private V lastPoped;
	private int queueCount;
	
	public MyQueue(){
		queue = new MyLinkedList<V>();
	}
	
	public void push(V data){
		MyLinkedList<V>.Node<V> node = queue.new Node<V>();
		node.setNodeData(data);
		queue.addNode(node);
		this.lastPushed = data;
	}
	
	public V pop(){	
		MyLinkedList<V>.Node<V> node = queue.removeNode(queue.getNodeCount()-1);
		lastPoped = node.getNodeData();
		return lastPoped;
	}
	
	public V getLastPoped(){
		return lastPoped;
	}
	
	public V getLastPushed(){
		return lastPushed;
	}
	
	public void showAllQueueItems(){
		queue.showAllNodes();;
	}
	
	public int getQueueCount(){
		return queue.getNodeCount();
	}
	
	public static void main (String[] args){
		MyQueue<Integer> localQueue = new MyQueue<Integer>();
		
		localQueue.push(new Integer(10));
		localQueue.push(new Integer(20));
		localQueue.push(new Integer(30));
		localQueue.push(new Integer(40));
		localQueue.push(new Integer(50));
		
		localQueue.showAllQueueItems();
		System.out.println("====================");
		
		for(int i=localQueue.getQueueCount();i > 0;--i){
			localQueue.pop();
			localQueue.showAllQueueItems();
		}
		
		System.out.println(localQueue.getQueueCount());

	}
		
		
		/*
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		
		Integer i = new Integer(10);
		Integer j = new Integer(11);
		Integer k = new Integer(12);
		Integer l = new Integer(20);
		
		MyLinkedList<Integer>.Node<Integer> node = myLinkedList.new Node<Integer>();
		
		node.setNodeData(i);
		
		myLinkedList.addNode(node);
		
		node = myLinkedList.new Node<Integer>();
		node.setNodeData(j);
		
		myLinkedList.addNode(node);
		
		node = myLinkedList.new Node<Integer>();
		node.setNodeData(k);
		
		myLinkedList.addNode(node);
		
		node = myLinkedList.new Node<Integer>();
		node.setNodeData(l);
		
		myLinkedList.addNode(node);
		
		myLinkedList.showAllNodes();
		
		System.out.println("====================");
		
		myLinkedList.removeNode(3);
		
		myLinkedList.showAllNodes();
		
		
	}*/
	
	

}
