/**
 * 
 */
package com.org.springModel;

import java.util.Date;

/**
 * @author chiyya
 *
 */
public class Todo {
	private int id;
	private String user;
	private String desc;
	private Date taegetDate;
	private boolean isDone;

	public Todo(int id, String user, String desc, Date taegetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.taegetDate = taegetDate;
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", desc=" + desc + ", taegetDate=" + taegetDate + ", isDone="
				+ isDone + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the taegetDate
	 */
	public Date getTaegetDate() {
		return taegetDate;
	}

	/**
	 * @param taegetDate the taegetDate to set
	 */
	public void setTaegetDate(Date taegetDate) {
		this.taegetDate = taegetDate;
	}

	/**
	 * @return the isDone
	 */
	public boolean isDone() {
		return isDone;
	}

	/**
	 * @param isDone the isDone to set
	 */
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

}
