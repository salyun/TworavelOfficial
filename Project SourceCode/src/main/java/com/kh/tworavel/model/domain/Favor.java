package com.kh.tworavel.model.domain;

import org.springframework.stereotype.Component;

@Component
public class Favor {
	private String m_id;
	private int c_lid;
	private int c_sid;
	
	public Favor() {}
	
	public Favor(String m_id, int c_lid, int c_sid) {
		super();
		this.m_id = m_id;
		this.c_lid = c_lid;
		this.c_sid = c_sid;
	}

	@Override
	public String toString() {
		return "Favor [m_id=" + m_id + ", c_lid=" + c_lid + ", c_sid=" + c_sid + "]";
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public int getC_lid() {
		return c_lid;
	}

	public void setC_lid(int c_lid) {
		this.c_lid = c_lid;
	}

	public int getC_sid() {
		return c_sid;
	}

	public void setC_sid(int c_sid) {
		this.c_sid = c_sid;
	}
	
	
	
}
