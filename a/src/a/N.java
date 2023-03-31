package a;
import java.util.Arrays;
public class N {
	public static void main(String[] args) 
	   {
	      int [][] arry1 = {{1, 0, 2}, {-1, 3, 1}};
	      int [][] arry2 = {{3, 1}, {2, 1}, {1, 0}};
	      int [][] answer = new int[arry1.length][arry2[0].length];
	      
	      for(int i = 0; i < answer.length; i++){ 
	            for(int j = 0; j < answer[i].length; j++)
	            {
	                for(int k = 0; k < arry1[0].length; k++)
	                {
	                    answer[i][j] += arry1[i][k]*arry2[k][j];
	                
	                }
	            }
	        }
	      System.out.println(Arrays.deepToString(answer));
	   }
	}
