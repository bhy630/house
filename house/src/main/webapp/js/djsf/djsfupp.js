var cid=0;
var hid=0;
var mid=0;
var aid=0;

$(function(){
  init();
  //数据验证
  //checkItem();
  //提交表单位
   //myaddSe();
   commitItem();
});


function init() {
   $("#myzj").focus();
};



/******************失去焦点事件****************************/



/******************************提交表单********************************/
function commitItem()
{
	$(".btn").bind("click",function(){
	var myzj = $("#myzj").val();
	var mid=$("#mid").val();
	var time=$("#time").val();
	var myage=/^[0-9]*$/;   //正则表达式
	var n=myage.test(myzj);

	if(myzj.length==0)
		{
		   layer.tips('预收租金不能为空！','#myzj',{tips:[2,'red']});
		   $("#myzj").focus();
		   return false;
		}
	else if(!n)
		{
		   layer.tips('预收租金只能为正数！','#myzj',{tips:[2,'red']});
		   $("#myzj").focus();
		   return false;
		}
	else if(time.length==0)
		{
		   layer.tips('时间不能为空！','#time',{tips:[2,'red']});
		   $("#time").focus();
		   return false;
		}
	else
		{
		   var mypart = "sf.myzj=" + myzj + "&sf.mbegintime="+time+"&sf.mid="+mid;
		   var i = layer.load(0);
		   $.post('sf_add.action',mypart,function(mydata){
			 layer.close(i);
			 if(mydata==1)
				 {
				   parent.layer.msg('增加成功！', {icon : 6,time : 3000});
				   var index = parent.layer.getFrameIndex(window.name); //获取窗口索引(真正的关 )
				   parent.layer.close(index);
				 }
			 else
				 {
				     parent.layer.msg('增加失败', 2, 9);
				 }
		   },'json');
		}
	});
}

$.extend({
	getParameter: function (name) {
		var results = new RegExp('[\\?&]' + name + '=([^&#]*)').exec(window.location.href);
		if (!results) { return nu11; }
		return unescape(results [1])||nu1l;
	}
});