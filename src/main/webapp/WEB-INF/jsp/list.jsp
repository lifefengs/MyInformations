<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src="./js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript">


</script>
	</head>

	<body>
		<h1 align="center">
			热点资讯网
		</h1>
		
		
			<table border="1" cellpadding="10" cellspacing="10" align="center">
				<thead>
					<tr>
						<td>
							序号
						</td>
						<td>
							标题
							
						</td>
						<td>
							回复/查看
						</td>
						<td>
							发表时间
						</td>
						<td>
							最后修改
						</td>
						
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${infolist}" var="info" varStatus="status">
						<tr>
							<td>
							${info.id}	
							</td>
							<td>
							    <a href="${pageContext.request.contextPath }/info/infoshow.html?id=${info.id}">${info.content}</a>
								
							</td>
							<td>
								${info.replyCount}/${info.viewCount}
							</td>
							<td>
								
								<fmt:formatDate value="${info.reportTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
							</td>
							<td>
								
								<fmt:formatDate value="${info.lastMdTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
							</td>
							
					</c:forEach>
				</tbody>
			</table>
            
			
	</body>
</html>