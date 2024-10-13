package bo;

import java.util.ArrayList;

import bean.lichsubean;
import dao.lichsudao;

public class lichsubo {
	lichsudao lsdao = new lichsudao();
	ArrayList<lichsubean> ds;

	public ArrayList<lichsubean> getls() throws Exception {
		ds = lsdao.getls();
		return ds;
	}
}
