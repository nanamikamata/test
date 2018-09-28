<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>adminUserList画面</title>
<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana,Helvetica,sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}

		table{
			text-align:center;
			margin:0 auto;
			border:1px solid black;
		}
		/* ========ID LAYOUT======== */
		#top{
			width:780px;
			margin:30px auto;
			border:1px solid #333;
		}

		#header{
			width:100%;
			height:80px;
			background-color:black;
		}

		#main{
			width:100%;
			height:500px;
			text-align:center;
		}

		#footer{
			width:100%;
			height:80px;
			background-color:black;
			clear:both;
		}
</style>
</head>
<body>
<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserList</p>
		</div>
		<div id="userList">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>ユーザーID</th>
					<th>パスワード</th>
					<th>姓</th>
					<th>名</th>
					<th>姓かな</th>
					<th>名かな</th>
					<th>性別</th>
					<th>メールアドレス</th>
					<th>ステータス</th>
					<th>ログイン日</th>
					<th>登録日時</th>
					<th>更新日時</th>
				</tr>
				<s:iterator value="adminUserList">
					<tr>
						<td><s:property value="id"/></td>
						<td><a href='<s:url action="AdminUserDetailsAction"><s:param name="id" value="%{id}"/></s:url>'><s:property value="userId"/></a></td>
						<td><s:property value="password"/></td>
						<td><s:property value="familyName"/></td>
						<td><s:property value="firstName"/></td>
						<td><s:property value="familyNameKana"/></td>
						<td><s:property value="firstNameKana"/></td>
						<td><s:property value="sex"/></td>
						<td><s:property value="email"/></td>
						<td><s:property value="status"/></td>
						<td><s:property value="logined"/></td>
						<td><s:property value="registDate"/></td>
						<td><s:property value="updateDate"/></td>
					</tr>
				</s:iterator>
			</table>
		</div>
		<div id="text-center">
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>