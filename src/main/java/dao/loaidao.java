package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaibean;

public class loaidao {
	public ArrayList<loaibean> getloai() throws Exception {
		ArrayList<loaibean> ds = new ArrayList<loaibean>();
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "select * from loai";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String maloai = rs.getString("maloai");
			String tenloai = rs.getString("tenloai");
			ds.add(new loaibean(maloai, tenloai));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}

	public int them(String maloai, String tenloai) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "insert into loai(maloai, tenloai) values(?,?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		cmd.setString(2, tenloai);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}

	public int xoa(String maloai) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "delete from loai where maloai=?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}

	public int sua(String tenloai, String maloai) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "update loai set tenloai=? where maloai=?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, tenloai);
		cmd.setString(2, maloai);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}
}
