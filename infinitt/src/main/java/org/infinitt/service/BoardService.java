package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.BoardDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.ReplyDTO;

public interface BoardService { 
	//�Խ��� �۾���
	public void write(BoardDTO board);
	
	//�Խ��� ��ϸ���Ʈ
	public ArrayList<BoardDTO> essay(Criteria cri);

	//�Խ��� ��ϸ���Ʈ���� ������ Ŭ������ �� ������ ������ ��������
	public BoardDTO detail(BoardDTO board);
	
	//�Խ��� ����������
	public void modify(BoardDTO board);
	
	//�Խ��� ����������
	public void remove(BoardDTO board);
	public void remove(int bno);
	
	//�Ի��� ����¡�� ���� �����ͰǼ�
	public int getTotalCount(Criteria cri);
	
	//���Ͼ��ε�
	public ArrayList<AttachFileDTO> fileList(int bno);
	public ArrayList<AttachFileDTO> fileListPost(int bno);
	public void delete(AttachFileDTO aboard);
	public boolean fileDelete(AttachFileDTO attach);
	
	//����
	public ArrayList<AttachFileDTO> imgGet(AttachFileDTO attach);
	
	//��� ����
	public void replyPost(ReplyDTO rdto);
	
	//��� Ȯ��
	public ArrayList<ReplyDTO> replyGet(ReplyDTO rdto);
	
	//��� ����
	public void modifyReply(ReplyDTO rdto);
	
	//��� ����
	public void removeReply(ReplyDTO rdto);
}