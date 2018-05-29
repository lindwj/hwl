package com.hwl.service.dao;

import java.util.*;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface ParameterTypeMapper {
	
	public abstract List<ParameterType> getParameterTypeListPage(ParameterType parameterType);
	
	public abstract ParameterType getParameterTypeById(int parameterTypeId);

	public abstract int insertParameterType(ParameterType parameterType);

	public abstract void updateParameterType(ParameterType parameterType);

	public abstract void deleteParameterType(int parameterTypeId);
	
}
