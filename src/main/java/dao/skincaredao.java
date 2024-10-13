package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.skincarebean;

public class skincaredao {
	public ArrayList<skincarebean> getskin() throws Exception {
		ArrayList<skincarebean> ds = new ArrayList<skincarebean>();
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "select * from skincare";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String maskincare = rs.getString("maskincare");
			String tenskincare = rs.getString("tenskincare");
			long soluong = rs.getLong("soluong");
			long gia = rs.getLong("gia");
			String maloai = rs.getString("maloai");
			String anh = rs.getString("anh");
			ds.add(new skincarebean(maskincare, tenskincare, soluong, gia, maloai, anh));
		}
		return ds;
	}
}
