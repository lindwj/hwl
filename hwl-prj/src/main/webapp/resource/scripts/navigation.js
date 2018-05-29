function gotoPage(pageNo)
{
	var flag = false;	
	if( /^[0-9]*[1-9][0-9]*$/.test(pageNo))
	{
	    if(pageNo<=parseInt(document.getElementsByName("page.totalPage")[0].value) && pageNo>=1)
	    {
	   	    flag = true;
        }
    }
    if(!flag)
    {
        return;
	}

    document.getElementsByName("page.currentPage")[0].value=pageNo;    
    document.forms[0].submit();
}
function setShowCount()
{
    document.forms[0].submit();
}



function showAllPages(obj){
      if(obj.checked){
          document.forms[0].pageSize.value = '-1';
          document.forms[0].isShowAll.value = 'true';
          document.forms[0].submit();
      }else{
          document.forms[0].pageSize.value = '15';
          document.forms[0].isShowAll.value = 'false';
          document.forms[0].submit();
      }
}