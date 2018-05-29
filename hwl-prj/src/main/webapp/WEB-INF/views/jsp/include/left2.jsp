<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld"%>      

     
     <div class="nav-zone" style="">
            <div class="nav-zone-inner">

                <div class="zone-items">
                    <ul>
                    <shiro:hasRole name="admin"> 
                    
                     
                        
                        <li id="1001" class="control">
                            <a href="${home}/shuidian/shuidianListPage.do?menuId=1001">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe61e;</i>水电信息管理</span>
                                </div>
                            </a>
                        </li>
                        
                        <li id="1002" class="control">
                            <a href="${home}/shuidian/shuidianbbList.do?menuId=1002">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe61e;</i>水电报表</span>
                                </div>
                            </a>
                        </li>
                        
                        <li id="946">
                            <a href="${home}/indexBanner/indexBannerAddEditIni.do?menuId=946">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe613;</i>文件上传</span>
                                </div>
                            </a>
                        </li>
                        
                        
                        <li id="1003">
                            <a href="${home}/indexBanner/indexBannerListPage.do?menuId=1003">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe613;</i>文件管理</span>
                                </div>
                            </a>
                        </li>
                        
                        
                        
                       
                        </shiro:hasRole>
                        
                        
                        <shiro:hasRole name="kuguan">  
                        <li id="988">
                            <a href="${home}/Ordergoods/marketListPage.do?menuId=988">
                            	<div>
                                	<span class="text" ><i class="iconfont menuicon">&#xe6a9;</i>订货管理</span>
                                </div>
                            </a>
                        </li>
                         </shiro:hasRole>
                        
                        <shiro:hasRole name="shenhe">  
                        <li id="990">
                            <a href="${home}/Ordergoods/moneyListPage.do?menuId=990">
                            	<div>
                                	<span class="text" ><i class="iconfont menuicon">&#xe6a9;</i>订货管理</span>
                                </div>
                            </a>
                        </li>
                        
                         <li id="881" class="control">
                            <a href="${home}/nation/getNationListPage.do?menuId=881">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe61e;</i>街道管理</span>
                                </div>
                            </a>
                        </li>
                        <li id="823">
                        <a href="${home}/orders/ordersForBdhListPage.do?menuId=823">
                                <div>
                            <span class="text"><i class="iconfont menuicon">&#xe622;</i>订单管理</span>
                            </div>
                            </a>
                        </li>
                        <li id="882">
                            <a href="${home}/shop/shopListPage.do?menuId=882">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe60e;</i>专营店管理</span>
                                </div>
                            </a>
                        </li>
                        
                        <li id="751">
                            <a href="${home}/product/productListPage.do?menuId=751" >
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe611;</i>商品管理</span>
                                </div>
                            </a>
                        </li>
                        <li id="891">
                            <a href="${home}/manager/managerListPage.do?menuId=891">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe61a;</i>账号管理</span>
                                </div>
                            </a>
                        </li>
                        <li id="946">
                            <a href="${home}/indexBanner/indexBannerAddEditIni.do?menuId=946">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe613;</i>首页滚动组图管理</span>
                                </div>
                            </a>
                        </li>
                        <li id="975">
                            <a href="${home}/productCfg/productCfgListPage.do?menuId=975">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe61b;</i>热门推荐管理</span>
                                </div>
                            </a>
                        </li>
                        <li id="979">
                            <a href="${home}/contractNo/contractNoListPage.do?menuId=979">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe61c;</i>合同编号管理</span>
                                </div>
                            </a>
                        </li>
                       	<li id="980">
                            <a href="${home}/Parameter/parameterList.do?menuId=980">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe626;</i>商品分类管理</span>
                                </div>
                            </a>
                        </li>
                       	<li id="999">
                            <a href="${home}/user/userList.do?menuId=999">
                                <div>
                                    <span class="text"><i class="iconfont menuicon">&#xe627;</i>用户信息</span>
                                </div>
                            </a>
                        </li>
                         </shiro:hasRole>
                         
                         <shiro:hasRole name="finance">   
                        
                        <li id="435">
                        <a href="${home}/preOrders/preOrdersListPageSel.do?menuId=435">
                                <div>
                            <span class="text"><i class="iconfont menuicon">&#xe60b;</i>预定订单管理</span>
                            </div>
                            </a>
                        </li>
                        
                        <li id="917">
                        <a href="${home}/shopFinancial/shopFinancialListPage.do?menuId=917">
                                <div>
                            <span class="text"><i class="iconfont menuicon">&#xe624;</i>流水汇总表</span>
                            </div>
                            </a>
                        </li>
                        </shiro:hasRole>
                         <shiro:hasRole name="caigou">  
                        <li id="992">
                            <a href="${home}/Ordergoods/storeListPage.do?menuId=992">
                            	<div>
                                	<span class="text" ><i class="iconfont menuicon">&#xe6a9;</i>订货管理</span>
                                </div>
                            </a>
                        </li>
                        </shiro:hasRole>
                    </ul>

                </div>

            </div>
        </div>