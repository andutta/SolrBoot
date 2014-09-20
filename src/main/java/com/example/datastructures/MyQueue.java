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
	
	protected MyLinkedList<V> queue;
	private V lastPushed;
	protected V lastPoped;
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
		
}
