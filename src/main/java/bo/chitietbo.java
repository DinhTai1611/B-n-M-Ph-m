package bo;

import java.util.ArrayList;

import bean.adminxacnhanbean;
import dao.chitietdao;

public class chitietbo {
	chitietdao ctdao = new chitietdao();

	public int them(String maskincare, long soluongmua, long mahoadon) throws Exception {
		return ctdao.them(maskincare, soluongmua, mahoadon);
	}

	public int sua(long mact) throws Exception {
		return ctdao.sua(mact);
	}

	public ArrayList<adminxacnhanbean> getxacnhan() throws Exception {
		return ctdao.getxacnhan();
	}
}
