package org.infinitt.mapper;

import java.util.ArrayList;

import org.infinitt.domain.Criteria;
import org.infinitt.domain.ResumeDTO;

public interface ResumeMapper {
	//이력서 작성
	public void resume(ResumeDTO resume);
	
	//이력서 파일와 관련되어있는 DB작업에 대한 설계
	public void insertSelectKey(ResumeDTO resume);
	
	//이력서 목록리스트
	public ArrayList<ResumeDTO> resumelist(Criteria cri);
	
	//이력서 상세페이지
	public ResumeDTO resume_m(ResumeDTO resume);
	
	//이력서 자격증
	public ArrayList<ResumeDTO> resume_license(int rbno);
	
	//이력서 페이징에 쓰일 데이터건수
	public int getTotalCount(Criteria cri);
}
