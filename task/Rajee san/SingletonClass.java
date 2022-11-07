package day4;

public class SingletonClass {
	 private static SingletonClass sample=new SingletonClass();

	public static  SingletonClass getInstance()
	{
		return sample;
	}
	
	private SingletonClass() {
		
	}
public static void main(String[] args) {
	   
	SingletonClass sample1=SingletonClass.getInstance();
	}  

}
