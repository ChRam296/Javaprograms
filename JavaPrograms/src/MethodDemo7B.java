
public class MethodDemo7B {

	public static void main(String[] args) {
		System.out.println("Main Method of MethodsDemo7B");
		MethodDemo7B m1 = new MethodDemo7B();
		
		m1.funB();//m1.funA();
		MethodDemo7B m2 = new MethodDemo7B();
		m2.funB();
	    System.out.println("Done");
		}
	 
		void funA()
		{
			System.out.println("funA of MethodsDemo7B");
		}
		
		void funB()
		{
			System.out.println("funB of MethodsDemo7B");
			funA();//calling from function B current object.
		}
	}
