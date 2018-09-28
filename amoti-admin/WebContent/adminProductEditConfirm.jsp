 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者商品編集確認画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者商品編集確認画面</h1>
		<div>
			<h3>登録内容は以下でよろしいですか。</h3>
			<table  class="vertical-list-table">
				<s:form action="AdminProductEditCompleteAction">
					<tr id="box">
						<td><label>商品ID:</label></td>
						<td><s:property value="productId" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>商品名:</label></td>
						<td><s:property value="productName" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>商品名ふりがな:</label></td>
						<td><s:property value="productNameKana" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>商品説明:</label></td>
						<td><s:property value="productDescription" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>カテゴリーID:</label></td>
						<td><s:property value="categoryId" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>値段:</label></td>
						<td><s:property value="price" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>商品画像:</label></td>
						<td><s:property value="imageFilePath" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>商品画像名:</label></td>
						<td><s:property value="imageFileName" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>発売年月日:</label></td>
						<td><s:property value="releaseDate" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>発売会社名:</label></td>
						<td><s:property value="releaseCompany" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>ステータス:</label></td>
						<td><s:property value="status" escape="false"/></td>
					</tr>

					<tr id="box">
						<td><label>登録日:</label></td>
						<td><s:property value="registDate" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>アップデート日:</label></td>
						<td><s:property value="updateDate" escape="false"/></td>
					</tr>
					<tr>
						<td><s:submit value="完了"/></td>
					</tr>
				</s:form>
			</table>
		</div>

	<div id="footer">
	<s:include value="footer.jsp"/>
</div>
</div>
</body>
</html>