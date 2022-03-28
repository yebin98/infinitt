package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;
import org.infinitt.mapper.AttachMapper;
import org.infinitt.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsMapper nmapper;
	@Autowired
	private AttachMapper amapper;
	
	//게시판 글쓰기 설계된 것 구현
	@Transactional
	public void newswrite(NewsDTO news) {
		nmapper.insertSelectKey(news);
		if(news.getAttachList() != null) {
			news.getAttachList().forEach(attach->{
				attach.setNbno(news.getNbno());
				amapper.ninsert(attach);
			});
		}else {
			System.out.println("사진 없이 업로드");
		}		
	}
	
	//게시판 목록리스트 설계된 것 구현
	public ArrayList<NewsDTO> news(Criteria cri) {
		return nmapper.news(cri);
	}

	@Transactional
	//게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지 설계된 것을 구현
	public NewsDTO newsdetail(NewsDTO news) {
		//조회수
		nmapper.cntupdate(news);
		return nmapper.newsdetail(news);
	}
	
	//게시판 글수정 설계된 것 구현
	@Transactional
	public void newsmodify(NewsDTO news) {
		nmapper.newsmodify(news);
	}
	
	//게시판 글삭제 설계된 것 구현
	public void newsremove(NewsDTO news) {
		nmapper.newsremove(news);
	}
	
	//게사판 페이징에 쓰일 데이터건수
	public int getTotalCount(Criteria cri) {
		return nmapper.getTotalCount(cri);
	}
	
	//파일업로드
	public ArrayList<AttachFileDTO> nfileList(int nbno){
		return amapper.nfileList(nbno);
	}
	
	public ArrayList<AttachFileDTO> nfileListPost(int nbno){
		return amapper.nfileListPost(nbno);
	}
	
	public void delete(AttachFileDTO aboard) {
		 amapper.delete(aboard);
	}

	public boolean fileDelete(AttachFileDTO attach) {
		return amapper.fileDelete(attach);
	}
	
	//메인페이지
	public ArrayList<NewsDTO> getNews(NewsDTO news) {

		return nmapper.getNews(news);
	}	
}