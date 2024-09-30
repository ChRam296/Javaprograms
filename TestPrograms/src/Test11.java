
public class Test11 {
	int i = 10;

	public static void main(String[] args) {
		Test11 t1 = new Test11();
		t1.funA();
		System.out.println(t1.i);
	}
	void funA()
	{
		System.out.println(i);
		i = 5;
	}

}
