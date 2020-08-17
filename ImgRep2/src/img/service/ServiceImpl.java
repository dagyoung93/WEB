package img.service;

import java.util.ArrayList;

import img.dao.Dao;
import img.dao.DaoImpl;
import model.Img;

public class ServiceImpl implements Service{
		private Dao dao;
		public  ServiceImpl() {
			dao = new DaoImpl();
		}
		@Override
		public void addImg(Img img) {
			// TODO Auto-generated method stub
			dao.insert(img);
		}
		@Override
		public ArrayList<Img> getAll() {
			// TODO Auto-generated method stub
			return dao.selectAll();
		}
		
}
