package com.revature.beans;

public class Meme {
	
	private int memeId;
	private String memeName;
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
