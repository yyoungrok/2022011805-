package a;
import java.util.Scanner;
public class H {
	public static void main(String[]arg) {
		  int time ;
	      int d, h, m;
	      int s=60;
	      int d_s, h_s, m_s, s_s;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.printf("초를 입력: ");
	      time = scan.nextInt();
	   
	      
	      s_s = time % 60;
	      m = time/s;
	      s_s = time % s;
	      h = m / 60;
	      m_s = m % 60;
	      d = h / 24;
	      h_s = h % 24;
	      d_s = d % 30;
	      
	      System.out.println(time+"초: "+d+"일 "+h_s+"시 "+m_s+"분 "+s_s+"초");
		
	}

}
