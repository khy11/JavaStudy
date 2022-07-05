package org.myapp.mapper;

import java.util.List;

import org.myapp.domain.BoardAttachVO;

public interface BoardAttachMapper {
		public void insert(BoardAttachVO vo); //첨부파일 삽입
		public void delete(String uuid); //첨부파일 삭제
		public void deleteAll(Long bno); // 첨부파일 전체 삭제
		public List<BoardAttachVO> findByBno(Long bno); //특정번호로 첨부파일찾는 findbyBno() 메서드 
	
	}
