<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<title>BuyItem画面</title>

<style type="text/css">
/*========TAG LAYOUT========*/
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
}

table {
	text-align: center;
	margin: 0 auto;
}
/*========ID LAYOUT========*/
#top {
	width: 780px;
	margin: 30px auto;
	border: 1px solid #333;
}

#header {
	width: 100%;
	height: 80px;
	background-color: black;
}

#main {
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>

		<div>
			<s:if test="buyItemListDTO == null">
			<h3>商品詳細はありません。</h3>
		</s:if>
		<s:elseif test="message == null">
			<h3>商品詳細</h3>
		<s:form action="BuyItem2Action">
		<table>
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
		<td><select name="count">
				<option value="1" selected="selected">1個</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select></td>
		</tr>
		<tr>
		<th>仕入れ日</th>
		<td><s:property value="%{#session.insert_date}"/></td>
		</tr>
		<tr>
		<th>ID</th>
		<td><s:property value="%{#session.id}"/></td>
		</tr>
		<tr>
			<td><span>支払い方法</span></td>
			<td><input type="radio" name="pay" value="1" checked="checked">現金払い
			<input type="radio" name="pay" value="2">クレジットカード</td>
		</tr>
		<tr>
			<td>
				<s:param name="id" value="%{#session.id}"/>
				<input type="hidden" name="" value="1">
				<s:submit value="購入" method=""/>
			</td>
		</tr>



		</table>

<div class="submit_btn_box">
		<s:hidden name="itemId" value="%{#session.itemId}"/>
		<s:hidden name="itemName" value="%{#session.itemName}"/>
		<s:hidden name="itemPrice" value="%{#session.itemPrice}"/>
		<s:submit value="カートに追加" class="submit_btn" />
		</div>


			</s:form>
		</s:elseif>

				<div>
					<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
					<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
				</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>