package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="MEME")
public class Meme {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="memeSequence")
	@SequenceGenerator(allocationSize=1, name="memeSequence", sequenceName="SQ_MEME_PK")
	@Column(name="MEME_ID")
	private int memeId;
	@Column(name="MEME_NAME")
	private String memeName;
	@Column(name="MEME_IMG")
	private String memeImg;
	
	public Meme() {
		super();
	}

	public Meme(int memeId, String memeName, String memeImg) {
		super();
		this.memeId = memeId;
		this.memeName = memeName;
		this.memeImg = memeImg;
	}

	public int getMemeId() {
		return memeId;
	}

	public void setMemeId(int memeId) {
		this.memeId = memeId;
	}

	public String getMemeName() {
		return memeName;
	}

	public void setMemeName(String memeName) {
		this.memeName = memeName;
	}

	public String getMemeImg() {
		return memeImg;
	}

	public void setMemeImg(String memeImg) {
		this.memeImg = memeImg;
	}

	@Override
	public String toString() {
		return "Meme [memeId=" + memeId + ", memeName=" + memeName + ", memeImg=" + memeImg + "]";
	}
}
