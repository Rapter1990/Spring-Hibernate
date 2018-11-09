package selam;

public class Selam {

	private String mesaj;

	public Selam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Selam(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	public void sonuc() {
		System.out.println(getMesaj());
	}
}
