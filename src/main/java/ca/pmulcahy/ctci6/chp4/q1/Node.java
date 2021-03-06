package ca.pmulcahy.ctci6.chp4.q1;

import java.util.HashSet;
import java.util.Set;

public class Node<T> {
	private T data;
	private Set<Node<T>> children;
	public Node(T data) {
		this.data = data;
		this.children = new HashSet<Node<T>>();
	}
	
	public T getData() {
		return data;
	}
	
	public Set<Node<T>> getChildren() {
		return children;
	}
	
	public boolean addChild(Node<T> child) {
		return children.add(child);
	}
}