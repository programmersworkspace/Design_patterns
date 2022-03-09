package singleton;

//problem  of singleton of serialaization, reflection  and thread safe

// there are two type of implemetation lazy and eager

public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton newInstance() {
		if (instance == null) {
			instance = new Singleton();// instance will be created at request time
		} 
		return instance;
	}

}
