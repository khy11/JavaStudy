<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Typec" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>�̰Ŵ� ajax�� ���Ͼ��ε� �ϴ� ���</h3>

<div class='uploadDiv'>
<input type = 'file' id= 'file' name='uploadFile' multiple >
</div>

<button id='uploadBtn'>���ε� ��ư</button>

<!-- �ڹٽ�ũ��Ʈ ��� jquery cdn �̿��Ͽ� uploadAjaxó�� (÷������) -->
<script 
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
  
 <script> 
 $(document).ready(function() {
	 var regex = $('#file') .val();// ����Ȯ���� �з�
		 
		 if(regex !="") {
			 var regex = fileVal.split('.').pop().toLowerCase(); // Ȯ����-���ϸ� �и�
			 alert("�ش� Ȯ������ ������ ���ε尡 �Ұ����մϴ�.");
			 return ;
		 }
	 }
	 
	 $("#uploadBtn").on("click", function(e) { 
		 var formData = new FormData(); //form ��� ������ form �±� �̿� (formdata ��ü�� �Ķ���� �Ǿ ����)
		 var inputFile = $("input[name='uploadFile']");
		 var files = inputFile[0].files;
		 console.log(files);
		 
		 //file �����͸� formData�� �ű�� 
		 
		 for(var i = 0; i < files.length; i++) {
			 formData.append("uploadFile", files[i]);
		 }
		 
		 $.ajax({
			url: '/uploadAjaxAction',
			processData: false, //false�� �����ؾ� ���۵� 
			contentType: false,
			data: formData,
			type: 'POST',
			sucess:function(result) {
				alert("Uploaded");
			}
		 }); //$.ajax
	 });
 });
 </script> 
 
 
</body>
</html>