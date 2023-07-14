import java.util.Scanner;
public class Recursive_func {
public int fibonacci(int n) {
	if(n<0) {
		return -1;
	}
	if(n==0||n==1) {
		return 0;
	}
	if(n==2) {
		return 1;
}
	else {
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
public int factorial(int n) {
	if(n<0) {
		return -1;
	}
	if(n==0||n==1) {
		return 1;
	}
	else {
		return n*factorial(n-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            Recursive_func obj=new Recursive_func();
            int num1;
            num1=sc.nextInt();
            System.out.println(obj.fibonacci(num1));
            System.out.println(obj.factorial(num1));
	}

}
