package IntermediateOOPAssignments;

abstract class AbstractExample{
	abstract void TestMethod();
	
	void nonMethod() {
		System.out.println("This is non Abstract Method in abstract class");
	}
}
class Concrete extends AbstractExample{
	 void TestMethod() {
		 System.out.println("Abstract method implementation in Concrete class");
	 }
}
abstract class WithoutAbstractMethod{
	void nonMethod() {
		System.out.println("This is non Abstract Method in abstract class without any abstract method");
	}
}
public class TestAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Concrete c=new Concrete();
		c.TestMethod();
		
		
		
		

	}

}
