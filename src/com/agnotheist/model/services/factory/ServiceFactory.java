package com.agnotheist.model.services.factory;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.services.IService;

public class ServiceFactory {
	/**
	 * 
	 */
	private ServiceFactory() {
	}

	private static ServiceFactory serviceFactory = new ServiceFactory();
	
	/**
	 * 
	 * @return serviceFactory
	 */
	public static ServiceFactory getInstance() {
		return serviceFactory;
	}
	
	/**
	 * 
	 * @param serviceName
	 * @return instance of service
	 * @throws ServiceLoadException
	 */
	public IService getService(String serviceName) throws ServiceLoadException {
		try {
			Class<?> c = Class.forName(getImplName(serviceName));
			return (IService) c.newInstance();
		} catch (Exception e) {
			serviceName = serviceName + " not loaded";
			throw new ServiceLoadException(serviceName, e);
		}
	}
	
	/**
	 * 
	 * @param serviceName
	 * @return serviceName
	 * @throws Exception
	 */
	private String getImplName(String serviceName) throws Exception {
		java.util.Properties props = new java.util.Properties();
		
		String propertyFileLocation = "config/application.properties";
		
		System.out.println(propertyFileLocation);
		
		System.out.println("Property File Location passed : " + propertyFileLocation);
		
		java.io.FileInputStream fis = new java.io.FileInputStream(propertyFileLocation);
		props.load(fis);
		fis.close();
		return props.getProperty(serviceName);
	}
	
	
}

