package org.myapp.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
	public class UploadController {
		@GetMapping("/uploadForm")
		public void uploadForm() {
			System.out.println("form 테스트");
		}
		
		@PostMapping("/uploadFormAction")
		public void uploadFormAction(MultipartFile[] uploadFile, Model model) {
			
			String uploadFolder = "C:\\upload";
			for(MultipartFile multipartFile:uploadFile) {
				System.out.println("업로드완료");
				
			File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
			
			try {
				multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				log.error(e.getMessage());
					
					
				} // end catch
			} //end for 
		}	

			
	//여기부터 ajax로 파일 업로드하는 방법
			@GetMapping("/uploadAjax")
			public void uploadAjax() {
				log.info("ajax업로드 테스트");
			}
			
			@PostMapping("/uploadAjaxAction")
			public void uploadAjaxAction(MultipartFile[] uploadFile) {
				
				String uploadFolder = "C:\\upload"; //ajax는 model을 사용할 필요가 없음 
				for(MultipartFile multipartFile : uploadFile) {
					
					String uploadFileName = multipartFile.getOriginalFilename();
					
					//IE has file path 
					uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\")+1);
					//IE의 경우 전체파일경로가 전송되며 \를 기준으로 자른 문자열이 실제 파일이름이 된다
					File saveFile = new File(uploadFolder, uploadFileName);
					
					try {
						multipartFile.transferTo(saveFile);
					}catch (Exception e) {
						log.error(e.getMessage());
					} //end catch
				} //end for
			}
}
