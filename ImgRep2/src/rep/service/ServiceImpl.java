package rep.service;

import java.util.ArrayList;

import model.Img;
import model.Rep;
import rep.dao.Dao;
import rep.dao.DaoImpl;

public class ServiceImpl implements Service{

	private Dao dao;
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	@Override
	public void addRep(Rep rep) {
		// TODO Auto-generated method stub
		dao.insert(rep);
	}

	@Override
	public ArrayList<Rep> getRepsByImg_num(int img_num) {
		// TODO Auto-generated method stub
		return dao.selectByImg_num(img_num);
	}


}
