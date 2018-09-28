<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css"/>
<title>管理者画面</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div id="contents">
<h1>管理者ホーム画面</h1>


<div class="submit_btn_box">
    <div id=".contents-btn-set">
    <s:form action="AdminProductRegistAction">
        <s:submit value="商品追加画面" class="submit_btn2"/>
    </s:form>
    </div>
</div>

<div class="submit_btn_box">
    <div id=".contents-btn-set">
    <s:form action="AdminProductListAction">
        <s:submit value="商品一覧画面" class="submit_btn2"/>
    </s:form>
    </div>
</div>

<div class="submit_btn_box">
    <div id=".contents-btn-set">
    <s:form action="AdminUserRegistAction">
        <s:submit value="ユーザー追加" class="submit_btn2"/>
    </s:form>
    </div>
</div>

<div class="submit_btn_box">
    <div id=".contents-btn-set">
    <s:form action="AdminUserListAction">
        <s:submit value="ユーザー一覧" class="submit_btn2"/>
    </s:form>
    </div>
</div>



<div class="submit_btn_box">
    <div id=".contents-btn-set">
    <s:form action="AdminAllSelectAction">
        <s:submit value="データ一覧" class="submit_btn2"/>
    </s:form>
    </div>
</div>

</div>

<s:include value="footer.jsp"/>




</body>
</html>