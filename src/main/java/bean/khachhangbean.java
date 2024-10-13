package bean;

public class khachhangbean {
	private long makh;
	private String tenkh;
	private String diachi;
	private String sodt;
	private String email;
	private String tendn;
	private String pass;

	public khachhangbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public khachhangbean(long makh, String tenkh, String diachi, String sodt, String email, String tendn, String pass) {
		super();
		this.makh = makh;
		this.tenkh = tenkh;
		this.diachi = diachi;
		this.sodt = sodt;
		this.email = email;
		this.tendn = tendn;
		this.pass = pass;
	}

	public long getMakh() {
		return makh;
	}

	public void setMakh(long makh) {
		this.makh = makh;
	}

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSodt() {
		return sodt;
	}

	public void setSodt(String sodt) {
		this.sodt = sodt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTendn() {
		return tendn;
	}

	public void setTendn(String tendn) {
		this.tendn = tendn;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
