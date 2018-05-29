
    function chkall(obj){
        if($(obj).is(":checked")){
            $("input[name^='streetList']").prop("checked", true);
        }else{
            $("input[name^='streetList']").prop("checked", false);
        }
        
        
        
    }
    
    
    
    
    function chkBind(dist){
    	
    	var street = $("#"+dist).val();
    	
    	$("input[name^='streetList']").each(function () {
    		
    		var id= $(this).val();
    		
    		if(street.indexOf(id)>=0){
    			$(this).prop("checked", true);
    			
    		}
    		
    		
    	})
    	
        
        
    }
