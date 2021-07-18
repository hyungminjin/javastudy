package ch13;

public class BitTest {

	public static void main(String[] args) {
		
		int num1 = 5; // 00000101
		int num2 = 10; // 00001010
		
		System.out.println(num1 | num2); // 00001111 => 15
		System.out.println(num1 & num2); // 00000000 => 0
		System.out.println(num1 ^ num2); // 00001111 => 15
		System.out.println(~num1); // 11111010 => -6
		
		System.out.println(num1 << 2); // 00010100 => 20
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
		

	}

}
