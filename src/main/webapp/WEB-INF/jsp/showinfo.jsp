<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function submitForm(){
		//获取多行文本域的回复内容
		var content = $("#content1").val();
		
		//对回复内容长度进行判断，回复内容不能超过20字符
		if(content.length > 20){
			$("#addInfo").html("必须填写回复内容,且字数不超过20!");
			return;
		}
		//将表单数据进行序列化，序列化成key/value格式
		var data = $("#replyForm").serialize();
		
		$.ajax({
			url:"${pageContext.request.contextPath}/info/addReply",
			data:data,
			type:"POST",
			success:function(data){
				alert("添加成功");
				var reply = "<p>回复时间:刚才</p>" +
							"<p>"+$("#content1").val()+"</p>";
				$("#end").append(reply);
			}
		});
	}
</script>
</head>
<body>
<div align="center">
	<h1>${info.title }</h1>
	<p>发表于: <fmt:formatDate value="${info.reportTime }" pattern="yyyy-MM-dd HH:mm:ss"/></p>
	<p>${info.content }</p>
	<h2>读者回应</h2>
	<div  id="end">
	<c:forEach items="${reList}" var="r">
		<p>回复时间:<fmt:formatDate value="${r.replyTime }" pattern="yyyy-MM-dd HH:mm:ss"/></p>
		<p>${r.content }</p>
		<br />
	</c:forEach>
	</div>
	<p>发表回复:字数在20字以内</p>
	<form id="replyForm">
		<input type="hidden" id="infoId" name="infoId" value="${info.id }" />
		<textarea id="content1" name="content" rows="" cols=""></textarea>
		<span id="addInfo"></span> 
		<br/>
		<input type="button" onclick="submitForm()" value="发表回复" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath}/info/list.html">返回首页</a>
	</form>
	</div>
</body>
</html>