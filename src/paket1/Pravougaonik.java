package paket1;

public class Pravougaonik {
	private double a,b;
	public Pravougaonik() {
		this.a=2;
		this.b=2;
	}
	public Pravougaonik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Pravougaonik(Pravougaonik p) {
		this.a = p.a;
		this.b = p.b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getO() {
		return 2*this.a+2*this.b;
	}
	public double getP() {
		return this.a*this.b;
	}
}

