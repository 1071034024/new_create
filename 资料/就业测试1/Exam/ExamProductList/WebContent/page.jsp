<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

   
   <c:if test="${empty pageBean }">
              没有任何商品！！！
   </c:if>
   
   <c:if test="${not empty pageBean }">
      <table width="100%">
      <caption><h1>商品列表</h1></caption>
      <thead>
         <tr style="background-color:#cc00aa">
           <th>商品序号</th>
           <th>商品名称</th>
           <th>市场价格</th>
           <th>商城价格</th>
           <th>商品描述</th>
           <th>发布时间</th>
           <th>是否热门</th>
           <th>操作</th>
         </thead>
         <c:forEach items="${pageBean.data }" var="p" varStatus="status">
         
            <tr style="background-color:${status.count%2==0?'#cceeaa':'#eeaacc'}">
            
	           <td>${status.count}</td>
	           <td>${p.pname }</td>
	           <td>${p.market_price }</td>
	           <td>${p.shop_price }</td>
	           <td>
	           <c:if test="${ fn:length(p.pdesc)>20}">
	               ${fn:substring(p.pdesc,0,17)}...
	           </c:if>
	            <c:if test="${ fn:length(p.pdesc)<=20}">
	               ${p.pdesc }
	           </c:if>
	           </td>
	           <td>${p.pdate }</td>
	           <td>
	              <c:if test="${ p.is_hot eq 0 }">否</c:if>
	              <c:if test="${ p.is_hot eq 1 }">是</c:if>
	           </td>
	           <td>
	               <a href="#">编辑</a>
	               |
	               <a href="#">删除</a>
	           </td>
            </tr>
         </c:forEach>
         <tr align="center">
           <td colspan="8">
                总共 ${pageBean.totalCount } 条 &nbsp;每页显示 ${pageBean.pageSize } 条&nbsp;分 ${pageBean.totalPage } 页&nbsp;当前 ${pageBean.currentPage }/${pageBean.totalPage } 页
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <c:if test="${pageBean.currentPage ne 1 }">
	     <a href="${pageContext.request.contextPath }/ProductServlet?method=doFindPage&currentPage=1">首页</a>
	     <a href="${pageContext.request.contextPath }/ProductServlet?method=doFindPage&currentPage=${pageBean.currentPage-1 }">上一页</a>
     </c:if>
     
     <c:forEach begin="${pageBean.currentPage-5<=1?1:pageBean.currentPage-5 }" end="${pageBean.currentPage+4>=pageBean.totalPage?pageBean.totalPage:pageBean.currentPage+4 }" step="1" var="i">
       <c:if test="${pageBean.currentPage eq i }">${i}</c:if>
       <c:if test="${pageBean.currentPage ne i }">
           <a href="${pageContext.request.contextPath }/ProductServlet?method=doFindPage&currentPage=${i}">${i }</a>
       </c:if>  
     </c:forEach>
     
     <c:if test="${pageBean.currentPage ne  pageBean.totalPage}">
	     <a href="${pageContext.request.contextPath }/ProductServlet?method=doFindPage&currentPage=${pageBean.currentPage+1 }">下一页</a>
	     <a href="${pageContext.request.contextPath }/ProductServlet?method=doFindPage&currentPage=${pageBean.totalPage }">尾页</a>
     </c:if>
  
           </td>
         </tr>
      </table>
   </c:if>
     
</body>
</html>