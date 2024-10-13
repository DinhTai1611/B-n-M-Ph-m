package bo;

import bean.khachhangbean;
import dao.khachhangdao;

public class khachhangbo {
	khachhangdao khdao = new khachhangdao();

	public khachhangbean ktdn(String tendn, String pass) throws Exception {
		return khdao.ktdn(tendn, pass);
	}

	public int themkh(String tenkh, String diachi, String sodt, String email, String tendn, String pass)
			throws Exception {
		return khdao.themkh(tenkh, diachi, sodt, email, tendn, pass);
	}
}
