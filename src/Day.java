import java.util.Scanner;

public class Day {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ĳ�����");
		int year =sc.nextInt();
		System.out.println("�������·�");
		int month=sc.nextInt();
		System.out.println("��������");
		int day=sc.nextInt();
	
		//����һ���·���31�������
		int [] m31 ={1,3,5,7,8,10,12};
		//����һ���·���31�������
		int [] m30 ={4,6,9,11};
		//ͳ��month��֮ǰ��������31����·ݵ�������
		int d1=0;
		for(int i=0;i<m31.length;i++){
			if(month>m31[i]){
				d1=d1+31;
			}
		}
		//ͳ��month�·�ǰ������ʱ30����·ݵ�������
		int d2=0;
		for(int i=0;i<m30.length;i++){
			if(month>m30[i]){
				d2=d2+30;
			}
		}
		//�ж�ƽ��������꣬ȷ��2����������
		int d3=0;
		if((year%4==0 && year%100!=0)||(year%400==0)){
			if(month>2){
				d3=29;
			}
		}else{
			if(month>2){
				d3=28;
			}
		}
		//��������Ǹ���ĵ�d��
		int d=d1+d2+d3+day;
		System.out.println(year+"��"+month+"��"+day+"����"+year+"��ĵ�"+d+"��");
	}

}
