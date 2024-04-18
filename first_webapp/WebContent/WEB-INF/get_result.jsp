<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8") ;%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>クエリパラメータのテスト</title>
    </head>
    <body>
    <p>送信パラメータ:<%= request.getAttribute("q") %></p>

    </body>
</html>
