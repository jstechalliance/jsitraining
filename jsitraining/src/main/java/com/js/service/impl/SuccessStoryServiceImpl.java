package com.js.service.impl;

import java.util.List;

import com.js.dao.SuccessStoryDAO;
import com.js.dto.SuccessStory;
import com.js.service.SuccessStoryService;

public class SuccessStoryServiceImpl implements SuccessStoryService{

	private SuccessStoryDAO successStoryDAO;
	
	public SuccessStoryDAO getSuccessStoryDAO() {
		return successStoryDAO;
	}

	public void setSuccessStoryDAO(SuccessStoryDAO successStoryDAO) {
		this.successStoryDAO = successStoryDAO;
	}

	
	public String addCandidateInSuccessStory(SuccessStory successStory)	throws Exception {
		return successStoryDAO.addCandidateInSuccessStory(successStory);
	}

	
	public String deleteCandidateFromSuccessStory(SuccessStory successStory) throws Exception {
		return successStoryDAO.deleteCandidateFromSuccessStory(successStory);
	}

	
	public List<SuccessStory> gettAllCandidateOfSuccessStory() throws Exception {
		return successStoryDAO.gettAllCandidateOfSuccessStory();
	}
	
	
	public SuccessStory getCandidateFromSuccessStoryById(long oid) throws Exception{
		return successStoryDAO.getCandidateFromSuccessStoryById(oid);
	}
}
