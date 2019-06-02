import java.util.Scanner;

public class Day {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入某个年份");
		int year =sc.nextInt();
		System.out.println("请输入月份");
		int month=sc.nextInt();
		System.out.println("请输入日");
		int day=sc.nextInt();
	
		//创建一个月份有31天的数组
		int [] m31 ={1,3,5,7,8,10,12};
		//创建一个月份有31天的数组
		int [] m30 ={4,6,9,11};
		//统计month月之前，满月有31天的月份的总天数
		int d1=0;
		for(int i=0;i<m31.length;i++){
			if(month>m31[i]){
				d1=d1+31;
			}
		}
		//统计month月份前，满月时30天的月份的总天数
		int d2=0;
		for(int i=0;i<m30.length;i++){
			if(month>m30[i]){
				d2=d2+30;
			}
		}
		//判断平年或者闰年，确定2月满月天数
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
		//求该日期是该年的第d天
		int d=d1+d2+d3+day;
		System.out.println(year+"年"+month+"月"+day+"日是"+year+"年的第"+d+"天");
	}

}
