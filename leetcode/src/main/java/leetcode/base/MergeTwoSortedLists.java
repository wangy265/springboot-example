package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeTwoSortedLists {
	
	private Node mergeTwoSortedListsSolution(Node node1,Node node2) {
		Node head = new Node(0);
		Node tempNode = head;
	    while (node1!=null&&node2!=null) {
			if(node1.val>node2.val) {
				tempNode.next = node2;
				node2 = node2.next;
			}else {
				tempNode.next = node1;
				node1 = node1.next;
			}
			tempNode = tempNode.next;
		}	
	    tempNode.next = node1 != null ? node1 : node2;
		return head.next;
	}
	
	
	
	public static void main(String[] args) {
		MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
		MergeTwoSortedLists.Node node2 = new MergeTwoSortedLists().new Node(1);
		MergeTwoSortedLists.Node node3 = new MergeTwoSortedLists().new Node(4);
		node2.next = node3;
		MergeTwoSortedLists.Node node1 = new MergeTwoSortedLists().new Node(2);
		MergeTwoSortedLists.Node node = mergeTwoSortedLists.mergeTwoSortedListsSolution(node1, node2);
		log.info("node = {}",node);
	}
	
	class Node{
		int val;
		Node next;
		Node(int x){
			val = x;
		}
		
		@Override
		public String toString() {
			StringBuilder value = new StringBuilder();
			value.append(val);
			Node tempNode  = this.next;
			while (tempNode!=null) {
				value.append(" -> ").append(tempNode.val);
				tempNode = tempNode.next;
			}
			return value.toString();
		}
	}

}
