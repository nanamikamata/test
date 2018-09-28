<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>ホーム</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>ホーム画面</h1>
<div class="type-textbound">
  <span class="textbound1">L</span>
  <span class="textbound2">O</span>
  <span class="textbound3">G</span>
  <span class="textbound4">O</span>
</div>
</div>
<s:include value="footer.jsp"/>
</body>
</html>