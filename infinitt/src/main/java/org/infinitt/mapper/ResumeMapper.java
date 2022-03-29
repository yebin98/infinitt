package org.infinitt.mapper;

import java.util.ArrayList;

import org.infinitt.domain.Criteria;
import org.infinitt.domain.ResumeDTO;

public interface ResumeMapper {
	//�̷¼� �ۼ�
	public void resume(ResumeDTO resume);
	
	//�̷¼� ���Ͽ� ���õǾ��ִ� DB�۾��� ���� ����
	public void insertSelectKey(ResumeDTO resume);
	
	//�̷¼� ��ϸ���Ʈ
	public ArrayList<ResumeDTO> resumelist(Criteria cri);
	
	//�̷¼� ��������
	public ResumeDTO resume_m(ResumeDTO resume);
	
	//�̷¼� �ڰ���
	public ArrayList<ResumeDTO> resume_license(int rbno);
	
	//�̷¼� ����¡�� ���� �����ͰǼ�
	public int getTotalCount(Criteria cri);
}
