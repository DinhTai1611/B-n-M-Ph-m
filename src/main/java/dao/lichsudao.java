package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.lichsubean;

public class lichsudao {
	public ArrayList<lichsubean> getls() throws Exception {
		ArrayList<lichsubean> ds = new ArrayList<lichsubean>();
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "select * from Vlichsu";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String maskincare = rs.getString("maskincare");
			String tenskincare = rs.getString("tenskincare");
			long soluongmua = rs.getLong("soluongmua");
			long gia = rs.getLong("gia");
			long makh = rs.getLong("makh");
			long thanhtien = rs.getLong("thanhtien");
			boolean hddamua = rs.getBoolean("hddamua");
			Date ngaymua = rs.getDate("ngaymua");
			ds.add(new lichsubean(maskincare, tenskincare, soluongmua, gia, makh, thanhtien, hddamua, ngaymua));
		}
		return ds;
	}
}
