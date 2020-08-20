package dao;

import java.util.ArrayList;

import model.MemberVO;

public interface Dao {
	public ArrayList idList();
	public MemberVO findMember(String id);
	public void register(MemberVO vo);
}
