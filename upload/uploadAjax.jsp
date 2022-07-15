<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Typec" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="field">
	<h4>첨부파일</h4>
	<input type="file" name="uploadFile" multiple />
</div>
<div class="uploadResult">
	<ul></ul>
</div>

<!-- 첨부파일 용량, 확장자 , 크기 제한 -->
 <script>
   	$(document).ready(function(e) {
		var formObj = $("form[role='form']");
		$("button[type='submit']").on("click", function(e) {
			e.preventDefault(); // 로직이 수행된 후 서브밋을 하기 위해 서브밋을 막기위한 처리.
			console.log("submit clicked");
		});
		
		var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
		var maxSize = 1024 * 1024 * 5; // 5MB
		
		function checkExtension(fileName, fileSize) {
			if(fileSize >= maxSize){
				alert("5mb이하 파일만 업로드 가능합니다.");
				return false;
			} 
			if(regex.test(fileName)){
				alert("해당 확장자 파일은 업로드할 수 없습니다.");
				return false;
			}
			return true;
		}
		
		$("input[type='file']").change(function(e){
			var formData = new FormData();
			var inputFile = $("input[name='uploadFile']");
			var files = inputFile[0].files;
			
			for(var i = 0; i < files.length; i++ ) {
				if(!checkExtension(files[i].name, files[i].size)){
					return false;
				}
				formData.append("uploadFile", files[i]);
			}
			
			$.ajax({
				url : "/uploadAjaxAction",
				processData : false,
				contentType : false,
				data : formData,
				type : "POST",
				dataType : "JSON",
					success: function(result) {
						console.log(result);
					}
			});
			
		});
		
	});
   </script>
</body>
</html>