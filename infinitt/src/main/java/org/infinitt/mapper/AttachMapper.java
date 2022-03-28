package org.infinitt.mapper;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;

public interface AttachMapper {
	//	Essay
	public void insert(AttachFileDTO board);
	public ArrayList<AttachFileDTO> fileList(int bno);
	public void modify(AttachFileDTO board);
	public ArrayList<AttachFileDTO> fileListPost(int bno);
	public ArrayList<AttachFileDTO> imgGet(AttachFileDTO attach);
	
	//	News
	public void ninsert(AttachFileDTO news);
	public ArrayList<AttachFileDTO> nfileList(int nbno);
	public void newsmodify(AttachFileDTO news);
	public ArrayList<AttachFileDTO> nfileListPost(int nbno);
	
	// Resume
	public void rinsert(AttachFileDTO resume);
	public ArrayList<AttachFileDTO> rfileList(int rbno);
	public ArrayList<AttachFileDTO> rfileListPost(int rbno);
	
	
	public boolean fileDelete(AttachFileDTO attach);
	
	public void delete(AttachFileDTO aboard);
}
