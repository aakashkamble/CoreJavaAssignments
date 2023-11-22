package ExceptionHandlingAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnSupportedOperationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String array[] = {"a", "b", "c"};
	        List<String> list = Arrays.asList(array);

	        List<String> arraylist = new ArrayList<>(list);

	        arraylist.add("d");

	        System.out.println(arraylist);

	}

}
