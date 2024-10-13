package bean;

import java.util.Date;

public class lichsubean {
	private String maskincare;
	private String tenskincare;
	private long soluongmua;
	private long gia;
	private long makh;
	private long thanhtien;
	private boolean hddamua;
	private Date ngaymua;

	public lichsubean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public lichsubean(String maskincare, String tenskincare, long soluongmua, long gia, long makh, long thanhtien,
			boolean hddamua, Date ngaymua) {
		super();
		this.maskincare = maskincare;
		this.tenskincare = tenskincare;
		this.soluongmua = soluongmua;
		this.gia = gia;
		this.makh = makh;
		this.thanhtien = thanhtien;
		this.hddamua = hddamua;
		this.ngaymua = ngaymua;
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

	public long getMakh() {
		return makh;
	}

	public void setMakh(long makh) {
		this.makh = makh;
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

	public Date getNgaymua() {
		return ngaymua;
	}

	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}

}
