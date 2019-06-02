
public class Test1 {
	public static void main(String[] args) {
		//1、定义一个数组
		int n=7;
		int m=7;
		int [] [] a=new int [n][m];
		//2、初始化数组
		for(int i=0;i<a.length;i++){//打印第一列的数字和对角线上的数字
			a[i][i]=1;
			a[i][0]=1;
		}
		//3、计算具体某个单元上的数值
		for(int i=2;i<a.length;i++){//表示行
			for(int j=1;j<a.length;j++){  //表示列
				a[i][j]=a[i-1][j-1]+a[i-1][j]; //求a[i][j]的值
			}
		}
		//4、打印
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
