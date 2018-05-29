package com.hwl.service;

import java.util.*;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface ParameterService {
	
	public abstract List<Parameter> getParameterList(Parameter parameter);
	
	public abstract Parameter getParameterById(int parameterId);
	
	public abstract int saveParameter(Parameter parameter,String doWhat);

	public abstract void deleteParameter(int parameterId);
	
	public abstract List<Parameter> getParameterListPage(Parameter parameter);
	
}