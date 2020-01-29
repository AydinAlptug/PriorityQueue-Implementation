package PriorityQueue;
import java.util.NoSuchElementException;

public class PriorityLinkedQueue<T extends Comparable<? super T>> implements IPriorityQueue<T> {
	
	private Node firstNode;
	private Node lastNode;
	private int length;
	
	
	public PriorityLinkedQueue() {
		firstNode=null;
		lastNode=null;
		length=0;
		
	}
	public T last() {
		return lastNode.data;
	}
	
	
	public void add(T newEntry) {
		Node newNode = new Node(newEntry);
        Node previous = null;
        Node current = firstNode;
        if(newEntry != null) {
        while (current != null && newEntry.compareTo(current.data)<0) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            newNode.next = firstNode;
            firstNode = newNode;
        }

        else {
            previous.next = newNode;
            newNode.next = current;
        }
      length++;
        }
        
        else 
        	throw new IllegalArgumentException();
	}			

	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void clear() {
		firstNode=null;
		lastNode=null;
		length=0;
	}
	public int getSize() {
		return length;
	}
	
private class Node {
		
		private T data;
		private Node next;
		
		private Node(T dataPortion) {
			this(dataPortion,null);
		}
		private Node(T dataPortion, Node nextNode) {
			this.data = dataPortion;
			this.next = nextNode;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNextNode() {
			return next;
		}
		public void setNextNode(Node next) {
			this.next = next;
		}
	}

public T remove() {
	T result = null;
	if(firstNode != null) {
		result = firstNode.getData();
		firstNode = firstNode.next;
		length--;
	}

    return result;
}

	public void display() {
		Node current = firstNode;
		while(current != null) {
			System.out.println(current.data);
			current=current.next;
			}
	}


	public T peek() {
	if(isEmpty()) 
		throw new NoSuchElementException("Empty queue.");
	return firstNode.getData();
	}
	
	
	
	public String[] toArray(){
		int index = 0;
		String[] array = new String[5];
		Node temp = firstNode;
		
		while(temp != null) {
			array[index]= temp.data.toString();
			index++;
			temp = temp.next;
		}
		return array;
	}
	

}