package Algoritimo;

public class fibonacci {

	public static void main(String[] args) {
		 double s=0;
	     double  n=0;
	     double n1=1;
	     System.out.println(n);
	     System.out.println(n1);
	      for(int i=0;i<=100;i++) {
	    	  s=n+n1;
	    	  System.out.println(s);
	          n=n1;
	          n1=s;
	      }
	}
}
