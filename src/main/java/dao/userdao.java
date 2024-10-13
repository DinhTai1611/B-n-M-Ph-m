package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.userbean;

public class userdao {
	public ArrayList<userbean> getkh() throws Exception {
		ArrayList<userbean> ds = new ArrayList<userbean>();
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "select * from khachhang";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String tenkh = rs.getString("tenkh");
			String tendn = rs.getString("tendn");
			String pass = rs.getString("pass");
			ds.add(new userbean(tenkh, tendn, pass));
		}
		return ds;
	}
}
