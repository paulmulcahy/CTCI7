package ca.pmulcahy.ctci6.chp4.q1;

import java.util.HashSet;
import java.util.Set;

public class NodeWithParents<T> {
	private T data;
	private Set<NodeWithParents<T>> children;
	private Set<NodeWithParents<T>> parents;
	public NodeWithParents(T data) {
		this.data = data;
		this.children = new HashSet<NodeWithParents<T>>();
		this.parents = new HashSet<NodeWithParents<T>>();
	}
	
	public T getData() {
		return data;
	}
	
	public Set<NodeWithParents<T>> getChildren() {
		return children;
	}
	
	public Set<NodeWithParents<T>> getParents() {
		return parents;
	}
	
	public void addChild(NodeWithParents<T> child) {
		children.add(child);
		child.parents.add(this);
	}
}