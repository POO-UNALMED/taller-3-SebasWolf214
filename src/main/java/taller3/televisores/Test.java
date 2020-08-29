package taller3.televisores;

public class Test {
	public static void main(String[] args) {
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setVolumen(5);
		tv1.volumenUp();
		System.out.println(tv1.getVolumen());
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.turnOn();
		control.volumenUp();
		System.out.println(tv2.getVolumen());
		
		TV tv3 =  new TV(marca, true);
		tv3.setVolumen(7);
		tv3.volumenUp();
		System.out.println(tv3.getVolumen());
		
		boolean ok = false;
		
		if(tv1.getVolumen() == 6 && tv2.getVolumen() == 2 && tv3.getVolumen() == 7) {
			ok = true;
		}
		System.out.println(ok);				
		
		
		
	}
}
