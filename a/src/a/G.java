package a;
import java.util.Scanner;
public class G {
	public static void main(String[]arg) {
		/*for (int i =0; i<1000000000; i++) {
			if (i==1000000000)
				break;
			System.out.println("Rule #"+i);
		}*/
//--------------------------------------------------------------------
		/*for (int i=0; i<100; i++) {
			if(i==50)
				continue;
			System.out.println("Rule #"+i);
		}*/
//=====================================================================
		for (int i=2; i<10;i++) {
			if(i==5) {
				System.out.print("\n");
				break;
			}
			for (int j=1;j<10;j++) {
				System.out.print(i+"*"+j + "=" + (i*j) + "\t");
			}
			System.out.print("\n");
		}
		int time ;
	      int d, h, m, s=60;
	      int d_s,h_s,m_s,s_s;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.printf("초를 입력해 주세요: ");
	      time = scan.nextInt();
	   
	      
	      s_s = time % 60;
	      m = time/s;
	      s_s = time % s;
	      h = m / 60;
	      m_s = m % 60;
	      d = h / 24;
	      h_s = h % 24;
	      d_s = d % 30;
	      
	      System.out.println(time+"초는 "+d+"일 "+h_s+"시 "+m_s+"분 "+s_s+"초 입니다.");
	}
}
