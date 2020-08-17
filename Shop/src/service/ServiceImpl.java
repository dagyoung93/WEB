package service;

import dao.Dao;
import dao.DaoImpl;
import model.Member;

public class ServiceImpl implements Service{

	private Dao dao;
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	@Override
	public void join(Member m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void editMember(Member m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delMember(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
