import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int a=sc.nextInt();
		System.out.println("请输入第二个数字");
		int b=sc.nextInt();
		System.out.println("请输入第三个数字");
		int c=sc.nextInt();
		
		int m1=a>b?a:b;
		int max=m1>c?m1:c;
		System.out.println("最大值为"+max);
		
		//int m2=a<b?a:b;
		//int min=c<m2?c:m2;
		int min=c<(a<b?a:b)?c:(a<b?a:b);
		System.out.println("最小值为"+min);
	}

}
