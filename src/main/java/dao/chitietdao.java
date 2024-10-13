package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.adminxacnhanbean;

public class chitietdao {
	public int them(String maskincare, long soluongmua, long mahoadon) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "insert into chitiethoadon(maskincare, soluongmua, mahoadon, hddamua) values (?,?,?,?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, maskincare);
		cmd.setLong(2, soluongmua);
		cmd.setLong(3, mahoadon);
		cmd.setBoolean(4, false);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}

	public int sua(long mact) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "update chitiethoadon set hddamua= 1 where machitiethd=?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setLong(1, mact);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}

	public ArrayList<adminxacnhanbean> getxacnhan() throws Exception {
		ArrayList<adminxacnhanbean> ds = new ArrayList<adminxacnhanbean>();
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "select * from Vadminxn";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			long machitiethd = rs.getLong("machitiethd");
			String tenkh = rs.getString("tenkh");
			String tenskincare = rs.getString("tenskincare");
			long gia = rs.getLong("gia");
			long soluongmua = rs.getLong("soluongmua");
			long thanhtien = rs.getLong("thanhtien");
			boolean hddamua = rs.getBoolean("hddamua");
			ds.add(new adminxacnhanbean(machitiethd, tenkh, tenskincare, gia, soluongmua, thanhtien, hddamua));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
}
