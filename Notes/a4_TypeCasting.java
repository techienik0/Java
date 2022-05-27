			//Type Casting 
/*
	Widening Casting:	
		byte -> short -> char -> int -> long -> float -> double

	Narrowing Casting:
		double -> float -> long -> int -> char -> short -> byte		
*/


import java.lang.*;

class a4_TypeCasting{
	public static void main(String[] args){
		int a = 10;
		double b = a;				//Widening
		System.out.println("Int : "+a);
		System.out.println("Double : "+b);
		
		double c = 25.5385;
		int d = (int)c;				//Narrowing
		System.out.println("Double : "+c);
		System.out.println("Int : "+d);
}
}