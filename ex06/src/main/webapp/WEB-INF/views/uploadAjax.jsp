<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Typec" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>이거는 ajax로 파일업로드 하는 방법</h3>

<div class='uploadDiv'>
<input type = 'file' id= 'file' name='uploadFile' multiple >
</div>

<button id='uploadBtn'>업로드 버튼</button>

<!-- 자바스크립트 대신 jquery cdn 이용하여 uploadAjax처리 (첨부파일) -->
<script 
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
  
 <script> 
 $(document).ready(function() {
	 var regex = $('#file') .val();// 파일확장자 분류
		 
		 if(regex !="") {
			 var regex = fileVal.split('.').pop().toLowerCase(); // 확장자-파일명 분리
			 alert("해당 확장자의 파일은 업로드가 불가능합니다.");
			 return ;
		 }
	 }
	 
	 $("#uploadBtn").on("click", function(e) { 
		 var formData = new FormData(); //form 대신 가상이 form 태그 이용 (formdata 객체로 파라미터 실어서 전송)
		 var inputFile = $("input[name='uploadFile']");
		 var files = inputFile[0].files;
		 console.log(files);
		 
		 //file 데이터를 formData로 옮기기 
		 
		 for(var i = 0; i < files.length; i++) {
			 formData.append("uploadFile", files[i]);
		 }
		 
		 $.ajax({
			url: '/uploadAjaxAction',
			processData: false, //false로 지정해야 전송됨 
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