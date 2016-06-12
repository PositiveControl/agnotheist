package com.agnotheist.model.domain;

import java.io.Serializable;

public class Belief implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7506977233948036010L;
	private String religion;
	private String beliefStatement;
	private User user;
	
	/**
	 * 
	 * @param religion
	 * @param beliefStatement
	 * @param user
	 */
	
	public Belief() {
		super();
	}
	
	public Belief(String religion, String beliefStatement, 
			User user) {
		super();
		this.religion = religion;
		this.beliefStatement = beliefStatement;
		this.user = user;
	}
	
	/**
	 * 
	 * @return the religion
	 */
	public String getReligion() { return religion; }
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	/**
	 * 
	 * @return the beliefStatement
	 */
	public String getBeliefStatement() { return beliefStatement; }
	public void setBeliefStatement(String beliefStatement) {
		this.beliefStatement = beliefStatement;
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
	 * @return boolean
	 */
	public boolean validate() {
		if (religion == null) return false;
		if (beliefStatement == null) return false;
		if (user == null) return false;
		
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
		
		Belief otherBelief = (Belief) object;
		
		if (religion == null && otherBelief.religion != null)
			return false;
		else if (!religion.equals(otherBelief.religion))
			return false;
		if (beliefStatement == null && otherBelief.beliefStatement != null)
			return false;
		else if (!beliefStatement.equals(otherBelief.beliefStatement))
			return false;
		if (user == null && otherBelief.user != null)
			return false;
		else if (!user.equals(otherBelief.user))
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
		
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + 
				((beliefStatement == null) ? 0 : beliefStatement.hashCode());
		
		return result;
		
	}
	
	/**
	 * @return string of Belief object
	 */
	@Override
	public String toString() {
		return "Belief [religion=" + religion + ", " + "beliefStatement=" 
				+ beliefStatement + "user=" + user + "]";
	}	
}
