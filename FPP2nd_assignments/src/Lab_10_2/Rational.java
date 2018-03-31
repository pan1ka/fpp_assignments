package Lab_10_2;

public class Rational {
	public Rational (int p, int q)  throws Exception {
		if(q<1)
			throw new IllegalStateException("Problem with denominator<1 " + q);
		
		this.num = p;
		this.den = q;
		reShort();
	}
	private int num;
	private int den;
	
	
	//adds the rational rat to this Rational
	public Rational add(Rational rat) {
		num =rat.getNum()*den + num*rat.getDen() ;
		den =rat.getDen()*den;
		
		reShort();
		return this;
	}
	
	//multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		num *= rat.getNum();
		den *= rat.getDen();
		reShort();
		
		return this;
	}
	
	public void reShort() {
		for(int i = 10; i>1; i--) {
			if((num%i==0)&&(den%i==0)) {
				den = den/i;
				num = num/i;
				return;
			}
		}
	}
	
	//returns –1 if this rational is less than rat
	//returns 0 if this rational equals (see equals
	// method discussion below) rat
	//returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		return den*rat.getNum() - num*rat.getDen();
	}
	
	//Mutators and accessors for numerator and denominator
	public int getNum() {
		return num;
	}
	public void setNum(int p) {
		this.num = p;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int q) {
		this.den = q;
	}
	
	public String toString() {
		return getNum() +"/"+ getDen();
	}
}
