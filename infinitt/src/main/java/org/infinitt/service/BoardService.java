package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.BoardDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.PrevNextDTO;
import org.infinitt.domain.ReplyDTO;

public interface BoardService { 
	//�Խ��� �۾���
	public void write(BoardDTO board);
	
	//�Խ��� ��ϸ���Ʈ
	public ArrayList<BoardDTO> essay(Criteria cri);

	//�Խ��� ��ϸ���Ʈ���� ������ Ŭ������ �� ������ ������ ��������
	public BoardDTO detail(BoardDTO board);
	
	public PrevNextDTO detail2(PrevNextDTO pnBoard);
	
	//�Խ��� ����������
	public void modify(BoardDTO board);
	
	//�Խ��� ����������
	public void remove(BoardDTO board);
	
	//�Ի��� ����¡�� ���� �����ͰǼ�
	public int getTotalCount(Criteria cri);
	
	//�Խ��� ���������� ���Ͼ��ε�� �̹��� ���
	public ArrayList<AttachFileDTO> fileList(int bno);
	
	public ArrayList<AttachFileDTO> fileListPost(int bno);

	
	public void delete(AttachFileDTO aboard);
	
	public boolean fileDelete(AttachFileDTO attach);
	
	public void replyPost(ReplyDTO rdto);
	
	public ArrayList<ReplyDTO> replyGet(ReplyDTO rdto);
	
	public ArrayList<AttachFileDTO> imgGet(AttachFileDTO attach);
	
	
	
	public void remove(int bno);
	public void removeReply(ReplyDTO rdto);
	public void modifyReply(ReplyDTO rdto);
	

	

	
}
