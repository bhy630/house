$(function(){
  init();
  //数据验证
  //checkItem();
  //提交表单位
  commitItem();
});
function init() {
	var htid=$.getParameter("htid")
	$.ajax({
		url:'http://localhost:8080/HtController?type=toUpdate',
		data:{hid:htid},
		dataType:'json',
		type:'post',
		success:function(mydata)
		{
			$("#htname").val(mydata.htname);
			
			$("#htid").val(mydata.htid);
		}
	});
	
};
/*****************************************/
/******************失去焦点事件****************************/
function checkItem()
{
	$("#sname").focusout(function(){
		var sname=$("#sname").val();
		if(sname.length==0)
			{
			   layer.tips('类型名称不能为空！','#sname',{tips:[2,'red']});
			}
		else
			{
			   $.ajax({
				   url:'sort_getAllName.action',
				   dataType:'json',
				   type:'post',
				   data:{sname:sname},
				   async : true,
				   success:function(mydata)
				   {
					   if(mydata==0)
						   {
						      $("#sname").addClass("newsuccess");
					          $("#sname").removeClass("newerror");
						   }
					   else
						   {
						       layer.tips('对不起类型已存在！','#sname',{tips:[2,'red']});
						   }
					   $("#botao").val(mydata);
				   }
			   });
			}
	});
}



/******************************提交表单********************************/
function commitItem()
{
	$(".btn").bind("click",function(){			
	var htname = $("#htname").val();
	var htid=$("#htid").val();
	var x1=$("#doc").val();
	$.ajaxFileUpload({
	    url:'http://localhost:8080/HtController?type=update',
	    secureuri:false,//一般设置为false
	    fileElementId:'doc',//上传对象 
	    data:{
		  "ht.htname":htname,
		  "ht.htid":htid
		 }, //上传控件以外的控件对应的参数
	    dataType: 'json', 
	    success:function(mydata,status)
	    	 {

	    	     parent.layer.msg('修改成功!!',{icon:1});
		         var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
	             parent.layer.close(index);
	    	 }
	    	  ,
             error: function (data, status, e)//服务器响应失败处理函数
              {

	    	      parent.layer.msg('修改成功!!',{icon:1});
		    	  var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
	              parent.layer.close(index);
                                 
               }
	    });
	});
}

$.extend({
	getParameter: function (name) {
		var results = new RegExp('[\\?&]' + name + '=([^&#]*)').exec(window.location.href);
		if (!results) { return nu11; }
		return unescape(results [1])||nu1l;
	}
});