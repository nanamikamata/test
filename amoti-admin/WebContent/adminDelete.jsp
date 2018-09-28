<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>削除画面</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
<jsp:include page="header.jsp"/>

<div id="contents">
	<h1>削除画面</h1>

<s:if test="productInfoDtoList==null">
	<div class="error_c">
	<div class="error-message">
		<s:iterator value="#session.checkListErrorMessageList"><s:property/><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="productInfoDtoList==null">
	<div class="info">商品がありません。</div>
</s:if>

<s:else>
	<s:form id="from" action="AdminProductDeleteCompleteAction">
		<table class="horizontal-list-table">
			<thead>
			<tr>
				<th><s:label value="#"/></th>
				<th><s:label value="商品名"/></th>
				<th><s:label value="ふりがな"/></th>
				<th><s:label value="商品画像"/></th>
				<th><s:label value="値段"/></th>
				<th><s:label value="発売会社名"/></th>
				<th><s:label value="発売年月日"/></th>
			</tr>
			</thead>
			<tbody>
			<s:iterator value="#session.productInfoDtoList">
				<tr>
					<s:hidden name="productId" value="%{productId}"/>
					<td><s:property value="productName"/></td>
					<td><s:property value="productNameKana"/></td>
					<td><img src='<s:property value="imageFilePath" />/<s:property value="imageFileName"/>' width="50px" height="50px" /></td>
					<td><s:property value="price"/>円</td>
					<td><s:property value="releaseCompany"/></td>
					<td><s:property value="releaseDate"/></td>
				</tr>
					<s:hidden name="productName" value="%{productName}"/>
					<s:hidden name="productNameKana" value="%{productNameKana}"/>
					<s:hidden name="imageFileName" value="%{imageFileName}"/>
					<s:hidden name="imageFilePath" value="%{imageFilePath}"/>
					<s:hidden name="price" value="%{price}"/>
					<s:hidden name="releaseCompany" value="%{releaseCompany}"/>
					<s:hidden name="releaseDate" value="%{releaseDate}"/>
			</s:iterator>
			</tbody>
		</table>
		<div class="submit_btn_box">
			<div id=".contents-btn-set">
				<s:submit value="削除" class="submit_btn"/>
			</div>
		</div>
	</s:form>
</s:else>
</div>
<s:include value="footer.jsp"/>


</body>
</html>