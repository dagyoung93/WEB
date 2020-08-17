package service;

import model.Member;

public interface Service {
	void join(Member m);

	

	void editMember(Member m);

	void delMember(String id);

	Member getMember(String id);
}
