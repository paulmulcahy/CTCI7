package ca.pmulcahy.ctci6.chp4.q2;

/*
 * Given a sorted (increasing order) array with unique integer elements, write an algorithm  to create a binary search tree with minimal height
 *
 */
public class MinimalTreeInt {
	public static TreeNodeInt buildBinaryTree(int[] sortedUniques) {
		return buildBinaryTree(sortedUniques, 0, sortedUniques.length);
	}

	private static TreeNodeInt buildBinaryTree(int[] sortedUniques, int start, int end) {
		if(end - start > 1) {
			final int mid = (end + start) / 2;
			final TreeNodeInt parent = new TreeNodeInt(sortedUniques[mid]);
			parent.setLeft(buildBinaryTree(sortedUniques, start, mid));
			parent.setRight(buildBinaryTree(sortedUniques, mid + 1, end));
			return parent;
		} else if (end - start == 1) {
			return new TreeNodeInt(sortedUniques[start]);
		} else {
			return null;
		}
	}
}