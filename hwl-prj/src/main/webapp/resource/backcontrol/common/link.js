//页面跳转链接http://4008631119.com/
//var BASE_URL = "http://www.4008631119.com/resource";
//var BASE_URL = "http://localhost:63342";
var BASE_URL = "http://localhost:8080/hwl-prj/resource";
//var BASE_URL = "http://192.168.0.235:8080/business-manager/resource";
//var BASE_URL = "http://121.41.17.4:9900/resource";
//var BASE_URL = "http://localhost:63342/business-manager/resource";
//登录
var url_login = BASE_URL + "/backcontrol/login.html";
var link_ordermanagement = BASE_URL + "/backcontrol/ordermanagement.html";
var link_Scheduledordermanagement = BASE_URL + "/backcontrol/Scheduledordermanagement.html";
var link_inventorycontrol = BASE_URL + "/backcontrol/inventorycontrol.html";
var link_applyDetail = BASE_URL + "/backcontrol/applyDetail.html";
var link_orderApplication = BASE_URL + "/backcontrol/orderApplication.html";
var link_orderDetail=BASE_URL + "/backcontrol/orderDetail.html";
var link_signDetail=BASE_URL + "/backcontrol/signDetail.html"; 
var link_signView=BASE_URL + "/backcontrol/signView.html"; 
var link_salesdaily=BASE_URL + "/backcontrol/salesDaily_store.html";
var link_forgetpsw=BASE_URL + "/backcontrol/regester.html";
var link_ordermanagementDD = BASE_URL + "/backcontrol/ordermanagementDD.html";
var link_inventorycontrolDD = BASE_URL + "/backcontrol/inventorycontrolDD.html";
var link_salesdailyDD=BASE_URL + "/backcontrol/salesDaily_storeDD.html";
var link_transferDetail=BASE_URL + "/backcontrol/transferDetail.html";
var link_salesDailyAll=BASE_URL + "/backcontrol/salesDaily_all.html";


//订单管理接口链接http://4008631119.com
//var order_URL = "http://www.4008631119.com";
//var order_URL = "http://192.168.0.235:8080/business-manager";
//var order_URL = "http://121.41.17.4:9900";
var order_URL = "http://localhost:8080/hwl-prj";
//var order_URL = "http://192.168.0.245:8080/business-manager";
var order_control = order_URL + "/orders/ordersSvcListPage.do";
var state_change = order_URL + "/orders/setStatus.do";


//登录
var link_login = order_URL + "/manager/loginSvc.do";

//修改密码
var forget_password = order_URL + "/manager/mngUpdate.do";
//验证码验证
var time_out = order_URL + "/manager/getMobileCaptcha.do";


//退出
var link_logout = order_URL +"/manager/logoutSvc.do";


//预定订单管理接口链接
var sorder_control = order_URL +"/preOrders/preOrdersSvcListPage.do";
var sorder_addedit = order_URL +"/preOrders/preOrdersAddEditSvc.do";


//商品库存管理接口链接
var invent_control = order_URL +"/stock/stockAddEditIniSvc.do";
var invent_addedit = order_URL +"/stock/stockAddEditSvc.do";


//订单申请接口链接
var order_getparameter=order_URL+"/Ordergoods/getParameter.do";
var order_getproduct=order_URL+"/Ordergoods/getProduct.do";
var order_getproductlist=order_URL+"/Ordergoods/getProductList.do";
var order_getprice=order_URL+"/Ordergoods/getPrice.do";
var order_product=order_URL+"/Ordergoods/saveordergoods.do";
var order_productdraft=order_URL+"/Ordergoods/saveordergoodsdraft.do";
var order_getlist=order_URL+"/Ordergoods/ordersSvcListPage.do";
var order_detail=order_URL+"/Ordergoods/orderDeatil.do";
var logistics_detail=order_URL+"/Ordergoods/logisticsDetail.do";
var order_updateStatus=order_URL+"/Ordergoods/updatestatus.do";
var order_delete=order_URL+"/Ordergoods/orderdel.do";


//快递公司选项接口
var link_wuliu = order_URL+"/Kdn/getKdn.do";
//快递公司id和单号传给后台的接口
var link_sendcode = order_URL+"/LogisticsInfo/getLogisticsInfo.do";

//签收接口
var logistics_sign=order_URL+"/Logistics/signDetail.do";
var get_sign=order_URL+"/Logistics/getSign.do";

//绑定接口
var bind_user=order_URL+"/user/bindUser.do";
var bindOpen_user=order_URL+"/user/bindUserOpen.do";
//订单详情接口连接

//图片链接
var link_pic = "";



//销售日报接口连接
var sales_url = order_URL + "/shopFinancial/shopFinancialSvcListPage.do";


//独代
//订单列表
var order_listdd=order_URL+"/orders/getListDD.do";

//库存管理商品显示
var invent_listdd = order_URL +"/stock/stockEditDD.do";

//销售日报接口连接
var sales_listdd = order_URL + "/ShopAgentFinancial/getShopFinancialSvcListPageDD.do";

//汇总表（总代当天的）
var sales_AllList = order_URL + "/shopFinancial/shopFinancialListPageAll.do";

//当天所有独代销售
var sales_AllDDList = order_URL + "/ShopAgentFinancial/getShopFinancialSvcList.do";
var updateShop = order_URL + "/ShopAgentFinancial/updateShop.do";

//退出登录
$("#controluser").mouseenter(function(){
    $("#logout").show();
});
$(".user-name").mouseleave(function(){
    $("#logout").hide();
});
var ajaxURL =  link_logout;

$("#logout").click(function() {


    $.ajax({
        type: 'POST',
        url: ajaxURL,
        dataType : "json" ,
        data: {},

        success:
            function(data,textStatus){
                window.location.href= url_login;
            },
        error:
            function(data,textStatus){
                //alert("success:" + data + "," + textStatus);
                alert("服务器异常，请稍后重试");

            }

    });
});

//订单管理，预定订单管理，商品库存管理链接，订单申请链接
$("#proc").click(function(){
    window.location.href= link_ordermanagement;
});
$("#orderc").click(function(){
    window.location.href= link_Scheduledordermanagement;
});
$("#stocklistc").click(function(){
    window.location.href= link_inventorycontrol;
});
$("#orderapplyc").click(function(){
	window.location.href= link_orderApplication;
});
$("#salesdaily").click(function(){
	window.location.href= link_salesdaily;
});
$("#procDD").click(function(){
    window.location.href= link_ordermanagementDD;
});
$("#stocklistcDD").click(function(){
    window.location.href= link_inventorycontrolDD;
});
$("#salesdailyDD").click(function(){
	window.location.href= link_salesdailyDD;
});


//弹框提示方法
function error(error){
    $(".alert").text(error);
    $(".alert").fadeIn();
    $(".alert").fadeOut(1500);
}