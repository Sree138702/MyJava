package basicsofjava;

public class Forloop_Print10to1_average {
	public static void main(String[] args) {
		
	
 double sum=0;
 double average;
 for (int i=1;i<=10;i++) {
 System.out.println(i);
 sum+=i;
 }
 System.out.println("sum of 1-10 is:" +sum);
 average=sum/10;
 System.out.println("average of 1-10 is:" +average);
 
}
}