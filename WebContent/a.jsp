<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%! int i = 10;
String name = "ȫ�浿";
%>
<html>
<body>
    <h1>
<% 

for(int i=0; i<10; i++){
    out.print(i+" ");
}
%>
<%=i%>
    </h1>
    <%=name%>
    <a></a>
</body>
</html>