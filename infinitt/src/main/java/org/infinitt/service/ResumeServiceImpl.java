package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.ResumeDTO;
import org.infinitt.mapper.AttachMapper;
import org.infinitt.mapper.ResumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResumeServiceImpl implements ResumeService{
	@Autowired
	private ResumeMapper rmapper;
	@Autowired
	private AttachMapper amapper;
	
	//이력서 작성
	public void resume(ResumeDTO resume) {
		System.out.println("resume attachList service = " + resume.getAttachList());
		rmapper.resume(resume);
		resume.getAttachList().forEach(attach->{
			attach.setRbno(resume.getRbno());
			amapper.rinsert(attach);
		});
	}
	
	//이력서 목록리스트
	public ArrayList<ResumeDTO> resumelist(Criteria cri){
		return rmapper.resumelist(cri);
	}
	
	//이력서 상세페이지
	@Transactional
	public ResumeDTO resume_m(ResumeDTO resume) {
		return rmapper.resume_m(resume);
	}
	
	//이력서 자격증
	public ArrayList<ResumeDTO> resume_license(int rbno) {
		return rmapper.resume_license(rbno);
	}
	
	//이력서 페이징에 쓰일 데이터건수
	public int getTotalCount(Criteria cri) {
		return rmapper.getTotalCount(cri);
	}
	
	//파일 관련
	public ArrayList<AttachFileDTO> rfileList(int rbno){
		return amapper.rfileList(rbno);
	}
	
	public ArrayList<AttachFileDTO> rfileListPost(int rbno){
		return amapper.rfileListPost(rbno);
	}
}