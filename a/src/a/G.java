package a;

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
	}
}
