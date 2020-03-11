package com.test;

public class Sample1 extends Sample{

	@Override
	public void face() {
		System.out.println("kash");
		
	}

	@Override
	public void face1() {
		System.out.println("boss");
		
	}
	
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.face();
		s.face1();
		
	}

}
