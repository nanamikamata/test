<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者ユーザー編集確認画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者ユーザー編集確認画面</h1>
		<div>
			<h3>登録内容は以下でよろしいですか。</h3>
			<table  class="vertical-list-table">
				<s:form action="AdminUserEditCompleteAction">
				<table>
					<tr id="box">
						<td><label>ユーザーID:</label></td>
						<td><s:property value="#session.userId" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>パスワード:</label></td>
						<td><s:property value="#session.password" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>姓:</label></td>
						<td><s:property value="#session.familyName" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>名:</label></td>
						<td><s:property value="#session.firstName" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>姓ふりがな:</label></td>
						<td><s:property value="#session.familyNameKana" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>名ふりがな:</label></td>
						<td><s:property value="#session.firstNameKana" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>性別:</label></td>
						<td><s:property value="#session.sex" escape="false"/></td>
					</tr>
					<tr id="box">
						<td><label>メールアドレス:</label></td>
						<td><s:property value="#session.email" escape="false"/></td>
					</tr>
					<tr>
						<td><s:submit value="完了"/></td>
					</tr>
					</table>
				</s:form>
			</table>
		</div>

	<div id="footer">
	<s:include value="footer.jsp"/>
</div>
</div>
</body>
</html>