package rep.service;

import java.util.ArrayList;

import model.Img;
import model.Rep;

public interface Service {
	void addRep(Rep rep);
	ArrayList<Rep> getRepsByImg_num(int img_num);
}
