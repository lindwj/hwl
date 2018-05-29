// JavaScript Document
$(function(){
//左侧导航
	var Nav = $(".cat_m_left").children("dl").length;
	if( Nav == 0){
     $(".cat_m_left").append('<dl> <dd  class="current"><a href="index.html"><i class="page_icon overview_icon"></i>概览</a></dd> <dd><a href="physical_list.html"><i class="page_icon physical_icon"></i>物理服务器监控<i class="page_icon twice_icon"></i></a> <div class="cat_nav_sec hide"> <ul> <li class="active"><a href="physical_list.html"><i class="page_icon sel_icon"></i>物理服务器列表</a></li> <li><a href="physical_alarm.html"><i class="page_icon sel_icon"></i>报警规则</a></li> </ul> </div> </dd> <dd><a href="ditributed_list.html"><i class="page_icon ditributed_icon"></i>分布式存储监控<i class="page_icon twice_icon"></i></a> <div class="cat_nav_sec hide"> <ul> <li><a href="ditributed_list.html"><i class="page_icon sel_icon"></i>分布式集群列表</a></li> <li><a href="ditributed_alarm.html"><i class="page_icon sel_icon"></i>报警规则</a></li> </ul> </div> </dd> <dd><a href="cloud_list.html"><i class="page_icon cloud_icon"></i>云服务监控<i class="page_icon twice_icon"></i></a> <div class="cat_nav_sec hide"> <ul> <li><a href="cloud_list.html"><i class="page_icon sel_icon"></i>云主机</a></li> <li><a href="cloud_alarm.html"><i class="page_icon sel_icon"></i>报警规则</a></li> </ul> </div> </dd> <dd><a href="website.html"><i class="page_icon web_icon"></i>网站监控</a></dd> <dd><a href="alarm_phy.html"><i class="page_icon alarm_icon"></i>报警历史<i class="page_icon twice_icon"></i></a> <div class="cat_nav_sec hide"> <ul> <li><a href="alarm_phy.html"><i class="page_icon sel_icon"></i>物理服务器报警</a></li> <li><a href="alarm_storage.html"><i class="page_icon sel_icon"></i>分布式存储报警</a></li> <li><a href="alarm_cloud.html"><i class="page_icon sel_icon"></i>云服务报警</a></li> <li><a href="alarm_web.html"><i class="page_icon sel_icon"></i>网站报警</a></li> </ul> </div> </dd><dd><a href="contact_alarm.html"><i class="page_icon contact_icon"></i>报警联系人设置</a></dd> <dd><a href="user_management.html"><i class="page_icon personal_icon"></i>用户管理<i class="page_icon twice_icon"></i></a> <div class="cat_nav_sec hide"> <ul> <li><a href="user_management.html"><i class="page_icon sel_icon"></i>用户管理</a></li> <li><a href="user_group.html"><i class="page_icon sel_icon"></i>用户组管理</a></li> </ul> </div> </dd><dd><a href="set_regional.html"><i class="page_icon set_icon"></i>系统管理<i class="page_icon twice_icon"></i></a> <div class="cat_nav_sec hide"> <ul> <li><a href="set_regional.html"><i class="page_icon sel_icon"></i>地区管理</a></li> <li><a href="set_parament.html"><i class="page_icon sel_icon"></i>参数设置</a></li><li><a href="set_power.html"><i class="page_icon sel_icon"></i>权限管理</a></li> <li><a href="set_template.html"><i class="page_icon sel_icon"></i>模版设置</a></li> <li><a href="set_system_log.html"><i class="page_icon sel_icon"></i>系统日志</a></li> </ul> </div> </dd> </dl>')
	}

//概览页鼠标经过效果
  $(".cat_today dl dd").hover(function(){
	  $(this).find(".cat_type_con").removeClass("hide");
	  },function(){
	  $(this).find(".cat_type_con").addClass("hide");
		  })

 //下拉框

	$("#submit").click(function(){
		var endinfo="";
		$(".select_box input:text").each(function(i){
			endinfo=endinfo+(i+1)+": this ID："+$(this).attr("id")+",this name:"+$(this).attr("name")+",this value:"+$(this).val()+";\n\n";
		})
		alert(endinfo);
	});
    $('.default').dropkick();
//性能监控
	var right_W = $(".cat_m_right").width();
    $(".rule_table").width(right_W-2);
	$(window).resize(function(){
		var right_W = $(".cat_m_right").width();
		$(".rule_table").width(right_W-2);
	});
	$(".rule_h span.rules_title").on("click",function(){

     if($(this).children("a").children("i").hasClass("rules_bottom")){
		 $(this).children("a").children("i").removeClass("rules_bottom").addClass("rules_top");
		 $(this).parent().next("#all_rules").addClass("hide");
	 }
		else{
		 $(this).children("a").children("i").removeClass("rules_top").addClass("rules_bottom");
		 $(this).parent().next("#all_rules").removeClass("hide");
	 }

	})



	})


//弹出框根据屏幕高度自适应
function  adaptive(){
    var wh = $(window).height();
    var modalh = $(".layui-layer").height();
    var dfh = wh - modalh;
    if(dfh <0){
        $(".layui-layer .layui-layer-content").height(wh-120);
        $(".layui-layer  .layui-layer-content").css({"overflow-y":"scroll","overflow-x":"hidden"});
    }
    else{
        $(".layui-layer .layui-layer-content").css("height","auto");
    };
}

$(window).resize(function(){
     adaptive()
});

//提示信息设置
toastr.options = {
    closeButton: true,
    progressBar: true,
    showMethod: 'slideDown',
    timeOut: 3000
};
