package GenericsAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Double> map=new HashMap<>();
		Random r=new Random();
		for(int i=0;i<10;i++) {
			int key=r.nextInt();
			double value=r.nextDouble();
			
			map.put(key, value);
		}
		for(Map.Entry<Integer, Double> entry:map.entrySet()) {
			System.out.println("Key is: "+ entry.getKey()+ "Value is: "+entry.getValue());
		}
	}

}
