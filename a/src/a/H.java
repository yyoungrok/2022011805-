package a;
import java.util.Scanner;
public class H {
	public static void main(String[]arg) {
		  int time ;
	      int d, h, m;
	      int s=60;
	      int dd, hh, mm, ss;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.printf("초를 입력: ");
	      time = scan.nextInt();
	   
	      
	      ss = time % 60;
	      m = time/s;
	      ss = time % s;
	      h = m / 60;
	      mm = m % 60;
	      d = h / 24;
	      hh = h % 24;
	      dd = d % 30;
	      
	      System.out.println(time+"초: "+d+"일 "+hh+"시 "+mm+"분 "+ss+"초");
		
	}

}
