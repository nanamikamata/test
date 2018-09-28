<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者商品編集画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者商品詳細画面</h1>

		<table class="vertical-list-table">
			<s:form action="AdminProductEditConfirmAction">
				<tr>
					<td><label>商品ID:</label></td>
					<td><input type="text" name="productId" value=""/></td>
				</tr>
				<tr>
					<td><label>商品名:</label></td>
					<td><input type="text" name="productName" value=""/></td>
				</tr>
				<tr>
					<td><label>商品名ふりがな:</label></td>
					<td><input type="text" name="productNameKana" value=""/></td>
				</tr>
				<tr>
					<td><label>商品説明:</label></td>
					<td><input type="text" name="productDescription" value=""/></td>
				</tr>
				<tr>
					<td><label>カテゴリーID:</label></td>
					<td><input type="text" name="categoryId" value=""/></td>
				</tr>
				<tr>
					<td><label>値段:</label></td>
					<td><input type="text" name="price" value=""/></td>
				</tr>
				<tr>
					<td><label>商品画像:</label></td>
					<td><input type="text" name="imageFilePath" value=""/></td>
				</tr>
				<tr>
					<td><label>商品画像名:</label></td>
					<td><input type="text" name="imageFileName" value=""/></td>
				</tr>
				<tr>
					<td><label>発売年月日:</label></td>
					<td><input type="text" name="releaseDate" value=""/></td>
				</tr>
				<tr>
					<td><label>発売会社名:</label></td>
					<td><input type="text" name="releaseCompany" value=""/></td>
				</tr>
				<tr>
					<td><label>ステータス:</label></td>
					<td><input type="text" name="status" value=""/></td>
				</tr>

				<tr>
					<td><label>登録日:</label></td>
					<td><input type="text" name="registDate" value=""/></td>
				</tr>
				<tr>
					<td><label>アップデート日:</label></td>
					<td><input type="text" name="updateDate" value=""/></td>
				</tr>
				<s:submit value="登録"/>
			</s:form>
		</table>
			<div>
				<span>前画面に戻る場合は</span>
				<a href='<s:url action="AdminProductDetailsAction"/>'>こちら</a>
			</div>
		</div>

<div id="footer">
	<s:include value="footer.jsp"/>
</div>
</body>
</html>