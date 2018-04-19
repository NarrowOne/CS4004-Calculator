package ie.Calc;

public class SimpCalc6 {
	public SimpCalc() {
		
	}
	public int add(int x, int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public int mult(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
	public int mod(int x, int y) {
		return x%y;
	}
	public int pow(int x, int y) {
		int z = 1;
		for(int i=0; i<y; i++)
			z = z*x;
		return z;
	}
}
