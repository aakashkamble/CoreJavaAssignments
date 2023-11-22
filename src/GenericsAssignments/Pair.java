package GenericsAssignments;

import java.util.Date;

public class Pair<K,V> {
	
	private K key;
	private V value;
	private Date date;
	
	
	
	
	public Date getDate() {
		return date;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void setKey(K key) {
		if(key instanceof String) {
			this.key=key;
			
		}
		else
		{
			System.out.println("Invalid Key");
		}
		
	}
	public void setValue(V value) {
		if(value instanceof String) {
			this.value=value;
			
		}
		else
		{
			System.out.println("Invalid Value");
		}
		
	}
	public void setValue(Date date) {
		// TODO Auto-generated method stub
		if(date instanceof Date) {
			this.date=date;
			
		}
		else
		{
			System.out.println("Invalid Date");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, String> pair=new Pair<>();
		pair.setKey("1");
		pair.setValue("Hello");
		System.out.println("Scenario a: Key - "+pair.getKey()+ " Value- "+pair.getValue());
		
		Pair<String, String> pair1=new Pair<>();
		pair1.setKey("Today is");
		pair1.setValue(new java.util.Date());
		
		System.out.println("Scenario a: Key - "+pair1.getKey()+  "  Value- "+pair1.getDate());
		
		
		

	}
	

}
