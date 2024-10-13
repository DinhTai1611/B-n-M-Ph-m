package bo;

import java.util.ArrayList;

import bean.giobean;

public class giobo {
	public ArrayList<giobean> ds = new ArrayList<giobean>();

	public void them(String maskincare, String tenskincare, long soluongmua, long gia) throws Exception {
		for (giobean g : ds)
			if (g.getMaskincare().equals(maskincare)) {
				g.setSoluongmua(g.getSoluongmua() + soluongmua);
				return;
			}
		giobean h = new giobean(maskincare, tenskincare, soluongmua, gia);
		ds.add(h);
	}

	public void xoa(String maskincare) throws Exception {
		for (giobean g : ds)
			if (g.getMaskincare().equals(maskincare)) {
				ds.remove(g);
				return;
			}
	}

	public void sua(String maskincare, long slmua) throws Exception {
		int n = ds.size();
		for (int i = 0; i < n; i++) {
			giobean g = ds.get(i);
			if (g.getMaskincare().equals(maskincare)) {
				g.setSoluongmua(slmua);
				ds.set(i, g);
				return;
			}
		}
	}

	public long tong() throws Exception {
		long s = 0;
		for (giobean g : ds)
			s += g.getThanhtien();
		return s;
	}
}
