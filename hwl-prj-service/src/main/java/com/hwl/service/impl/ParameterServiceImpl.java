package com.hwl.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.hwl.service.*;
import com.hwl.service.dao.*;
import com.hwl.service.model.*;

/**
 * @author lind
 *
 */

@Service("ParameterService")
public class ParameterServiceImpl implements ParameterService{
	@Autowired
	private ParameterMapper parameterMapper;
	
	@Override
	public List<Parameter> getParameterList(Parameter parameter){
		return parameterMapper.getParameterList(parameter);
	}
	
	@Override
	public Parameter getParameterById(int parameterId){
		return parameterMapper.getParameterById(parameterId);
	}

	@Override
	public int saveParameter(Parameter parameter,String doWhat){
		if("add".equals(doWhat)){
			return parameterMapper.insertParameter(parameter);
		}else if("edit".equals(doWhat)){
			parameterMapper.updateParameter(parameter);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteParameter(int parameterId){
		parameterMapper.deleteParameter(parameterId);
	}

	@Override
	public List<Parameter> getParameterListPage(Parameter parameter) {
		return parameterMapper.getParameterListPage(parameter);
	}
	
}