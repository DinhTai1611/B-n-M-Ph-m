package bo;

import dao.hoadondao;

public class hoadonbo {
	hoadondao hddao = new hoadondao();

	public int them(long makh) throws Exception {
		return hddao.them(makh);
	}

	public long maxhd() throws Exception {
		return hddao.maxhd();
	}
}
