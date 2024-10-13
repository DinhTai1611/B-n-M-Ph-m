package bean;

public class userbean {
	private String tenkh;
	private String tendn;
	private String pass;

	public userbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public userbean(String tenkh, String tendn, String pass) {
		super();
		this.tenkh = tenkh;
		this.tendn = tendn;
		this.pass = pass;
	}

	public String gettenkh() {
		return tenkh;
	}

	public void settenkh(String tenkh) {
		this.tenkh = tenkh;
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
