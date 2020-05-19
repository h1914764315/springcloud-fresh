package com.hy.fresh.entity;

public class CartInfo {
	private int cno;
	private int mno;
	private int gno;
	private int num;
	
	@Override
	public String toString() {
		return "CartInfo [cno=" + cno + ", mno=" + mno + ", gno=" + gno + ", num=" + num + "]";
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cno;
		result = prime * result + gno;
		result = prime * result + mno;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartInfo other = (CartInfo) obj;
		if (cno != other.cno)
			return false;
		if (gno != other.gno)
			return false;
		if (mno != other.mno)
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	
}
