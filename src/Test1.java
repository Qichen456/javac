
public class Test1 {
	public static void main(String[] args) {
		//1������һ������
		int n=7;
		int m=7;
		int [] [] a=new int [n][m];
		//2����ʼ������
		for(int i=0;i<a.length;i++){//��ӡ��һ�е����ֺͶԽ����ϵ�����
			a[i][i]=1;
			a[i][0]=1;
		}
		//3���������ĳ����Ԫ�ϵ���ֵ
		for(int i=2;i<a.length;i++){//��ʾ��
			for(int j=1;j<a.length;j++){  //��ʾ��
				a[i][j]=a[i-1][j-1]+a[i-1][j]; //��a[i][j]��ֵ
			}
		}
		//4����ӡ
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
