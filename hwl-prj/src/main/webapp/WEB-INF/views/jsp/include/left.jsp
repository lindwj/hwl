<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld"%>      

<script type="text/javascript">
function showhide(obj){
	
	var divstr= $(obj).attr("id")+'gl';
	obj=$('#'+divstr);
	if(obj.attr("class")=="cat_nav_sec"){
		obj.attr("class","cat_nav_sec hide");
	}else{
		obj.attr("class","cat_nav_sec");	
	}
}

</script>  
           <div class="cat_m_left">
        <dl>
        
        <shiro:hasRole name="assistant">  

        <dd><a id="dd" onclick="showhide(this)" href="#"><i class="page_icon alarm_icon"></i>订单中心<i class="page_icon twice_icon"></i></a>
              <div id="ddgl" class="cat_nav_sec hide">
                 <ul>
                    <li><a href="${home}/preOrders/preOrdersListPageSel.do"><i class="page_icon sel_icon"></i>预定订单查询</a></li>
                    
                 </ul>
              </div>
           </dd>
           </shiro:hasRole>
           
           
        <shiro:hasRole name="admin">  

        <dd><a id="zd" onclick="showhide(this)" href="#"><i class="page_icon physical_icon"></i>数据字典管理<i class="page_icon twice_icon"></i></a>
              <div id="zdgl" class="cat_nav_sec hide">
                 <ul>
                    <li class="active"><a href="${home}/nation/getNationListPage.do"><i class="page_icon sel_icon"></i>街道管理</a></li>
                 </ul>
              </div>
           </dd>
           <dd><a id="dm" onclick="showhide(this)" href="#"><i class="page_icon ditributed_icon"></i>店面管理<i class="page_icon twice_icon"></i></a>
              <div id="dmgl" class="cat_nav_sec hide">
                 <ul>
                    <li><a href="${home}/shop/shopListPage.do"><i class="page_icon sel_icon"></i>专营店管理</a></li>
                 </ul>
              </div>
           </dd>
           </shiro:hasRole>
           <dd><a id="sp" onclick="showhide(this)" href="#"><i class="page_icon cloud_icon"></i>商品管理<i class="page_icon twice_icon"></i></a>
              <div id="spgl" class="cat_nav_sec hide">
                 <ul>
                 	<shiro:hasRole name="admin"> 
                    <li><a href="${home}/product/productListPage.do"><i class="page_icon sel_icon"></i>商品详情管理</a></li>
                    
                    <li><a href="${home}/product/productForPicListPage.do"><i class="page_icon sel_icon"></i>商品属性&图组管理</a></li>
                    </shiro:hasRole>
                    <shiro:hasPermission name="stock:all">
                    <li><a href="${home}/stock/stockAddEditIni.do"><i class="page_icon sel_icon"></i>商品库存管理</a></li>
                    </shiro:hasPermission>
                 </ul>
              </div>
           </dd>
           <shiro:hasPermission name="orders:all">
           <dd><a id="dd" onclick="showhide(this)" href="#"><i class="page_icon alarm_icon"></i>订单中心<i class="page_icon twice_icon"></i></a>
              <div id="ddgl" class="cat_nav_sec hide">
                 <ul>
                    <li><a href="${home}/orders/ordersListPage.do"><i class="page_icon sel_icon"></i>订单管理</a></li>
                    <li><a href="${home}/preOrders/preOrdersListPage.do"><i class="page_icon sel_icon"></i>预定订单管理</a></li>
                    
                 </ul>
              </div>
           </dd>
           </shiro:hasPermission>
           
           
           
           <shiro:hasRole name="admin"> 
           <dd><a id="yh" onclick="showhide(this)" href="#"><i class="page_icon alarm_icon"></i>用户管理<i class="page_icon twice_icon"></i></a>
              <div id="yhgl" class="cat_nav_sec hide">
                 <ul>
                    <li><a href="${home}/manager/managerListPage.do"><i class="page_icon sel_icon"></i>账号管理</a></li>
                 </ul>
              </div>
           </dd>
           <dd><a id="xt" onclick="showhide(this)" href="#"><i class="page_icon personal_icon"></i>系统管理<i class="page_icon twice_icon"></i></a>
              <div id="xtgl" class="cat_nav_sec hide">
                 <ul>
                    <li><a href="${home}/indexBanner/indexBannerAddEditIni.do"><i class="page_icon sel_icon"></i>首页滚动组图管理</a></li>
                    <li><a href="${home}/productCfg/productCfgListPage.do"><i class="page_icon sel_icon"></i>预订热门推荐管理</a></li>
                    <li><a href="${home}/contractNo/contractNoListPage.do"><i class="page_icon sel_icon"></i>合同编号管理</a></li>
                    
                 </ul>
              </div>
           </dd>
           </shiro:hasRole>
        </dl>
     </div>