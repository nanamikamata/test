<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者ユーザー詳細画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者ユーザー詳細画面</h1>

<s:if test="message == null">

<table class="vertical-list-table">
<tr>
	<th scope="row"><s:label value="ユーザーID"/></th>
	<td><s:property value="{#session.userId}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="パスワード"/>
	<td><s:property value="{#session.password}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="姓"/></th>
	<td><s:property value="{#session.familyName}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="名"/></th>
	<td><s:property value="{#session.firstName}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="姓ふりがな"/></th>
	<td><s:property value="{#session.familyNameKana}"/></td>
</tr>
<tr>
<th scope="row"><s:label value="名ふりがな"/></th>
<td><s:property value="{#session.firstNameKana}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="性別"/></th>
	<td><s:property value="{#session.sex}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="メールアドレス"/></th>
	<td><s:property value="{#session.email}"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="ステータス"/>
	<td><s:property value="{#session.status}"/>
</tr>
<tr>
	<th scope="row"><s:label value="ログイン状態"/>
	<td><s:property value="{#session.logined}"/>
</tr>
<tr>
	<th scope="row"><s:label value="登録日"/>
	<td><s:property value="{#session.registDate}"/>
</tr>
<tr>
	<th scope="row"><s:label value="update"/>
	<td><s:property value="{#session.updateDate}"/>
</tr>
</table>

<div id="footer">
	<s:include value="footer.jsp"/>
</div>
<s:form action="AdminUserDetailsAction">
	<s:param name="id" value="%{#session.id}"/>
	<input type="hidden" name="deleteFlg" value="1">
	<s:submit value="削除" class="submit_btn"/>
</s:form>
<s:form action="AdminUserEditAction">
	<s:param name="id" value="%{#session.id}"/>
	<s:submit value="編集" class="submit_btn"/>
</s:form>
</s:if>

	<s:if test="message != null">
	<h3><s:property value="message"/></h3>
	</s:if>
</div>
</body>
</html>