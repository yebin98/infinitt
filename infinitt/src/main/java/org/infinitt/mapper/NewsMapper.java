package org.infinitt.mapper;

import java.util.ArrayList;

import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;

public interface NewsMapper {
	//News �۾���� ���õǾ��ִ� DB�۾��� ���� ����
	public void newswrite(NewsDTO news);
	//News ���Ͽ� ���õǾ��ִ� DB�۾��� ���� ����
	public void insertSelectKey(NewsDTO news);
	//News ��ϸ���Ʈ�� ���õǾ��ִ� DB�۾��� ���� ����
	public ArrayList<NewsDTO> news(Criteria cri);
	//News ��ϸ���Ʈ���� ������ Ŭ������ �� ������ ������ ���������� ���õǾ��ִ� DB�۾��� ���� ����
	public NewsDTO newsdetail(NewsDTO news);
	//News ��ϸ���Ʈ���� ������ Ŭ������ �� ��ȸ�� +1 �� �� �� �ִ� DB�۾��� ���� ����
	public void cntupdate(NewsDTO news);
	//News �ۼ����� ���õǾ��ִ� DB�۾��� ���� ����
	public void newsmodify(NewsDTO news);
	//News �ۻ����� ���õǾ��ִ� DB�۾��� ���� ����
	public void newsremove(NewsDTO news);
	//News ����¡�� ���� ��ü �Ǽ��� ���õǾ��ִ� DB�۾��� ���� ����
	public int getTotalCount(Criteria cri);
	
	//���� ������
	public ArrayList<NewsDTO> getNews(NewsDTO news);
}