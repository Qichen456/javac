
public class Test1_1 {
	public static void main(String[] args) {
		//1、创建一个数组
		int [][] a =new int [7][];
		
		for(int i=0;i<a.length;i++){ //表示行
			a[i]=new int [i+1];  //表示每行 中有多少个数字
			
			for(int j=0;j<=i;j++){ //表示列
				if(i==j||j==0){ //给第一列 以及，第i列第i行的数字赋予1这个值
					a[i][j]=1;
				}else{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
				//System.out.print(a[i][j]+"  "); //打印输出a[i][j]这个数的值
			}
			//System.out.println();//换行
		}
		//以等腰三角形格式打印

		for(int i=0;i<a.length;i++){//行
			for(int j=i;j<a.length;j++){ 
				System.out.printf("%2c",'*');//每行结果之前的空格数
			}
			for(int h=0;h<=i;h++){//表示列
				System.out.printf("%4d",a[i][h]);//输出每行上边的数字
			}
			System.out.println();
		}
		
	}

}
