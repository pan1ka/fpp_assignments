package Lab_10_2;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Rational my110num = new Rational(1, 10); 
		Rational my34num = new Rational(3, 4); 
		System.out.println("1/10 + 3/4 = " + my110num.add(my34num));
		
		Rational my2d3 = new Rational(2, 3); 
		Rational mym17d5 = new Rational(-17, 5); 
		Rational my1d3 = new Rational(1, 3);
		
		Rational f1 = my2d3.multiply(mym17d5).add(my1d3);
		Rational f2 = mym17d5.add(my1d3).multiply(my2d3);
		
		String result = "";
		if(f1.compareTo(f2)>0) {
			result = "is greater";
		}else if(f1.compareTo(f2)<0) {
			result = "is lower";
		} else result = "equals";
		
		
		
		System.out.println("f1=" +f1+ " f2="+f2);
		System.out.println("(2/3 * -17/5) + 1/3 " +result+ " 2/3 * (-17/5 + 1/3)");
	}

}
