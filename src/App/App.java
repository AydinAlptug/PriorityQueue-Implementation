package App;
import PriorityQueue.*;

public class App {
	public static void main(String[]args) {
		
		IPriorityQueue<Item> priorityQueue = new PriorityLinkedQueue<Item>();
		priorityQueue.add(new Item("mno",1));
		priorityQueue.add(new Item("jkl",2));
		priorityQueue.add(new Item("ghi",3));
		priorityQueue.add(new Item("def",4));
		priorityQueue.add(new Item("abc",5));
		
		while(priorityQueue.getSize()>0) 
			System.out.println(priorityQueue.remove().toString());

	}
}
