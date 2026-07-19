package com.corejava;
abstract class Mobiles{
	public abstract void rom();
	public abstract void processor();
}
class Oppo extends Mobiles{
	public void rom() {
		System.out.println("64Gb");
	}
	public void processor() {
		System.out.println("Mediatek");
	}}
class Mi extends Mobiles{
	public void rom() {
		System.out.println("128Gb");
	}
	public void processor() {
		System.out.println("Snapdragon");
	}}
class Samsung extends Mobiles{
	public void rom() {
		System.out.println("32Gb");
	}
	public void processor() {
		System.out.println("Exynos");
	}}
public class AbstractEx2 {
	public static void main(String[] args) {
		Oppo o1=new Oppo();
		Mi m1=new Mi();
		Samsung s1=new Samsung();
		o1.processor();
		o1.rom();
		m1.processor();
		m1.rom();
		s1.processor();
		s1.rom();
	}
}
