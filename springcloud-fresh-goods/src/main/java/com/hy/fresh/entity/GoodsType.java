package com.hy.fresh.entity;

import java.io.Serializable;

public class GoodsType implements Serializable{
	private static final long serialVersionUID = -4406094469657074135L;
	
	private int tno;
	private String tname;
	private String pic;
	private int status;
	
	@Override
	public String toString() {
		return "goodsType [tno=" + tno + ", tname=" + tname + ", pic=" + pic + ", status=" + status + "]";
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + status;
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
		result = prime * result + tno;
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
		GoodsType other = (GoodsType) obj;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (status != other.status)
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		if (tno != other.tno)
			return false;
		return true;
	}
	
	
}
