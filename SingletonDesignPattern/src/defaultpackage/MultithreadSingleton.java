package defaultpackage;

public class MultithreadSingleton {

	// In lazy singleton, when two or more threads access the app at the same time,  there's a chance to create multiple objects
	// So the class has to be sychronized
	
	private static MultithreadSingleton instance = null;
	
	private MultithreadSingleton() {
		
	}
	
	public static MultithreadSingleton getInstance() {
		
		if(instance == null) {
			
			synchronized (MultithreadSingleton.class) {
			
				//Reason for second null check is lets say two object are come inside first null at same time
                // One call has taken lock and proceeds for creating object first time. Now once lock is released for 
				if(instance == null) {
					instance  = new MultithreadSingleton();
				}
			}
		}
		return instance;
	}
	
	
}
