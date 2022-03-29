package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.ResumeDTO;

public interface ResumeService {
	
	//�̷¼� �ۼ�
	public void resume(ResumeDTO resume);
	
	//�̷¼� ��ϸ���Ʈ
	public ArrayList<ResumeDTO> resumelist(Criteria cri);
	
	//�̷¼� ��������
	public ResumeDTO resume_m(ResumeDTO resume);
	
	//�̷¼� �ڰ���
	public ArrayList<ResumeDTO> resume_license(int rno);
	
	//�̷¼� ����¡�� ���� �����ͰǼ�
	public int getTotalCount(Criteria cri);
	
	//���� ����
	public ArrayList<AttachFileDTO> rfileList(int rbno);
	
	public ArrayList<AttachFileDTO> rfileListPost(int rbno);
}
