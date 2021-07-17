package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10; 
		int bNum = 0B1010;  /*0B는 2진수를 뜻한다. 따라서 0B1010은 10진수 10을 뜻한다. */
		int oNum = 012; /* oNum은 8진수를 뜻한다. 맨앞에 0을 넣는다. 따라서 8진수 012는 10진수 10. */
		int xNum = 0XA; /* xNum은 10진수를 뜻한다. */
		/* 참고로 0B와 0X에서 B와 X는 소문자로 써도 된다. */
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}


/* package 이름은 무조건 소문자로 쓴다. class 이름은 무조건 대문자로 쓴다. */
/* 숫자 문자 문자열 : 리터럴 */