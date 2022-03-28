package org.infinitt.mapper;

import java.util.ArrayList;

import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;

public interface NewsMapper {
	//News 글쓰기와 관련되어있는 DB작업에 대한 설계
	public void newswrite(NewsDTO news);
	//News 파일와 관련되어있는 DB작업에 대한 설계
	public void insertSelectKey(NewsDTO news);
	//News 목록리스트와 관련되어있는 DB작업에 대한 설계
	public ArrayList<NewsDTO> news(Criteria cri);
	//News 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지와 관련되어있는 DB작업에 대한 설계
	public NewsDTO newsdetail(NewsDTO news);
	//News 목록리스트에서 제목을 클릭했을 때 조회수 +1 을 할 수 있는 DB작업에 대한 설계
	public void cntupdate(NewsDTO news);
	//News 글수정과 관련되어있는 DB작업에 대한 설계
	public void newsmodify(NewsDTO news);
	//News 글삭제와 관련되어있는 DB작업에 대한 설계
	public void newsremove(NewsDTO news);
	//News 페이징에 쓰일 전체 건수와 관련되어있는 DB작업에 대한 설계
	public int getTotalCount(Criteria cri);
	
	//메인 페이지
	public ArrayList<NewsDTO> getNews(NewsDTO news);
}