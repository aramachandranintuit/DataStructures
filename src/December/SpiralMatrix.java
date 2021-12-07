package December;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args)
	{
		int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> list = spiralOrder(a);
		System.out.println(list);
	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> ans = new ArrayList<Integer>();
	        int r1=0;
	        int r2=matrix.length-1;
	        int c1=0;
	        int c2=matrix[0].length-1;
	        while(r1<=r2 && c1<=c2)
	        {
	            for(int c=c1;c<=c2;c++) ans.add(matrix[r1][c]);
	            for(int r=r1+1;r<=r2;r++) ans.add(matrix[r][c2]);
	            if(r1<r2 && c1<c2)
	            {
	                for(int c=c2-1;c>c1;c--) ans.add(matrix[r2][c]);
	                for(int r=r2;r>r1;r--) ans.add(matrix[r][c1]);
	            }
	            r1++;
	            r2--;
	            c1++;
	            c2--;
	        }
	        return ans;
	        
	}
	
}
