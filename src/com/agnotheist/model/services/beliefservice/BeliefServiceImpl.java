package com.agnotheist.model.services.beliefservice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.exception.CreateBeliefException;

public class BeliefServiceImpl implements IBeliefService {
	
	/**
	 * creates Belief
	 */
	public boolean createBelief(String belief, String beliefStatement, User user) 
		throws CreateBeliefException {
			boolean isValid = false;
			ObjectInputStream input = null;
			
			
			try {
				ObjectOutputStream output = new ObjectOutputStream(
						new FileOutputStream("CreatedBelief.out")
						);
				output.writeObject(user);
				output.flush();
				output.close();
				
				input = new ObjectInputStream(new FileInputStream("CreatedBelief.out"));
				User savedUser = (User) input.readObject();
				input.close();
				User inUser = user;
				
				if (user != null && savedUser.equals(inUser)) {
					System.out.println(belief);
					if (belief != null) {
						if (beliefStatement != null) {
							System.out.println("Entering method BeliefServiceImpl::createBelief");
							isValid = true; 
						} else {
							isValid = false;
							throw new CreateBeliefException("Null beliefStatement passed to BeliefServiceImpl::createBelief");
						}
					} else {
						isValid = false;
						throw new CreateBeliefException("Null belief passed to BeliefServiceImpl::createBelief");
					}
				} else {
					isValid = false;
					throw new CreateBeliefException("Null or invalid user passed to BeliefServiceImpl::createBelief");
				}
			} catch(CreateBeliefException cbe) {
				isValid = false;
				throw new CreateBeliefException("Beleif could not be created", cbe);
			} catch(IOException ioe) {
				isValid = false;
				throw new CreateBeliefException("IOException while accessing file containing user", ioe);
			} catch(ClassNotFoundException cnfe) {
				isValid = false;
				throw new CreateBeliefException("ClassNotFoundException while reading file containing user", cnfe);
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return isValid;
				}
			}
			return isValid;
	};
}
