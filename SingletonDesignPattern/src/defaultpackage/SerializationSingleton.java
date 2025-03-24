package defaultpackage;

import java.io.Serializable;

public class SerializationSingleton implements Serializable{

	public static SerializationSingleton instance =null;
	
	private SerializationSingleton() {
		
	}
	
	public static SerializationSingleton getInstance() {
		
		if(instance == null) {
			instance = new SerializationSingleton();
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
}
