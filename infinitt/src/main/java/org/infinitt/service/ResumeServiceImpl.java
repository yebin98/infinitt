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
	
	//�̷¼� �ۼ�
	public void resume(ResumeDTO resume) {
		System.out.println("resume attachList service = " + resume.getAttachList());
		rmapper.resume(resume);
		resume.getAttachList().forEach(attach->{
			attach.setRbno(resume.getRbno());
			amapper.rinsert(attach);
		});
	}
	
	//�̷¼� ��ϸ���Ʈ
	public ArrayList<ResumeDTO> resumelist(Criteria cri){
		return rmapper.resumelist(cri);
	}
	
	//�̷¼� ��������
	@Transactional
	public ResumeDTO resume_m(ResumeDTO resume) {
		return rmapper.resume_m(resume);
	}
	
	//�̷¼� �ڰ���
	public ArrayList<ResumeDTO> resume_license(int rbno) {
		return rmapper.resume_license(rbno);
	}
	
	//�̷¼� ����¡�� ���� �����ͰǼ�
	public int getTotalCount(Criteria cri) {
		return rmapper.getTotalCount(cri);
	}
	
	//���� ����
	public ArrayList<AttachFileDTO> rfileList(int rbno){
		return amapper.rfileList(rbno);
	}
	
	public ArrayList<AttachFileDTO> rfileListPost(int rbno){
		return amapper.rfileListPost(rbno);
	}
}