<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/cryptocurrencymarket?characterEncoding=utf-8", "root",
				"");
            PreparedStatement ps = con.prepareStatement("SELECT  * FROM member WHERE " +
                    "email = ?");
            ps.setString(1,request.getParameter("email"));
            ResultSet res = ps.executeQuery();
            if(res.first()){
                out.print("User already exists");
            }else{
                out.print("User name is valid");
            }
        }catch (Exception e){
            System.out.println(e);  
        }
%>
