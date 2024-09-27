
public class DataTypeCastingDemo1 {

public static void main(String[] args) {
		
		int a = 10;       //int: A 32-bit integer type.
		                   //float: A 32-bit floating-point type.
		
		float f1 = a;    //Converting an int to float is safe because float has enough range to 
		//include all possible values of int, even if it loses some precision.
		System.out.println(f1);
		
		long k = 3000;//long: A 64-bit integer type that can hold very large integer values.
		                  
		float f2 = k; //float: A 32-bit floating-point type that represents numbers with fractional parts.
		System.out.println(f2);
		
		double d1 = a;///int: A 32-bit signed integer.
		             ///double: A 64-bit floating-point type. double has sufficient precision to store all 
		             ///possible int values accurately, 
		              //and it can accommodate additional decimal places if needed.
		System.out.println(d1);
		
		
		
		double d2 = k; //long: A 64-bit integer type.
		               //double: A 64-bit floating-point type with greater precision than float.
		System.out.println(d2);
		
		
		double d3 = f1;//float: A 32-bit floating-point type.
		                //double: A 64-bit floating-point type.
		
		System.out.println(d3);
		
		
		

	}

}