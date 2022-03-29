package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.ResumeDTO;

public interface ResumeService {
	
	//이력서 작성
	public void resume(ResumeDTO resume);
	
	//이력서 목록리스트
	public ArrayList<ResumeDTO> resumelist(Criteria cri);
	
	//이력서 상세페이지
	public ResumeDTO resume_m(ResumeDTO resume);
	
	//이력서 자격증
	public ArrayList<ResumeDTO> resume_license(int rno);
	
	//이력서 페이징에 쓰일 데이터건수
	public int getTotalCount(Criteria cri);
	
	//파일 관련
	public ArrayList<AttachFileDTO> rfileList(int rbno);
	
	public ArrayList<AttachFileDTO> rfileListPost(int rbno);
}
