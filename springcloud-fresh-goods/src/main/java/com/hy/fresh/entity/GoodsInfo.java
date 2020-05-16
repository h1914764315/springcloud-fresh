package com.hy.fresh.entity;

import java.io.Serializable;

public class GoodsInfo implements Serializable{
	private static final long serialVersionUID = 7880887687747791921L;
	
	private int gno;
	private String gname;
	private int tno;
	private String price;
	private String intro; //简介
	private int balance; //库存量
	private String pics; 
	private String unit;//单位
	private String qperied;//保质期
	private String weight;//净重
	private String descr;//描述
	private int cno; 
	private int num;//总量
	
	@Override
	public String toString() {
		return "GoodsInfo [gno=" + gno + ", gname=" + gname + ", tno=" + tno + ", price=" + price + ", intro=" + intro
				+ ", balance=" + balance + ", pics=" + pics + ", unit=" + unit + ", qperied=" + qperied + ", weight="
				+ weight + ", descr=" + descr + ", cno=" + cno + ", num=" + num + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + cno;
		result = prime * result + ((descr == null) ? 0 : descr.hashCode());
		result = prime * result + ((gname == null) ? 0 : gname.hashCode());
		result = prime * result + gno;
		result = prime * result + ((intro == null) ? 0 : intro.hashCode());
		result = prime * result + num;
		result = prime * result + ((pics == null) ? 0 : pics.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((qperied == null) ? 0 : qperied.hashCode());
		result = prime * result + tno;
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		GoodsInfo other = (GoodsInfo) obj;
		if (balance != other.balance)
			return false;
		if (cno != other.cno)
			return false;
		if (descr == null) {
			if (other.descr != null)
				return false;
		} else if (!descr.equals(other.descr))
			return false;
		if (gname == null) {
			if (other.gname != null)
				return false;
		} else if (!gname.equals(other.gname))
			return false;
		if (gno != other.gno)
			return false;
		if (intro == null) {
			if (other.intro != null)
				return false;
		} else if (!intro.equals(other.intro))
			return false;
		if (num != other.num)
			return false;
		if (pics == null) {
			if (other.pics != null)
				return false;
		} else if (!pics.equals(other.pics))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (qperied == null) {
			if (other.qperied != null)
				return false;
		} else if (!qperied.equals(other.qperied))
			return false;
		if (tno != other.tno)
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getQperied() {
		return qperied;
	}

	public void setQperied(String qperied) {
		this.qperied = qperied;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
}
