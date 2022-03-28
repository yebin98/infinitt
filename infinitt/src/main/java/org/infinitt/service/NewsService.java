package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;

public interface NewsService {
	//News �۾���
	public void newswrite(NewsDTO news);
	//News ��ϸ���Ʈ
	public ArrayList<NewsDTO> news(Criteria cri);
	//News ��ϸ���Ʈ���� ������ Ŭ������ �� ������ ������ ��������
	public NewsDTO newsdetail(NewsDTO news);
	//News ����������
	public void newsmodify(NewsDTO news);
	//News ����������
	public void newsremove(NewsDTO news);
	//News ����¡�� ���� �����ͰǼ�
	public int getTotalCount(Criteria cri);
	
	//���Ͼ��ε�
	public ArrayList<AttachFileDTO> nfileList(int nbno);
	public ArrayList<AttachFileDTO> nfileListPost(int nbno);
	public void delete(AttachFileDTO aboard);
	public boolean fileDelete(AttachFileDTO attach);
	
	//���� ������
	public ArrayList<NewsDTO> getNews(NewsDTO news);
}
