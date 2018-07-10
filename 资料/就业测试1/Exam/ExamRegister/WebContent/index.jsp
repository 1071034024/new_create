<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
  body{
   margin-top:20px;
   margin:0 auto;
 }
 .carousel-inner .item img{
	 width:100%;
	 height:300px;
 }
 .container .row div{ 
	 /* position:relative;
	 float:left; */
 }
 
font .regist {
    color: #3164af;
    font-size: 18px;
    font-weight: normal;
    padding: 0 10px;
}
 </style>


<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script>
   $(function(){
	   $("#subt").prop("disabled",false);
	   $("#uname").blur(function(){
		   var unameValue=$("#uname").val();
		   $("#span_uname").html("");
		   if(unameValue!=""||unameValue.length!=0){
			   $.post("${pageContext.request.contextPath}/UserServlet",{"method":"checkUserName","uname":unameValue},function(data){
				   if(data=="0"){
					   $("#span_uname").html("<font color='green'>用户名不存在可以注册</font>");
					   $("#subt").prop("disabled",false);
				   }else if(data=="1"){
					   $("#span_uname").html("<font color='red'>用户名已经存在，请重新填写！</font>");
					   $("#subt").prop("disabled",true);
				   }
			   });
		   }
		   
	   });
	   
   });
</script>
</head>
<body>
<fieldset><legend><font class="regist">用户注册</font></legend>

          
          <font color="red">${msg }</font>
		
		<form style="margin-top:5px;" action="${ pageContext.request.contextPath }/UserServlet" method="post">
			 <input type="hidden" name="method" value="regist" >
			 <div>
			    
			    <div>
			      <label>用&nbsp;户&nbsp;名:</label>&nbsp;&nbsp;<input type="text" id="uname" name="uname" value="${param.uname }"/> <span id="span_uname"></span>
			    </div>
			   
			  </div>
			   <div>
			    
			    <div >
			      <label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</label>&nbsp;&nbsp;<input type="password" id="inputPassword3" name="pwd" value="${param.pwd }">
			    </div>
			  </div>
			  
			  
			   <div>
			    
			    <div>
			      <label>确认密码:</label>&nbsp;<input type="password" id="confirmpwd" name="repwd">
			    </div>
			  </div>
			  <div>
			    
			    <div>
			      <label>&nbsp;E-mail&nbsp;:</label>&nbsp;&nbsp;<input type="text" id="inputEmail3" name="email" value="${param.email }"/>
			    </div>
			  </div>
			 <div>
			    
			    <div class="col-sm-6">
			      <label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:</label>&nbsp;&nbsp;<input type="text" id="usercaption" name="name" value="${param.name }"/>
			    </div>
			  </div>
			  
			  <div>  
			   
			  <div>
			    <label>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</label>&nbsp;&nbsp; <label>
			    
			  <input type="radio" name="sex" id="inlineRadio1" value="1" <c:if test="${param.sex ne 0 }">checked</c:if>> 男
			</label>
			<label>
			  <input type="radio" name="sex" id="inlineRadio2" value="0" <c:if test="${param.sex eq 0 }">checked</c:if>> 女
			</label>
			</div>
			  </div>	
			  
			 <div>
			    
			    <div>
			      <label>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话:</label>&nbsp;&nbsp;<input type="text" name="telephone" value="${param.telephone }"/>		      
			    </div>
			  </div>	
	
			  <div>
			    <div>
			      <input type="submit"  id="subt" value="注册" border="0"/>
			    </div>
			  </div>
			</form>
	
	
	</fieldset>
</body>
</html>