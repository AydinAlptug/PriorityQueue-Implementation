package App;

public class Item implements Comparable<Object>{
	private String name;
	private int priority;	//lower number means higher priority
	
	public Item(String name,int priority) {
		this.name = name;
		this.priority = priority;
	}

	@Override
	public int compareTo(Object o) {
		if(o == null)
			throw new NullPointerException();
		if(o.getClass() != Item.class) 
			throw new IllegalArgumentException();
		else {
			if(this.getPriority()<((Item) o).getPriority())
				return -1;
			if(this.getPriority()==((Item) o).getPriority())
				return 0;
			else
				return 1;
		}	
	}

	private int getPriority() {
		return priority;
	}
	public String toString() {
		return "Name: "+name+" Priority: "+priority;
	}
}
