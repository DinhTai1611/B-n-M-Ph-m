package bo;

import java.util.ArrayList;

import bean.loaibean;
import dao.loaidao;

public class loaibo {
	loaidao ldao = new loaidao();
	ArrayList<loaibean> ds;

	public ArrayList<loaibean> getloai() throws Exception {
		ds = ldao.getloai();
		return ldao.getloai();
	}

	public int them(String maloai, String tenloai) throws Exception {
		for (loaibean loai : ds)
			if (loai.getMaloai().equals(maloai))
				return 0;
		return ldao.them(maloai, tenloai);
	}

	public String tim(String maloai) throws Exception {
		for (loaibean loai : ds)
			if (loai.getMaloai().equals(maloai))
				return loai.getTenloai();
		return null;
	}

	public int xoa(String maloai) throws Exception {
		return ldao.xoa(maloai);
	}

	public int sua(String tenloai, String maloai) throws Exception {
		return ldao.sua(tenloai, maloai);
	}
}
