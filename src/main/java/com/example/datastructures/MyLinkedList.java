package com.example.datastructures;

public class MyLinkedList<K> {

	private Node<K> head;
	private Node<K> lastNode;
	private int nodeCount;
	
	
	
	public MyLinkedList() {
		super();
		nodeCount = 0;
	}

	public void addNode(Node node){
		if (head == null){
			head = node;
			lastNode = head;
			nodeCount++;
		}else {
			lastNode.nextNode = node;
			nodeCount++;
			lastNode = node;
		}
	}
	
	public int getNodeCount(){
		return nodeCount;
	}
	
	public Node<K> getHead(){
		return head;
	}
	
	public Node<K> getTail(){
		return lastNode;
	}
	
	public Node removeNode(int indexBaseZero){
		Node currNode=head;
		int currIndex=0;
		Node beforeNode=null;
		Node afterNode=null;
		Node returnNode;
		
		while(currNode != null){
			if (indexBaseZero == 0 ){
				Node tmp = head.nextNode;
				returnNode = head;
				head = tmp;
				nodeCount--;
				return returnNode;
			}
			
			if (currIndex == (indexBaseZero - 1)){
				beforeNode = currNode;
			}
			
			if (currIndex == (indexBaseZero + 1)){
				afterNode = currNode;
			}
			
			
			if (beforeNode != null && afterNode != null){
				break;	
			}

			currNode = currNode.nextNode;
			currIndex++;
		}
		returnNode = beforeNode.nextNode;
		beforeNode.nextNode = afterNode;
		nodeCount--;
		return returnNode;
		
	}
	
	public void showAllNodes(){
		int i=0;
		Node currNode=head;
		while(currNode != null){
			System.out.println (currNode.nodeData);
			currNode = currNode.nextNode;
		}
	}
	
	class Node<K> {
		private Node nextNode;
		private K nodeData;
		public K getNodeData() {
			return nodeData;
		}
		public void setNodeData(K nodeData) {
			this.nodeData = nodeData;
		}
		
		
	}
	
}
