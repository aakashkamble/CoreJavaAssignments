package StringStringBufferStringBuilderAssignments;

public class StringBuilder {

	public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

	public StringBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//append String
		StringBuilder stringBuffer=new StringBuilder();
		stringBuffer.append("StringBuffer");
		stringBuffer.append("is a peer class of String");
		stringBuffer.append("that provides much of");
		stringBuffer.append("the functionality of strings");
		System.out.println("Appended String: "+stringBuffer.toString());
		
		
		//insert String
		int insert="It is used to at the specified index position".indexOf("at");
		stringBuffer.insert(insert,"insert text");
		
		System.out.println("Insertion: "+stringBuffer.toString());
		
		// Reverse String
		stringBuffer=new StringBuilder("This is method returns the reverse object on which it was called using StringBuffer Class");
		stringBuffer.reverse();
		
		System.out.println("Reverse String: "+stringBuffer.toString());
		

	}

	private void reverse() {
		// TODO Auto-generated method stub
		
	}

	private void insert(int insert, String string) {
		// TODO Auto-generated method stub
		
	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}

}
