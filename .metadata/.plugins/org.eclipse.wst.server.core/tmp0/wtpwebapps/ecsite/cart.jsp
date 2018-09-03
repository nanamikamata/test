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
<title>Cart画面</title>
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
	}
	/*========ecsite LAYOUT========*/
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

	#text-center{
		display:inline-block;
		text-align:center;
		}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>Cart</p>
		</div>

<div id="contents">
<p>カート詳細<p>

<s:if test="#session.buyItemListErrorMessageList!=null">
	<div class="error">
		<div class="error-message">
		<s:iterator value="#session.buyItemListErrorMessageList">
		<s:property />
		</s:iterator>
		</div>
	</div>
</s:if>

<s:if test="#session.cartInfoDtoList.size()>0">
<s:form id="form" action="BuyItemConfirmAction">
<table class="horizontal-list-table">
<thead>
<tr>
<th><s:label value="#"/></th>
<th><s:label value="商品名"/></th>
<th><s:label value="値段"/></th>
<th><s:label value="購入個数"/></th>
<th><s:label value="合計金額"/></th>
</tr>
</thead>
<tbody>
<s:iterator value="#session.cartInfoDtoList">
<tr>
	<td><s:checkbox name="checkList" value="checked" fieldValue="%{id}"/></td>
	<s:hidden name="id" value="%{id}"/>
	<td><s:property value="session.itemName"/></td>
	<td><s:property value="itemPrice"/>円</td>
	<td><s:property value="itemCount"/></td>
	<td><s:property value="subtotal"/>円</td>
</tr>
<s:hidden name="itemName" value="%{itemName}"/>
<s:hidden name="itemPrice" value="%{itemPrice}"/>
<s:hidden name="itemCount" value="%{itemCount}"/>
<s:hidden name="subtotal" value="%{subtotal}"/>
</s:iterator>
</tbody>
</table>
<h2><s:label value="カート合計金額 :"/><s:property value="#session.totalPrice"/>円</h2><br>
<div class="submit_btn_box">
	<div id=".contents-btn-set">
<s:submit value="決済" class="submit_btn"/>
</div>
</div>

<div class="submit_btn_box">
	<div id=".contents-btn-set">
<s:submit value="削除" class="submit_btn" onclick="this.form.action='DeleteCartAction';"/>
</div>
</div>

</s:form>
</s:if>
<s:else>
<div class="info">
カート情報はありません。
</div>
</s:else>
</div>
</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>