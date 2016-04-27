<%--
  Created by IntelliJ IDEA.
  User: KangYong
  Date: 2016-04-27
  Time: 오후 5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
이름 : <input type="text" name="name" id="name" value="arahansa" /> <br>
나이 : <input type="text" name="age" id="age" value="30" /> <br>

<button onclick="ajaxPost()">등록</button>
<script src="/js/jquery-1.12.3.min.js" ></script>
<script>
  function ajaxPost(){
    var req = { name : $("#name").val(), age : $("#age").val() };
    console.log("포스트  : ", req);
    $.ajax({
      type : 'POST',
      url : '/test/jsonreq',
      contentType: 'application/json',
      dataType: 'json',
      data : JSON.stringify( req ),
      success : function(result){
        console.log(result);
      },error : function (result){
        console.log(result);
      }
    });
  }
</script>


</body>
</html>
