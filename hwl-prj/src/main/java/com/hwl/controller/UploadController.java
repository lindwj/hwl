package com.hwl.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.hwl.service.model.Manager;



/**
 * @author lind
 */

@Controller
@RequestMapping("/upload")
public class UploadController{
	
	// 业务逻辑对象
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/pUpload.do")
	@ResponseBody
	public Map<String,Object> pupload(@RequestParam(value = "upfile", required = false) MultipartFile file, HttpServletRequest request, ModelMap model) {  
		  
		Map<String,Object> map =new HashMap<String, Object>();
		
        String path = request.getSession().getServletContext().getRealPath("/")+File.separator+"resource/upload/description";  
        String fileName = file.getOriginalFilename();  
//        String fileName = new Date().getTime()+".jpg";  
        System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //保存  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        
        
  
        map.put("state", "SUCCESS");
        map.put("url", request.getContextPath()+"/resource/upload/description/"+fileName);
        map.put("size", file.getSize());
        map.put("original", file.getOriginalFilename());
        map.put("title", file.getName());
        map.put("type", file.getContentType());
        return map;  
    }
	
	
	@RequestMapping("/uploadActiontest.do")
	@ResponseBody
	public String uploadAction(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, ModelMap model) {  
		  
		Map<String,Object> map =new HashMap<String, Object>();
		
        String path = request.getSession().getServletContext().getRealPath("/resource/upload/product");  
        String fileName = file.getOriginalFilename();  
//        String fileName = new Date().getTime()+".jpg";  
        System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //保存  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        
        return fileName;  
    }
	
	
	
	/**
	* 处理文件上传
	* @param response
	* @param request
	* @return
	* @throws IOException
	*/
	@RequestMapping(value="/uploadAction.do")  
	@ResponseBody
	public Map<String,Object> upload(HttpServletResponse response,HttpServletRequest request) throws IOException{  
	Map<String,Object> map =new HashMap<String, Object>();	
		
	String responseStr="";
	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();    
	//String savePath = this.getServletConfig().getServletContext().getRealPath("");
	        //savePath = savePath + "/uploads/";
	// 文件保存路径  ctxPath本地路径
	String ctxPath=request.getSession().getServletContext().getRealPath("/")+File.separator+"resource/upload/product/";
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");  
//	String ymd = sdf.format(new Date());  
//	ctxPath += File.separator + ymd + File.separator;  
//	System.out.println("ctxpath="+ctxPath);
	// 创建文件夹  
	File file = new File(ctxPath);    
	if (!file.exists()) {    
	file.mkdirs();    
	}
	String fileName = null;    
	for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {    
	// 上传文件   
	MultipartFile mf = entity.getValue();  
	fileName = mf.getOriginalFilename();//获取原文件名  
	System.out.println("filename="+fileName);
	File uploadFile = new File(ctxPath + fileName);
	try {  
	FileCopyUtils.copy(mf.getBytes(), uploadFile); 
	map.put("fileName", fileName);
//	   responseStr=fileName;  
	   } catch (IOException e) {  
//	   	responseStr="err";  
	   	map.put("fileName", "err");
	       e.printStackTrace();  
	       }
	}   
    return map;   
	}
	
	
	@RequestMapping(value="/uploadPicAction.do")  
	@ResponseBody
	public Map<String,Object> uploadPic(HttpServletResponse response,HttpServletRequest request) throws IOException{  
	Map<String,Object> map =new HashMap<String, Object>();	
		
	String responseStr="";
	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();    
	//String savePath = this.getServletConfig().getServletContext().getRealPath("");
	        //savePath = savePath + "/uploads/";
	// 文件保存路径  ctxPath本地路径
	String ctxPath=request.getSession().getServletContext().getRealPath("/")+File.separator+"resource/upload/productPic/";
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");  
//	String ymd = sdf.format(new Date());  
//	ctxPath += File.separator + ymd + File.separator;  
//	System.out.println("ctxpath="+ctxPath);
	// 创建文件夹  
	File file = new File(ctxPath);    
	if (!file.exists()) {    
	file.mkdirs();    
	}
	String fileName = null;    
	for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {    
	// 上传文件   
	MultipartFile mf = entity.getValue();  
	fileName = mf.getOriginalFilename();//获取原文件名  
	System.out.println("filename="+fileName);
	File uploadFile = new File(ctxPath + fileName);
	try {  
	FileCopyUtils.copy(mf.getBytes(), uploadFile); 
	map.put("fileName", fileName);
//	   responseStr=fileName;  
	   } catch (IOException e) {  
//	   	responseStr="err";  
	   	map.put("fileName", "err");
	       e.printStackTrace();  
	       }
	}   
    return map;   
	}
	
	
	
	@RequestMapping(value="/uploadIndexAction.do")  
	@ResponseBody
	public Map<String,Object> uploadIndex(HttpServletResponse response,HttpServletRequest request) throws IOException{  
	Map<String,Object> map =new HashMap<String, Object>();	
		
	String responseStr="";
	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();    
	//String savePath = this.getServletConfig().getServletContext().getRealPath("");
	        //savePath = savePath + "/uploads/";
	// 文件保存路径  ctxPath本地路径
	String ctxPath=request.getSession().getServletContext().getRealPath("/")+File.separator+"resource/upload/productIndex/";
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");  
//	String ymd = sdf.format(new Date());  
//	ctxPath += File.separator + ymd + File.separator;  
//	System.out.println("ctxpath="+ctxPath);
	// 创建文件夹  
	File file = new File(ctxPath);    
	if (!file.exists()) {    
	file.mkdirs();    
	}
	String fileName = null;    
	for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {    
	// 上传文件   
	MultipartFile mf = entity.getValue();  
	fileName = mf.getOriginalFilename();//获取原文件名  
	System.out.println("filename="+fileName);
	File uploadFile = new File(ctxPath + fileName);
	try {  
	FileCopyUtils.copy(mf.getBytes(), uploadFile); 
	map.put("fileName", fileName);
//	   responseStr=fileName;  
	   } catch (IOException e) {  
//	   	responseStr="err";  
	   	map.put("fileName", "err");
	       e.printStackTrace();  
	       }
	}   
    return map;   
	}

	
	public String getDoWhat() {
		return doWhat;
	}

	public void setDoWhat(String doWhat) {
		this.doWhat = doWhat;
	}
	
	public void setPare_moduleid(int pareModuleid) {
		pare_moduleid = pareModuleid;
	}
	
	
}
