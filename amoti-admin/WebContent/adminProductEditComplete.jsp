<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者商品編集完了画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者商品編集完了画面</h1>
		<div>
			<h3>商品情報の更新が完了しました。</h3>
			<div>
				<a href='<s:url action="AdminAllSelectAction"/>'>管理者画面へ</a>
			</div>
	</div>
</div>
<div id="footer">
	<s:include value="footer.jsp"/>
</div>
</body>
</html>