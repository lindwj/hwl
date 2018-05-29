package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdUserItemService {
	
	public abstract List<SdUserItem> getSdUserItemListPage(SdUserItem sdUserItem);
	
	public abstract SdUserItem getSdUserItemById(int sdUserItemId);
	
	public abstract int saveSdUserItem(SdUserItem sdUserItem,String doWhat);

	public abstract void deleteSdUserItem(int sdUserItemId);
	
}