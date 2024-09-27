
public class MethodDemo1 {

	public static void main(String[] args) {
		
		System.out.println("main method of MethodDemo1");
		   //  MethodDemo1.func();
		}

		void funA(){                                  // instance method
			System.out.println("funA of MethodDemo1");
			funB();                           // I am trying to invoke or call funB() method in funA()
		}
		void funB(){                               // instance method
			System.out.println("funB of MethodDemo1");
			funA();                          //  I am trying to invoke or call funA() method in funB()
			}
		static void func(){                         // static method with method name 'func'. 
			                                        // This method can be called in main method 
			                                         // by using classname.method name.
			System.out.println("func of MethodDemo1");
		}
	}

