package bean;

public class adminxacnhanbean {
	public long machitiethd;
	public String tenkh;
	public String tenskincare;
	public long gia;
	public long soluongmua;
	public long thanhtien;
	public boolean hddamua;

	public adminxacnhanbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public adminxacnhanbean(long machitiethd, String tenkh, String tenskincare, long gia, long soluongmua,
			long thanhtien, boolean hddamua) {
		super();
		this.machitiethd = machitiethd;
		this.tenkh = tenkh;
		this.tenskincare = tenskincare;
		this.gia = gia;
		this.soluongmua = soluongmua;
		this.thanhtien = thanhtien;
		this.hddamua = hddamua;
	}

	public long getMachitiethd() {
		return machitiethd;
	}

	public void setMachitiethd(long machitiethd) {
		this.machitiethd = machitiethd;
	}

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getTenskincare() {
		return tenskincare;
	}

	public void setTenskincare(String tenskincare) {
		this.tenskincare = tenskincare;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getSoluongmua() {
		return soluongmua;
	}

	public void setSoluongmua(long soluongmua) {
		this.soluongmua = soluongmua;
	}

	public long getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}

	public boolean isHddamua() {
		return hddamua;
	}

	public void setHddamua(boolean hddamua) {
		this.hddamua = hddamua;
	}

}
