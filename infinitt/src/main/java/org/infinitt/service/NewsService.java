package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;

public interface NewsService {
	//News 글쓰기
	public void newswrite(NewsDTO news);
	//News 목록리스트
	public ArrayList<NewsDTO> news(Criteria cri);
	//News 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지
	public NewsDTO newsdetail(NewsDTO news);
	//News 수정페이지
	public void newsmodify(NewsDTO news);
	//News 삭제페이지
	public void newsremove(NewsDTO news);
	//News 페이징에 쓰일 데이터건수
	public int getTotalCount(Criteria cri);
	
	//파일업로드
	public ArrayList<AttachFileDTO> nfileList(int nbno);
	public ArrayList<AttachFileDTO> nfileListPost(int nbno);
	public void delete(AttachFileDTO aboard);
	public boolean fileDelete(AttachFileDTO attach);
	
	//메인 페이지
	public ArrayList<NewsDTO> getNews(NewsDTO news);
}
