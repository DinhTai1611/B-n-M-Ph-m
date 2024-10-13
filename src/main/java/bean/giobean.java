package bean;

public class giobean {
	private String maskincare;
	private String tenskincare;
	private long soluongmua;
	private long gia;
	private long thanhtien;

	public giobean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public giobean(String maskincare, String tenskincare, long soluongmua, long gia) {
		super();
		this.maskincare = maskincare;
		this.tenskincare = tenskincare;
		this.soluongmua = soluongmua;
		this.gia = gia;
	}

	public String getMaskincare() {
		return maskincare;
	}

	public void setMaskincare(String maskincare) {
		this.maskincare = maskincare;
	}

	public String getTenskincare() {
		return tenskincare;
	}

	public void setTenskincare(String tenskincare) {
		this.tenskincare = tenskincare;
	}

	public long getSoluongmua() {
		return soluongmua;
	}

	public void setSoluongmua(long soluongmua) {
		this.soluongmua = soluongmua;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}

}
