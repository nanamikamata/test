<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div id="contents">
<h1>データ一覧画面</h1>
<div>
	<h2>商品一覧</h2>
<table border=1>
	<tr>
		<th>ID</th>
		<th>商品ID</th>
		<th>商品名</th>
		<th>商品名かな</th>
		<th>商品概要</th>
		<th>カテゴリーID</th>
		<th>値段</th>
		<th>商品画像</th>
		<th>商品画像名</th>
		<th>発売日</th>
		<th>発売会社</th>
		<th>ステータス</th>
		<th>登録日時</th>
		<th>更新日時</th>
	</tr>
	<s:iterator value="adminProductList">
		<tr>
			<td><s:property value="id"/></td>
			<td><a href='<s:url action="ProductInfoAcion"><s:param name="id" value="%{id}"/></s:url>'><s:property value="productId"/></a></td>
			<td><s:property value="productName"/></td>
			<td><s:property value="productNameKana"/></td>
			<td><s:property value="productDe"/></td>
			<td><s:property value="categoryId"/></td>
			<td><s:property value="imageFilePath"/></td>
			<td><s:property value="imageFileName"/></td>
			<td><s:property value="releaseDate"/></td>
			<td><s:property value="releaseCompany"/></td>
			<td><s:property value="status"/></td>
			<td><s:property value="registDate"/></td>
			<td><s:property value="updateDate"/></td>
		</tr>
	</s:iterator>
</table>
</div>
</div>





















</body>
</html>