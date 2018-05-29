package com.hwl.service.dao;

import java.util.*;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface ParameterMapper {
	
	public abstract List<Parameter> getParameterList(Parameter parameter);
	
	public abstract Parameter getParameterById(int parameterId);

	public abstract int insertParameter(Parameter parameter);

	public abstract void updateParameter(Parameter parameter);

	public abstract void deleteParameter(int parameterId);
	
	public abstract List<Parameter> getParameterListPage(Parameter parameter);
	
}
