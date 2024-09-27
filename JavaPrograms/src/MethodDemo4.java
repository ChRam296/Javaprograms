
public class MethodDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Start");
		func();
		System.out.println("Done");
}
static void funA(){
	System.out.println("funA of MethodDemo4");
	func();
}

static void funB(){
	System.out.println("funB of MethodDemo4");
	funA();
}
static void func(){
	System.out.println("func of MethodDemo4");
	funB();
}
}
	
