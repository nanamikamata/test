<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者商品詳細画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者商品詳細画面</h1>

<table class="vertical-list-table">
<tr>
	<th scope="row"><s:label value="商品ID"/></th>
	<td><s:property value="{#session.productId}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="商品名"/>
	<td><s:property value="{#session.productName}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="商品名ふりがな"/></th>
	<td><s:property value="{#session.productNameKana}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="商品説明"/></th>
	<td><s:property value="{#session.productDescription}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="カテゴリーID"/></th>
	<td><s:property value="{#session.categoryId}"/></td>
</tr>
<tr>
<th scope="row"><s:label value="値段"/></th>
<td><s:property value="{#session.price}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="商品画像"/></th>
	<td><s:property value="{#session.imageFilePath}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="商品画像名"/></th>
	<td><s:property value="{#session.imageFileName}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="発売年月日"/>
	<td><s:property value="{#session.releaseDate}"/>
</tr>
<tr>
	<th scope="row"><s:label value="発売会社名"/>
	<td><s:property value="{#session.releaseCompany}"/>
</tr>
<tr>
	<th scope="row"><s:label value="ステータス"/>
	<td><s:property value="{#session.status}"/>
</tr>
<tr>
	<th scope="row"><s:label value="登録日"/>
	<td><s:property value="{#session.registDate}"/>
</tr>
<tr>
	<th scope="row"><s:label value="update日"/>
	<td><s:property value="{#session.updateDate}"/>
</tr>
</table>

<div id="footer">
	<s:include value="footer.jsp"/>
</div>
<s:form action="AdminProductDeleteAction">
	<s:param name="id" value="%{#session.id}"/>
	<s:submit value="削除" class="submit_btn"/>
</s:form>
<s:form action="AdminProductEditAction">
	<s:param name="id" value="%{#session.id}"/>
	<s:submit value="編集" class="submit_btn"/>
</s:form>
</div>
</body>
</html>