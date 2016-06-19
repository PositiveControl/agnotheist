package com.agnotheist.model.domain;

import java.io.Serializable;

public class Comment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2459344794600235478L;
	private User user;
	private Belief belief;
	private String userComment;
	
	public Comment() {
		super();
	}
	/**
	 * 
	 * @param user
	 * @param belief
	 * @param userComment
	 */
	public Comment(User user, Belief belief, String userComment) {
		this.user = user;
		this.belief = belief;
		this.userComment = userComment;
	}
	
	/**
	 * 
	 * @return the user
	 */
	public User getUser() { return user; }
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * 
	 * @return the belief
	 */
	public Belief getBelief() { return belief; }
	public void setBelief(Belief belief) {
		this.belief = belief;
	}
	
	/**
	 * 
	 * @return the userComment
	 */
	public String getUserComment() { return userComment; }
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean validate() {
		if (user == null) return false;
		if (belief == null) return false;
		if (userComment == null) return false;
		
		return true;
	}
	
	/**
	 * @return boolean if objects are equal
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null) return false;
		if (getClass() != object.getClass()) return false;
		
		Comment otherComment = (Comment) object;
		
		if (userComment == null && otherComment.userComment != null)
			return false;
		else if (!userComment.equals(otherComment.userComment))
			return false;
		if (belief == null && otherComment.belief != null)
			return false;
		else if (!belief.equals(otherComment.belief))
			return false;
		if (user == null && otherComment.user != null)
			return false;
		else if (!user.equals(otherComment.user))
			return false;
		
		return true;
	}
	
	/**
	 * @return hashCode
	 */
	@Override
	public int hashCode() {
		final int prime = 97;
		int result = 1;
		
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + 
				((belief == null) ? 0 : belief.hashCode());
		result = prime * result + 
				((userComment == null) ? 0 : userComment.hashCode());
		
		return result;
		
	}
	
	/**
	 * @return string of Comment object
	 */
	@Override
	public String toString() {
		return "Comment [belief=" + belief + ", " + "userComment=" 
				+ userComment + "user=" + user + "]";
	}
}
