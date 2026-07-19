package com.corejavaRehanaMaam;
import java.lang.Object;
	class FinalExp0 {
		static int a=25;
		final int b=12;
		public void chec() {
			System.out.println("Hiii");
		}
		final public void check2() {
			System.out.println("kumar singh");
		}
}
	class Elipo extends FinalExp0{
		public void chec() {
			System.out.println("iasndi");
		}
		
	}
	class FinalExp{
		public static void main(String[] args) {
			Elipo e=new Elipo();
			FinalExp0 f =new FinalExp0();
			System.out.println(e.a);
			System.out.println(f.a);
			e.chec();
			e.check2();
			f.chec();
			f.check2();
			String ab = "KamalSuman";
			String name = new String("Kamal");
			String cd =name.concat("SuMan");
			String ef= name+"Suman";
			System.out.println(ab.equalsIgnoreCase(cd));
			System.out.println(ab.equals(ef));
			System.out.println("//////////////////////");
			String s1="Java";
			String str="Ja";
			String s2=str+"va";
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			System.out.println(f.hashCode());
			System.gc();
		}
	}

	
	
	
	
	
	
	
	
	
	
	