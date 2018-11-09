package sekil;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Ucgen {
	
	private String cesit;
	private String yukseklik;
	
	public Ucgen() {
		// TODO Auto-generated constructor stub
	}
	
	public Ucgen(String cesit) {
		super();
		this.cesit = cesit;
	}
	
	
	
	public Ucgen(String cesit, String yukseklik) {
		super();
		this.cesit = cesit;
		this.yukseklik = yukseklik;
		System.out.println("public Ucgen(String cesit, String yukseklik)");
	}

	public void ciz() {
		System.out.println(getCesit() +" ucgen çizildi. \n" + getYukseklik() + " birim yükseklik..");
	}
	
	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
		System.out.println("setCesit");
	}

	public String getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(String yukseklik) {
		this.yukseklik = yukseklik;
		System.out.println("setYukseklik");
	}
	
	

}
