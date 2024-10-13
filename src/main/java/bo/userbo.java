package bo;

import java.util.ArrayList;

import bean.userbean;
import dao.userdao;

public class userbo {
	userdao udao = new userdao();
	ArrayList<userbean> ds;

	public ArrayList<userbean> getkh() throws Exception {
		return udao.getkh();
	}
}
