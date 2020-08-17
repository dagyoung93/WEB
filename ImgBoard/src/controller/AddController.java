package controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Product;
import service.Service;
import service.ServiceImpl;

@WebServlet("/seller/Add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AddController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service service = new ServiceImpl();
		
		Product p = new Product();
		
		p.setNum(service.makeNum());
		
		String img = "";
		
		int maxSize = 1024 * 1024 * 10;
		MultipartRequest multi = null;
		String uploadPath = "C:\\Web5\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\shop_img";
		try {

			multi = new MultipartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());
			p.setName(multi.getParameter("name"));
			p.setQuantity(Integer.parseInt(multi.getParameter("quantity")));
			p.setPrice(Integer.parseInt(multi.getParameter("price")));
			p.setContent(multi.getParameter("content"));

			Enumeration files = multi.getFileNames();
			
			while(files.hasMoreElements()) {
	
				String file1= (String) files.nextElement();	

				img = multi.getOriginalFileName(file1); 

				File file = multi.getFile(file1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		p.setImg("/shop_img/" + img);
		service.add(p);
		response.sendRedirect("/ImgBoard/seller/List");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
