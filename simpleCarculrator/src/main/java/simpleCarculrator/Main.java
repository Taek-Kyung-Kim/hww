package simpleCarculrator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCarculrator calc = new SimpleCarculrator();
		calc.add(10, 20);
		System.out.println(calc.getResult());
		SimpleCarculrator calc1 = new SimpleCarculrator();
		calc1.sub(10, 20);
		System.out.println(calc1.getResult());
		SimpleCarculrator calc2 = new SimpleCarculrator();
		calc2.inc(10);
		System.out.println(calc2.getResult());
		SimpleCarculrator calc3 = new SimpleCarculrator();
		calc3.dec(10);
		System.out.println(calc3.getResult());
		SimpleCarculrator calc4 = new SimpleCarculrator();
		calc4.div(20,2);
		System.out.println(calc4.getResult());
	}

}
