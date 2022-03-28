package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.BoardDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.ReplyDTO;
import org.infinitt.mapper.AttachMapper;
import org.infinitt.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // ���� ���� �ο�
public class BoardServiceImpl implements BoardService{ 
	@Autowired
	private BoardMapper bmapper;
	@Autowired
	private AttachMapper amapper;
	
	//�Խ��� �۾��� ����� �� ����
	@Transactional
	public void write(BoardDTO board) {
		bmapper.insertSelectKey(board);
		if(board.getAttachList() != null) {
			board.getAttachList().forEach(attach->{
				attach.setBno(board.getBno());
				amapper.insert(attach);
			});
		}else {
			System.out.println("������ �����ϼ���.");
		}	
	}
	
	//�Խ��� ��ϸ���Ʈ ����� �� ����
	public ArrayList<BoardDTO> essay(Criteria cri) {
		return bmapper.essay(cri);
	}

	@Transactional
	//�Խ��� ��ϸ���Ʈ���� ������ Ŭ������ �� ������ ������ �������� ����� ���� ����
	public BoardDTO detail(BoardDTO board) {
		//board���̺� ��ȸ�� �Ӽ��� +1
		bmapper.cntupdate(board);
		return bmapper.detail(board);
	}
	
	//�Խ��� �ۼ��� ����� �� ����
	@Transactional
	public void modify(BoardDTO board) {
		bmapper.modify(board);
	}
	
	//�Խ��� �ۻ��� ����� �� ����
	public void remove(BoardDTO board) {
		bmapper.remove(board);
	}
	public void remove(int bno) {
		bmapper.remove(bno);
	}
	
	//�Ի��� ����¡�� ���� �����ͰǼ�
	public int getTotalCount(Criteria cri) {
		return bmapper.getTotalCount(cri);
	}
	
	//���Ͼ��ε�
	public ArrayList<AttachFileDTO> fileList(int bno){
		return amapper.fileList(bno);
	}
	
	public ArrayList<AttachFileDTO> fileListPost(int bno){
		return amapper.fileListPost(bno);
	}

	public void delete(AttachFileDTO aboard) {
		 amapper.delete(aboard);
	}

	public boolean fileDelete(AttachFileDTO attach) {
		return amapper.fileDelete(attach);
	}
	
	//����
	public ArrayList<AttachFileDTO> imgGet(AttachFileDTO attach) {
		 return amapper.imgGet(attach);
	}
	
	//��� ����
	public void replyPost(ReplyDTO rdto) {
		 bmapper.replyPost(rdto);
	}
	
	//��� Ȯ��
	public ArrayList<ReplyDTO> replyGet(ReplyDTO rdto) {
		 return bmapper.replyGet(rdto);
	}
	
	//��� ����
	public void modifyReply(ReplyDTO rdto) {
		bmapper.modifyReply(rdto);
	}
	
	//��� ����
	public void removeReply(ReplyDTO rdto) {
		bmapper.removeReply(rdto);
	}
}