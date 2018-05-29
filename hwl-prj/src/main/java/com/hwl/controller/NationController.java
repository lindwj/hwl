package com.hwl.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hwl.service.model.Manager;
import com.hwl.service.model.Nation;
import com.hwl.service.model.NationForm;
import com.hwl.service.NationService;

/**
 * @author lind
 */

@Controller
@RequestMapping("/nation")
public class NationController {

	// 业务逻辑对象
	@Autowired
	private NationService nationService;

	// 查询结果
	private List<Nation> nationList;

	private NationForm nationForm = new NationForm();

	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;

	/** 省市县联动 */
	@RequestMapping("/getNation.do")
	@ResponseBody
	public List<Nation> getNation(Nation nation) throws Exception {
		// this.setPare_moduleid(14);
		List<Nation> naList =null;
		
		if(nation.getIsStreet()!=null&&nation.getIsStreet()==2){
//查询 区辖区下的专营店			
			
		naList=new ArrayList<Nation>();
		
		}
		else{
		naList = this.nationService.getNationByParentId(nation.getParent());
		}
		return naList;
	}
	
	
	
	
	/** 根据县区 查询 街道 */
	@RequestMapping("/getNationList.do")
	public String getNationList(Nation nation, Model model) throws Exception {
//		查询 已绑定的街道
		List<Nation> bindList =this.nationService.getNationForStreet(nation.getShopId());
		
		List<Nation> naList=null;
		//查询出 街道
		if(nation.getDistrict()!=null&&nation.getDistrict().length()>0){
		 naList = this.nationService.getNationByParentId(Integer.valueOf(nation.getDistrict()));
		}
		
		model.addAttribute("naList", naList);
		model.addAttribute("bindList", bindList);
		
		
		return "/jsp/boundDetail/boundDetail";
	}
	
	
	

	/** 执行搜索 */
	@RequestMapping("/getNationListPage.do")
	public String getNationListPage(Nation nation, Model model) throws Exception {
		// nationForm.setStaffId(String.valueOf(session.get("STAFF_ID")));

		Subject subject = SecurityUtils.getSubject();
		Manager mg = (Manager) subject.getPrincipal();

		nation.setCreateByAdm(mg.getManagerId());

		nationList = nationService.getNationListPage(nation);
		model.addAttribute("code", nation.getCode());
		model.addAttribute("page", nation.getPage());
		model.addAttribute("nationList", nationList);
		
		if(nation.getMenuId()!=null&&nation.getMenuId()>0){
		subject.getSession().setAttribute("menuId", nation.getMenuId());
		}
		
		return "/jsp/index";
	}

	/** 编辑前初始化对象 */
	@RequestMapping("/nationEditIni.do")
	public String nationAddEditIni(Nation nation, Model model) throws Exception {
		model.addAttribute("errcode", nation.getCode());
		
		nation = this.nationService.getNationById(nation.getId());
		model.addAttribute("nation", nation);
		
		return "/jsp/nation/nationEdit";
	}
	
	
	
	@RequestMapping("/nationAdd.do")
	public String nationAdd(Nation nation, Model model) throws Exception {
		model.addAttribute("code", nation.getCode());
		
		return "/jsp/nation/streetAdd";
	}

	/** 查看对象 */
	public String nationDetail() throws Exception {
		// this.setPare_moduleid(14);
		Nation nation = null;
		nation = this.nationService.getNationById(nation.getId());
		nationForm.setNation(nation);
		return "detail";
	}

	public String editCancel() throws Exception {
		// this.setPare_moduleid(14);
		Nation nation = null;
		nation = this.nationService.getNationById(nation.getId());
		nationForm.setNation(nation);
		return "detail";
	}

	/** 保存新增对象 */
	@RequestMapping("/saveNation.do")
	public ModelAndView nationAddEdit(Nation nation, ModelAndView model) throws Exception {
		// this.setPare_moduleid(14);
		// nationForm.setStaffId(String.valueOf(session.get("STAFF_ID")));

		String validate = null;
		// 借用 code 传值 ，add 新增 edit 修改
		if ("add".equals(nation.getCode())) {

			// 后端校验 101 省市县 街道 不能为空

			if (nation.getProvince() == null || nation.getProvince().length() == 0
					|| "请选择".equals(nation.getProvince())) {
				validate = "101";
			}
			if (nation.getCity() == null || nation.getCity().length() == 0 || "请选择".equals(nation.getCity())) {
				validate = "101";
			}
			if (nation.getDistrict() == null || nation.getDistrict().length() == 0
					|| "请选择".equals(nation.getDistrict())) {
				validate = "101";
			}
			if (nation.getStreet() == null || nation.getStreet().length() == 0) {
				validate = "101";
			}

			if (nation.getParent() == null || nation.getParent() <= 0) {
				validate = "101";
			}
			if ("101".equals(validate)) {
				model.addObject("code", "101");
				model.setViewName("redirect:/nation/nationAdd.do");
				return model;
			}

			// 校验结束

			// 1 表示是 街道
			nation.setIsStreet(1);

			Subject subject = SecurityUtils.getSubject();
			Manager mg = (Manager) subject.getPrincipal();

			nation.setCreateByAdm(mg.getManagerId());

		} else if ("edit".equals(nation.getCode())) {
			if (nation.getStreet() == null || nation.getStreet().length() == 0) {
				validate = "101";
			}

			if (nation.getId() <= 0) {
				validate = "101";
			}

			if ("101".equals(validate)) {
				model.addObject("code", "101");
				model.addObject("id", nation.getId());
				model.setViewName("redirect:/nation/nationEditIni.do");
				return model;
			}
		}
		String dowhat=null;
		try {
			// 借用 code 传值 ，add 新增 edit 修改
			dowhat =  nation.getCode();
			nation.setCode(null);
			this.nationService.saveNation(nation,dowhat);
		} catch (DuplicateKeyException be) {

			// 借用 code 传 错误信息， 100 街道已存在
			model.addObject("code", "100");
			
			if("edit".equals(dowhat)){
				model.addObject("id", nation.getId());
				model.setViewName("redirect:/nation/nationEditIni.do");
				return model;
			}else{
				
				model.setViewName("redirect:/nation/nationAdd.do");
				return model;
				
			}

		}
		
		
		

		model.setViewName("redirect:/nation/getNationListPage.do");
		return model;
		// return "redirect:/nation/getNationListPage.do";
	}

	/** 删除对象 */
	@RequestMapping("/delNation.do")
	public String nationDelete(Nation nation, Model model) throws Exception {
		
		
		this.nationService.deleteNation(nation.getId());
		return "redirect:/nation/getNationListPage.do";
	}

	public NationForm getModel() {
		return nationForm;
	}

	public List<Nation> getNationList() {
		return this.nationList;
	}

	public void setNationList(List<Nation> nationList) {
		this.nationList = nationList;
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
