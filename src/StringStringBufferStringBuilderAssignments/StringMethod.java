package StringStringBufferStringBuilderAssignments;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		
		String lower=str.toLowerCase();
		System.out.println(lower);
		
		String upper=str.toUpperCase();
		System.out.println(upper);
		
		String replace=str.replace("a", "$");
		System.out.println(replace);
		
		if(str.contains("collection")) {
			System.out.println(str);
			
		}
		boolean match=str.matches("Java String pool refers to collection of Strings which are stored in heap memory");
		System.out.println(match);
		
		String str1="Java String pool refers to collection of Strings which are stored in heap memory";
		if(str.equals(str1)) {
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}

	}

}
