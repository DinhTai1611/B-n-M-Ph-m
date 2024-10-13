package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hoadondao {
	public int them(long makh) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "insert into hoadon(makh, ngaymua, damua) values(?,?,?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setLong(1, makh);
		Date n = new Date();
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-mm-dd");
		String nn = dd.format(n);
		Date n2 = dd.parse(nn);
		cmd.setDate(2, new java.sql.Date(n2.getTime()));
		cmd.setBoolean(3, false);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}

	public long maxhd() throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.ketnoi();
		String sql = "select max(mahoadon) as hdln from hoadon";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		long max = 0;
		if (rs.next()) {
			max = rs.getLong(1);
		}
		cmd.close();
		kn.cn.close();
		return max;
	}
}
