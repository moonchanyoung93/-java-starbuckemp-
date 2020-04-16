package test;

public class QuadraticEq {

	public static void main(String[] args) {
		//x2 -3x+2=0
		
		double x , b, c;
		b= -3.0;
		c= 2.0;
		
		double disc, sqr;
		disc = b*b-4.0*c;
		sqr = Math.sqrt(disc);
		
		double r1,r2;
		r1= (-b+sqr) / 2.0;
		r2= (-b-sqr) /2.0;
		
		System.out.println(r1);
		System.out.println(r2);
		
	}

}
