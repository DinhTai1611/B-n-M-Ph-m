package bean;

public class skincarebean {
	private String maskincare;
	private String tenskincare;
	private long soluong;
	private long gia;
	private String maloai;
	private String anh;

	public skincarebean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public skincarebean(String maskincare, String tenskincare, long soluong, long gia, String maloai, String anh) {
		super();
		this.maskincare = maskincare;
		this.tenskincare = tenskincare;
		this.soluong = soluong;
		this.gia = gia;
		this.maloai = maloai;
		this.anh = anh;
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

	public long getSoluong() {
		return soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public String getMaloai() {
		return maloai;
	}

	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

}
