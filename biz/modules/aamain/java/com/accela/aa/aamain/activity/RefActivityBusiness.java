package com.accela.aa.aamain.activity;

import java.util.Collection;

import com.accela.aa.exception.AAException;
import com.accela.util.AVLogger;
import com.accela.aa.util.ObjectFactory;

/**
 * <pre>
 * 
 *  
 *   
 *    Accela Automation
 *   
 *    Accela, Inc.
 *    Copyright (C): 2001
 *   
 *    Description:
 *   
 *    Notes:
 *   
 *    Revision History:
 *    &lt;Date&gt;           &lt;Who&gt;           &lt;What&gt;
 *    04/16/2004       Kyle Zhu        Create it.
 *   
 *    
 *   
 *  
 * </pre>
 */


public class RefActivityBusiness implements RefActivityService
{
	private RefActivityDAO refActivityDao;

	private AVLogger logger;

	public RefActivityBusiness() throws AAException
	{
		refActivityDao = (RefActivityDAO) ObjectFactory.getDAOObject(RefActivityDAO.class);
		logger = AVLogger.getLogger(this.getClass());
	}

	/**
	 * Create an Reference Activity record method createRefActivity
	 * 
	 * @param refActivityModel the reference activity model.
	 * @throws AAException PK duplicated or DB error.
	 */
	public void createRefActivity(RefActivityModel refActivityModel) throws AAException
	{
		refActivityDao.createRefActivity(refActivityModel);
	}

	/**
	 * Edit an Reference Activity record method editRefActivity
	 * 
	 * @param refActivityModel the reference activity model.
	 * @throws AAException
	 */
	public void editRefActivity(RefActivityModel refActivityModel) throws AAException
	{
		refActivityDao.editRefActivity(refActivityModel);
	}

	/**
	 * Gets all the reference activity models which belong the same type of 
	 * the specified activity. 
	 * 
	 * @param refActivity the reference activity model.
	 * @return Collection all the reference activities or an empty collection if there is no such type activity.
	 * @throws AAException
	 */
	public Collection getRefActivityList(RefActivityModel refActivityModel) throws AAException
	{
		return refActivityDao.getRefActivityList(refActivityModel);
	}

	/**
	 * Remove an Reference Activity record method removeRefActivity
	 * 
	 * @param refActivityPK the primary key of the reference activity model.
	 * @param auditID the audit ID.
	 * @throws AAException
	 */
	public void removeRefActivity(RefActivityPK refActivityPK, String auditID) throws AAException
	{
		refActivityDao.removeRefActivity(refActivityPK, auditID);
	}


}