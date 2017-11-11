package com.silview.silfitness.bmob.file;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

public class Movie extends BmobObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private BmobFile file;

	public Movie(){
		
	}
	
	public Movie(String name, BmobFile file){
		this.name =name;
		this.file = file;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BmobFile getFile() {
		return file;
	}

	public void setFile(BmobFile file) {
		this.file = file;
	}
	
	
	
}
