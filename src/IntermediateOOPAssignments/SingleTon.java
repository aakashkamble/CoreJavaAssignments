package IntermediateOOPAssignments;

public class SingleTon {
	 private static SingleTon single_instance = null;
	 
	   
	    public String s;
	    private SingleTon()
	    {
	        s = "Hello I am a string part of Singleton class";
	    }
		   
	    public static synchronized SingleTon getInstance()
	    {
	        if (single_instance == null)
	            single_instance = new SingleTon();
	 
	        return single_instance;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SingleTon x = SingleTon.getInstance();
		 System.out.println("Hashcode of x is "
                 + x.hashCode());
		
		
	}

}
