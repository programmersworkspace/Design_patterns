package singleton;

public class SingletontonProblem {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.newInstance();
		Singleton singleton2 = Singleton.newInstance();
		
		
		System.out.println("Single 1"+singleton1.hashCode());
		System.out.println("Single 2"+singleton2.hashCode());
	}

}
