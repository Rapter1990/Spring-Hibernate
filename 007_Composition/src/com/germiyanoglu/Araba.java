package com.germiyanoglu;

public class Araba {
	
	private Yakit yakit;
	
	public Araba() {
		// TODO Auto-generated constructor stub
		yakit = new Yakit();
	}
	
	public void bilgiGoster() {
		yakit.bilgiAl();
		System.out.println("Araba çalýþýyor.");
	}
}
