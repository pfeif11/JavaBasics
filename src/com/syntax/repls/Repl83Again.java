package com.syntax.repls;

public class Repl83Again {
	
		public static void main(String[] args){
		{
				int[][] a = {
					{1,1,2}, //sum = 4
					{3,1,2}, //sum = 6
					{3,5,3}, //sum = 11
					{0,1,2}  //sum = 3
				};
				
			int sums[]= new int[a.length];
			
			for(int x=0;x<a.length;x++) {
			  int rowTotal=0;
			  for(int y=0;y<a[x].length;y++) {
			    rowTotal=rowTotal+a[x][y];
			     
			    }
			    sums[x]=rowTotal;
			    
			    
			    
			    
			    
			  }
			  for (int sum:sums) {
			    System.out.println(sum);
			  }
			  
			 
			
			
			
			
			
			
		
		}
	}
	}


