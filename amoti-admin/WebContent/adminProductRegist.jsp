<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品登録画面</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div id="contents">
	<h1>商品情報入力画面</h1>

	<s:if test="!#session.productNameErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
			<s:iterator value="#session.productNameErrorMessageList"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="!#session.productNameKanaErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
		<s:iterator value="#session.productNameKanaErrorMessageList"><s:property/><br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="!#session.productDescriptionErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
		<s:iterator value="#session.productDescriptionErrorMessageList"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="!#session.priceErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
		<s:iterator value="#session.priceErrorMessageList"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="!#session.releaseCompanyErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
		<s:iterator value="#session.releaseCompanyErrorMessageList"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="!#session.releaseDateErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
		<s:iterator value="#session.releaseDateErrorMessageList"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="!#session.userImageFileNameErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
		<s:iterator value="#session.userImageFileNameErrorMessageList"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>



	<s:form action="AdminProductRegistConfirmAction">

	<table class="vertical-list-table">
	<tr>
		<th scope="row">商品カテゴリ</th>
		<td>カテゴリーから選択<s:select name="categoryId" list="%{#session.mCategoryDtoList}" listValue="categoryName" listKey="categoryId" class="cs-div" id="categoryId" /></td>
	</tr>
	<tr>
		<th scope="row">商品名</th>
		<td><s:textfield name="productName" value="%{#session.productName}" label="商品名" placeholder="商品名" class="txt" /></td>
	</tr>
	<tr>
		<th scope="row">商品名ふりがな</th>
		<td><s:textfield name="productNameKana" value="%{#session.productNameKana}" label="商品名ふりがな" placeholder="商品名ふりがな" class="txt" /></td>
	</tr>
	<tr>
		<th scope="row">商品詳細</th>
		<td><s:textarea name="productDescription" value="%{#session.productDescription}" label="商品詳細" placeholder="商品詳細" class="area" /></td>
	</tr>
	<tr>
		<th scope="row">価格</th>
		<td><s:textfield name="price" value="%{#session.price}" label="価格" placeholder="家格" class="txt" /></td>
	</tr>
	<tr>
		<th scope="row">発売会社名</th>
		<td><s:textfield name="releaseCompany" value="%{#session.releaseCompany}" label="発売会社名" placeholder="発売会社名" class="txt" /></td>
	</tr>

<!-- ? -->
	<tr>
		<th scope="row">発売年月日</th>
		<td><s:textfield name="releaseDate" value="%{#session.releaseDate}" label="発売年月日" placeholder="発売年月日" class="txt"/></td>
	</tr>
	<tr>
		<th scope="row">画像ファイル</th>
		<td><s:file name="userImage" label="画像ファイル" placeholder="画像ファイル" class="file"/></td>
	</tr>

</table>
<div class="submit_btn_box">
<div id=".contents-btn-set">
<s:submit value="登録" class="submit_btn" />
</div>
</div>
</s:form>
</div>
<div id="footer">
	<s:include value="footer.jsp"/>

</div>

</body>
</html>