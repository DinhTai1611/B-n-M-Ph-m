package bo;

import java.util.ArrayList;

import bean.skincarebean;
import dao.skincaredao;

public class skincarebo {
	skincaredao sdao = new skincaredao();
	ArrayList<skincarebean> ds;

	public ArrayList<skincarebean> getskin() throws Exception {
		ds = sdao.getskin();
		return ds;
	}

	public ArrayList<skincarebean> timma(String maloai) throws Exception {
		ArrayList<skincarebean> tam = new ArrayList<skincarebean>();
		for (skincarebean s : ds) {
			if (s.getMaloai().equals(maloai))
				tam.add(s);
		}
		return tam;
	}

	public ArrayList<skincarebean> tim(String key) throws Exception {
		ArrayList<skincarebean> tam = new ArrayList<skincarebean>();
		for (skincarebean s : ds) {
			if (s.getTenskincare().toLowerCase().contains(key.toLowerCase()))
				tam.add(s);
		}
		return tam;
	}
}
