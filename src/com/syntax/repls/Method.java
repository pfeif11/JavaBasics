package com.syntax.repls;

public class Method {
	
	static int sum2D(int[][] a) {
	    int sum=0;
	    for(int i=0;i<a.length;i++) {
	      for(int j=0;j<a[i].length;j++) {
	        sum=sum+a[i][j];
	      }
	      
	    }
	    return sum;
	  }

}
