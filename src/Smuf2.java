
public class Smuf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Smurf Handy = new Smurf("Handy");
			
			String h =Handy.getName();
			
			System.out.println(h);
			
			Handy.eat();
			
			
			Smurf p = new Smurf("Papa");
		String f=	p.getName();
		System.out.println(f);

		String k =p.getHatColor();
System.out.println(k);
	String i= 	p.isGirlOrBoy();
System.out.println(i);
		Smurf s = new Smurf("Smurfette");
		
		String g = s.getName();
		System.out.println(g);
	String q =	s.getHatColor();
	System.out.println(q);
		String w =s.isGirlOrBoy();
		System.out.println(w);
	}

}
