
public class Calculator {
	
	public static void main(String[] args) {
		
		byte x = 127;
		short y = 10000;
		int z = 100000000;
		float m = 2234.2354f;
		
		System.out.println(x+y+z+m);
		
		String f = "Omar";
		System.out.println(f.toUpperCase());
		
		String str2 = "Omar Malik";
		int start = str2.indexOf("Malik");
		System.out.println(start);
		
		int l = str2.length();
		System.out.println(l);
		String str = new String ("Omar");
		
		String cd = str2.toUpperCase();
		System.out.println(cd);
		
		String bc = str.substring(2,4);
		System.out.println(bc);
		Calculator calc = new Calculator();
		double xy = calc.add(5.5, 10);
		System.out.println(xy);
		
		
	}
	public double add (double a, double b){
		
		double sum = a + b; 
		return sum;
	}
	

}
