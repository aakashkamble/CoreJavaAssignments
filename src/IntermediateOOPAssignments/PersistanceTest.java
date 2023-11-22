package IntermediateOOPAssignments;

abstract class Persistance{
	abstract void persist();
}
class FilePersistance extends Persistance{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		System.out.println("Data Saved to File");
	}
	 
}
class DatabasePersistance extends Persistance{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		System.out.println("Data Saved to Database");
	}
	
}
public class PersistanceTest {
	
	public static Persistance getPersistence() {
		if(Math.random()<0.5) {
			return new FilePersistance();
		}
		else {
			return new DatabasePersistance();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistance persistance=getPersistence();
		persistance.persist();
		

	}

}
