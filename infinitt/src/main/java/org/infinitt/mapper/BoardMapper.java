package org.infinitt.mapper;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.BoardDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.ReplyDTO;

public interface BoardMapper {
	
	//�Խ��� �۾���� ���õǾ��ִ� DB�۾��� ���� ����
	public void write(BoardDTO board);
	
	//�Խ��� ���Ͽ� ���õǾ��ִ� DB�۾��� ���� ����
	public void insertSelectKey(BoardDTO board);
	
	//�Խ��� ��ϸ���Ʈ�� ���õǾ��ִ� DB�۾��� ���� ����
	public ArrayList<BoardDTO> essay(Criteria cri);

	//�Խ��� ��ϸ���Ʈ���� ������ Ŭ������ �� ������ ������ ���������� ���õǾ��ִ� DB�۾��� ���� ����
	public BoardDTO detail(BoardDTO board);
	
	//�Խ��� ��ϸ���Ʈ���� ������ Ŭ������ �� ��ȸ�� +1 �� �� �� �ִ� DB�۾��� ���� ����
	public void cntupdate(BoardDTO board);
	
	//�Խ��� �ۼ����� ���õǾ��ִ� DB�۾��� ���� ����
	public void modify(BoardDTO board);
	
	//�Խ��� �ۻ����� ���õǾ��ִ� DB�۾��� ���� ����
	public void remove(BoardDTO board);
	public void remove(int bno);
	
	//�Խ��� ����¡�� ���� ��ü �Ǽ��� ���õǾ��ִ� DB�۾��� ���� ����
	public int getTotalCount(Criteria cri);
	
	//��� ����
	public void replyPost(ReplyDTO rdto);
	
	//��� Ȯ��
	public ArrayList<ReplyDTO> replyGet(ReplyDTO rdto);
	
	//��� ����
	public void modifyReply(ReplyDTO rdto);
	
	//��� ����
	public void removeReply(ReplyDTO rdto);
}
