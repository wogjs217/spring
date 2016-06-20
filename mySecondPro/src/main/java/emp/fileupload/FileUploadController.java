package emp.fileupload;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class FileUploadController {
	@Autowired
	FileUploadService service;
	
	@RequestMapping(value="/upload.do", method=RequestMethod.GET)
	public String showPage(){
		return "upload/form";
	}
	
	@RequestMapping(value="/upload.do", method=RequestMethod.POST)
	public ModelAndView upload(HttpServletRequest req, FileUploadDTO fileInfo) throws Exception{
		MultipartFile file = fileInfo.getUpFile();
		String path = WebUtils.getRealPath(req.getSession().getServletContext(), "/upload");
		System.out.println("업로드될 파일의 경로=>"+path);
		String fileName = file.getOriginalFilename();
		service.upload(file, path, fileName);
		return new ModelAndView("index");
	}
}
