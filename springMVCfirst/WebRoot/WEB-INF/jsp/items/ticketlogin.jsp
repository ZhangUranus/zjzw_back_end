<%@page import="com.commnetsoft.proxy.call.HttpCallSso"%>
<%@page import="com.commnetsoft.proxy.model.AppTicket"%>
<%@page import="com.commnetsoft.proxy.model.UserInfo"%>
<%@page import="com.commnetsoft.proxy.model.CallResult"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.commnetsoft.proxy.SsoClient"%>
<%@page import="com.commnetsoft.proxy.util.ConfigHelper"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>单点登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <%
    	String ticket = request.getParameter("ticket");//获取票据
    	String sp = request.getParameter("sp");//具体事项页面地址 如http://aa.com/item?id=3232
       	SsoClient client = SsoClient.getInstance();//单点登录工具
       	client.initConfig("15068107207", "123@Nokia", "http://puser.zjzwfw.gov.cn/sso/");
       	//登录认证
       	CallResult cr = client.login("15068107207", "001","123@Nokia");
       	out.println("单点登录，错误码："+cr.getResult()+"，错误信息："+cr.getErrmsg()+"。 ");
       	out.println("<br> ");
       	if("0".equals(cr.getResult())){//认证成功登录系统
       		UserInfo user = client.getUser(request);
       		out.print("获取用户信息，错误码："+user.getResult()+"，错误信息："+user.getErrmsg()+"。用户信息 "+user.getUsername());
       		if("0".equals(cr.getResult())){
       			//TODO 获取用户信息成功， 相关业务
       			
       			//TODO 
       			if(sp == null){//跳转到首页
       				
       			}else{//跳转到具体事项页面
       				
       			}
       		}
       	}else{//认证失败
       		out.print("单点登录失败，错误码："+cr.getResult()+"，错误信息："+cr.getErrmsg()+"。 ");
       		String url = ConfigHelper.getProperty("url");
       		String servicecode = ConfigHelper.getProperty("servicecode");
       		url = url+"usp.do?action=ssoLogin&servicecode="+servicecode;
       		out.print(" <a href='"+url+"'>重新登录</a>");
       	}
    %>
  </body>
</html>
