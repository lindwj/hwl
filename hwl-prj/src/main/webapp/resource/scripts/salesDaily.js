

$(function(){

	$("#transfer").click(function(){
        $("#hidebox").show();
    });
    $("#surebtn").click(function(){
        $("#hidebox").hide();
    });
    $("#canclebtn").click(function(){
        $("#hidebox").hide();
    });


    $("#checkall").click(function(){
            if(this.checked){
                $("input[name='shopFinancialIdList']").attr('checked', true)
            }else{
                $("input[name='shopFinancialIdList']").attr('checked', false)
            }
    });

});


