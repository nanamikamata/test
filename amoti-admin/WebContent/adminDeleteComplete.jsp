<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>削除完了</title>
</head>
<body>
<jsp:attribute name="header.jsp"/>
<div id="contents">
	<h1>商品削除画面</h1>
		<div class="success">
		<div>
		<p>商品を削除しました。</p>
		</div>
		</div>
</div>
<s:include value="footer.jsp"/>
</body>
</html>