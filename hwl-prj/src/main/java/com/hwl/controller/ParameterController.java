package com.hwl.controller;

import java.util.Date;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwl.service.model.Manager;
import com.hwl.service.model.Parameter;
import com.hwl.service.model.ParameterType;
import com.hwl.service.ParameterService;
import com.hwl.service.ParameterTypeService;
import com.hwl.service.dao.ParameterMapper;



/**
 * @author lind
 */

@Controller
@RequestMapping("/Parameter")
public class ParameterController{
	
	// 业务逻辑对象
	@Autowired
	private ParameterService parameterService;
	@Autowired
	private ParameterMapper parameterMapper;
	@Autowired
	private ParameterTypeService parameterTypeService;
	
	// 查询结果
	private List<Parameter> parameterList;
	
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 商品分类分页 */
	@RequestMapping("/parameterList.do")
	public String parameterList(Parameter parameter,Model model) throws Exception{
		Subject subject = SecurityUtils.getSubject();
		if(parameter.getMenuId()!=null&&parameter.getMenuId()>0){
			subject.getSession().setAttribute("menuId", parameter.getMenuId());
		}
		parameterList = parameterService.getParameterListPage(parameter);
		ParameterType parameterType=new ParameterType();
		List<ParameterType>	parameterTypeList=parameterTypeService.getParameterTypeListPage(parameterType);
		model.addAttribute("parameterList", parameterList);
		model.addAttribute("parameterTypeList", parameterTypeList);
		model.addAttribute("page", parameter.getPage());
		return "/jsp/parameter/parameter";
	}
	
	/** 删除分类 */
	@RequestMapping("delParameter.do")
	public String delParameter(Parameter parameter) throws Exception{
		parameterService.deleteParameter(parameter.getParameterId());
		return "redirect:/Parameter/parameterList.do";
	}
	
	/** 添加或修改分类页面*/
	@RequestMapping("parameterAdd.do")
	public String parameterAdd(Parameter parameter,Model model) throws Exception{
		if(parameter.getParameterId()!=null){
			Parameter parameter1=parameterService.getParameterById(parameter.getParameterId());
			model.addAttribute("parameter", parameter1);
		}else{
			model.addAttribute("parameter", parameter);
		}
		ParameterType parameterType=new ParameterType();
		List<ParameterType>	parameterTypeList=parameterTypeService.getParameterTypeListPage(parameterType);
		model.addAttribute("parameterTypeList", parameterTypeList);
		return "/jsp/parameter/parameterDetail";
	}
	
	/** 保存分类*/
	@RequestMapping("saveParameter.do")
	public String saveParameter(Parameter parameter,Model model)throws Exception{
		Date now=new Date();
		Subject subject = SecurityUtils.getSubject();
		Manager mg=(Manager)subject.getPrincipal();
		if(parameter.getParameterId()!=null){
			parameter.setUpdateMan(mg.getManagerId());
			parameter.setUpdateTime(now);
			parameterMapper.updateParameter(parameter);
		}else{
			parameter.setParameterTypeId(1);
			parameter.setCreateMan(mg.getManagerId());
			parameter.setCreateTime(now);
			parameterMapper.insertParameter(parameter);
		}
		return "redirect:/Parameter/parameterList.do";
	}
	/** 执行搜索 */
	public String parameterListPage() throws Exception{
		//parameterForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		Parameter parameter=null;
		parameterList = parameterService.getParameterList(parameter);
		return "list";
	}
	
	/** 编辑前初始化对象*/
	public String parameterAddEditIni() throws Exception{
		Parameter parameter=null;
		if ("edit".equals(doWhat)) {
			parameter = this.parameterService.getParameterById(parameter.getParameterId());
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	public String parameterDetail() throws Exception {
//		this.setPare_moduleid(14);	
		Parameter parameter=null;
		parameter = this.parameterService.getParameterById(parameter.getParameterId());
		return "detail";
	}
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		Parameter parameter=null;
		parameter = this.parameterService.getParameterById(parameter.getParameterId());
		return "detail";
	}
	/** 保存新增对象 */
	public String parameterAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //parameterForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        Parameter parameter=null;
		this.parameterService.saveParameter(parameter, this.doWhat);
		return "detail";
	}
	/**删除对象*/
	public String parameterDelete() throws Exception {	
		Parameter parameter=null;
		this.parameterService.deleteParameter(parameter.getParameterId());
		return "list";
	}	
	public List<Parameter> getParameterList() {
		return this.parameterList;
	}

	public void setParameterList(List<Parameter> parameterList) {
		this.parameterList = parameterList;
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
