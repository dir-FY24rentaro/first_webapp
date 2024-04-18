<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>九九</title>
    </head>
    <body>
      <ul>
        <%for(int i=1;i<10;i++) {%>
            <%for(int j=1;j<10;j++){  %>
            <li><%=i %>×<%=j %> = <%= i*j%></li>
            <%} %>
        <%} %>
      </ul>

    </body>
</html>
