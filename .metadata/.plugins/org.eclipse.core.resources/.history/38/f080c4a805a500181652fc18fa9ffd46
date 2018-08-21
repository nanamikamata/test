<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>ItemDetails画面</title>

<style type="text/css">
/*========TAG LAYOUT========*/
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
	}
	/*========ID LAYOUT========*/
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

	#text-right{
		display:inline-block;
		text-align:right;}
	</style>

</head>
<body>
<div  id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemDetails</p>
		</div>
		<s:if test="itemListInfoDTO == null">
			<h3>商品詳細はありません。</h3>
		</s:if>
		<s:elseif test="message == null">
			<h3>商品詳細</h3>

		<table border="1">
		<tr>
		<th>商品名</th>
		<td><s:property value="%{#session.itemName}"/></td>
		</tr>
		<tr>
		<th>値段</th>
		<td><s:property value="%{#session.itemPrice}"/>円</td>
		</tr>
		<tr>
		<th>購入個数</th>
		<td><s:property value="%{#session.itemStock}"/>個</td>
		</tr>
		<tr>
		<th>仕入れ日</th>
		<td><s:property value="%{#session.insert_date}"/></td>
		</tr>
		<tr>
		<th>ID</th>
		<td><s:property value="%{#session.id}"/></td>
		</tr>
		</table>
		<s:form action="ItemDetailsAction">
				<s:param name="id" value="%{#session.id}"/>
				<input type="hidden" name="deleteFlg" value="1">
				<s:submit value="削除" method="delete"/>
			</s:form>
		</s:elseif>

		<s:if test="message!= null">
			<h3><s:property value="message"/></h3>
		</s:if>
			<div id="text-right">
				<p>商品一覧へ戻る場合は<a href='<s:url action="ItemListAction"/>'>こちら</a></p>
			</div>

	</div>
</body>
</html>