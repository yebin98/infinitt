package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.BoardDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.ReplyDTO;

public interface BoardService { 
	//게시판 글쓰기
	public void write(BoardDTO board);
	
	//게시판 목록리스트
	public ArrayList<BoardDTO> essay(Criteria cri);

	//게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지
	public BoardDTO detail(BoardDTO board);
	
	//게시판 수정페이지
	public void modify(BoardDTO board);
	
	//게시판 삭제페이지
	public void remove(BoardDTO board);
	public void remove(int bno);
	
	//게사판 페이징에 쓰일 데이터건수
	public int getTotalCount(Criteria cri);
	
	//파일업로드
	public ArrayList<AttachFileDTO> fileList(int bno);
	public ArrayList<AttachFileDTO> fileListPost(int bno);
	public void delete(AttachFileDTO aboard);
	public boolean fileDelete(AttachFileDTO attach);
	
	//파일
	public ArrayList<AttachFileDTO> imgGet(AttachFileDTO attach);
	
	//댓글 쓰기
	public void replyPost(ReplyDTO rdto);
	
	//댓글 확인
	public ArrayList<ReplyDTO> replyGet(ReplyDTO rdto);
	
	//댓글 수정
	public void modifyReply(ReplyDTO rdto);
	
	//댓글 삭제
	public void removeReply(ReplyDTO rdto);
}