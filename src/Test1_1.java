
public class Test1_1 {
	public static void main(String[] args) {
		//1������һ������
		int [][] a =new int [7][];
		
		for(int i=0;i<a.length;i++){ //��ʾ��
			a[i]=new int [i+1];  //��ʾÿ�� ���ж��ٸ�����
			
			for(int j=0;j<=i;j++){ //��ʾ��
				if(i==j||j==0){ //����һ�� �Լ�����i�е�i�е����ָ���1���ֵ
					a[i][j]=1;
				}else{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
				//System.out.print(a[i][j]+"  "); //��ӡ���a[i][j]�������ֵ
			}
			//System.out.println();//����
		}
		//�Ե��������θ�ʽ��ӡ

		for(int i=0;i<a.length;i++){//��
			for(int j=i;j<a.length;j++){ 
				System.out.printf("%2c",'*');//ÿ�н��֮ǰ�Ŀո���
			}
			for(int h=0;h<=i;h++){//��ʾ��
				System.out.printf("%4d",a[i][h]);//���ÿ���ϱߵ�����
			}
			System.out.println();
		}
		
	}

}
