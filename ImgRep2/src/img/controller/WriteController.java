package img.controller;

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

import img.service.Service;
import img.service.ServiceImpl;
import model.Img;

/**
 * Servlet implementation class WriteController
 */
@WebServlet("/WriteController")
public class WriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WriteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Service service = new ServiceImpl();
		Img p = new Img();
		String img = "";

		int maxSize = 1024 * 1024 * 10;
		MultipartRequest multi = null;
		String uploadPath = "C:\\Web5\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\shop_img";
		
		try {
			multi = new MultipartRequest(request, uploadPath, maxSize, "utf-8" , new DefaultFileRenamePolicy());
			p.setTitle(multi.getParameter("title"));
			p.setWriter(multi.getParameter("writer"));
			
			Enumeration files = multi.getFileNames();
			
			while(files.hasMoreElements()) {
				String file1 = (String) files.nextElement();
				
				img = multi.getOriginalFileName(file1);
				File file = multi.getFile(file1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		p.setPath("/shop_img/"+img);
		service.addImg(p);
		response.sendRedirect("ImgRep2/ImgList");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
