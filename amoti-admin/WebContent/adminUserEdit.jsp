<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者ユーザー編集画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者ユーザー詳細画面</h1>

		<table class="vertical-list-table">
			<s:form action="AdminUserEditConfirmAction">
				<tr>
					<td><label>ユーザーID:</label></td>
					<td><input type="text" name="userId" value=""/></td>
				</tr>
				<tr>
					<td><label>パスワード:</label></td>
					<td><input type="text" name="password" value=""/></td>
				</tr>
				<tr>
					<td><label>姓:</label></td>
					<td><input type="text" name="familyName" value=""/></td>
				</tr>
				<tr>
					<td><label>名:</label></td>
					<td><input type="text" name="firstName" value=""/></td>
				</tr>
				<tr>
					<td><label>姓ふりがな:</label></td>
					<td><input type="text" name="familyNameKana" value=""/></td>
				</tr>
				<tr>
					<td><label>名ふりがな:</label></td>
					<td><input type="text" name="firstNameKana" value=""/></td>
				</tr>
				<tr>
					<td><label>性別:</label></td>
					<td><input type="radio" name="sex" list="%{#session.sexList}" value=0>男</td>
					<td><input type="radio" name="sex" value=1>女</td>
				</tr>
				<tr>
					<td><label>メールアドレス:</label></td>
					<td><input type="text" name="email" value=""/></td>
				</tr>
				<s:submit value="登録"/>
			</s:form>
		</table>
			<div>
				<span>前画面に戻る場合は</span>
				<a href='<s:url action="AdminUserDetailsAction"/>'>こちら</a>
			</div>
		</div>
<div id="footer">
	<s:include value="footer.jsp"/>
</div>
</body>
</html>