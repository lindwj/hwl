package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdUserItemMapper {
	
	public abstract List<SdUserItem> getSdUserItemListPage(SdUserItem sdUserItem);
	
	public abstract SdUserItem getSdUserItemById(int sdUserItemId);

	public abstract int insertSdUserItem(SdUserItem sdUserItem);
	
	public abstract int insertSdUserItemList(List<SdUserItem> sdUserItemList);

	public abstract void updateSdUserItem(SdUserItem sdUserItem);

	public abstract void deleteSdUserItem(int sdUserItemId);
	
}
