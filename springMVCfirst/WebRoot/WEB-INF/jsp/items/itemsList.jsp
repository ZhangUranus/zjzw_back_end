<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>访客名片</title>
</head>

<body> 
<div id="params">
<!--<button id="close">关闭窗口</button>-->
</div>

<!--<button id="outcall"> 外呼 </button>-->
<!--<button id="workRoundUp"> 结束善后 </button>-->
<!--<button id="canclose"> 禁止关闭窗口 </button>-->
<!--<button id="userId"> 更改用户信息 </button>-->
<!--<button id="updateHeight"> 更改高度 </button>-->

<!--<input id="heightValue" value="300"/>-->
<!-- 引用容器 js -->
<script src="https://os.alipayobjects.com/rmsportal/TioCsVbJfsmWnVRFWifG.js"></script>
<!--<script src="./csBridge.js"></script>-->
<script>
    // 窗口加载完毕之后
    window.onload = function () {
        //document.querySelector('#params').innerHTML = location.href;

        // 热线功能
        // 更改页面标题
        csbridge.modifyTabTitle('你好');

        document.getElementById('close').onclick = function () {
            // 关闭当前 Tab
            csbridge.closeCurrentTab();
        };

        document.getElementById('outcall').onclick = function () {
            // 外呼，参数为号码
            csbridge.outcall('13805782852');
        };

        document.getElementById('canclose').onclick = function () {
            // 设置当前 Tab 可否手动关闭
            csbridge.canClose(false);
        }

        document.getElementById('workRoundUp').onclick = function () {
            // 软电话结束善后
            csbridge.workRoundUp();
        }

        // 在线功能
        document.getElementById('userId').onclick = function () {
            csbridge.updateUserInfo({userId: '13516779247', userType: 'CC'})
        }
        document.getElementById('updateHeight').onclick = function () {
            csbridge.updateHeight(
                document.getElementById('heightValue').value
            );
        }
        updateHeight
    };
</script>


<form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">

<table  weith="512" heigth="200"  border=1>


<c:forEach items="${itemsList }" var="item">

<span style=" font-size:16px; line-height:19px; color:#333;">姓名：${item.username }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">身份证号：${item.idnum }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">性别：${item.sex }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">民族：汉族 </span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">登录名：${item.loginname }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">邮件：${item.email }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">手机：${item.mobile }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">邮编：${item.postcode }<br />
<span style=" font-size:16px; line-height:19px; color:#333;">生日：${item.birthday }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">省籍：${item.province }</span><br />
<span style=" font-size:16px; line-height:19px; color:#333;">住址：${item.homeaddress }</span><br />



</c:forEach>

</table>
</form>
</body>

</html>