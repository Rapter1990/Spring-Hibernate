package com.germiyanoglu;

public class Araba {
	
	private Yakit yakit;
	
	public Araba() {
		// TODO Auto-generated constructor stub
	}
	
	public Araba(Yakit yakit) {
		// TODO Auto-generated constructor stub
		this.yakit = yakit;
	}
	
	public void bilgiGoster() {
		yakit.bilgiAl();
		System.out.println("Araba çalýþýyor.");
	}
}
