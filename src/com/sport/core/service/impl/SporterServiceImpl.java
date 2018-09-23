package com.sport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sport.common.utils.Page;
import com.sport.core.dao.SporterDao;
import com.sport.core.po.Sporter;
import com.sport.core.service.SporterService;
@Service("SporterService")
public class SporterServiceImpl implements SporterService{
	// 注入SporterDao
		@Autowired
	private SporterDao sporterDao;
	/**
	 * 通过id查询客户
	 */
	@Override
	public Sporter getSporterById(Integer id) {	
		Sporter sporter = this.sporterDao.getSporterById(id);
	    return sporter;		
	}
	@Override
	public Page<Sporter> selectSporterList(Integer page,Integer rows,Sporter sporter) {
		
		sporter.setStart((page-1) * rows) ;
		// 每页数
		sporter.setRows(rows);
		List<Sporter> sporters = this.sporterDao.selectSporterList(sporter);
		Integer count = sporterDao.selectSporterListCount(sporter);
		Page<Sporter> result=new Page<>();
		result.setPage(page);
		result.setRows(sporters);
        result.setSize(rows);	
        result.setTotal(count);
	    return result;	
	}
	@Override
	public Page<Sporter> selectSporterList1(Integer page,Integer rows,Sporter sporter) {
		
		sporter.setStart((page-1) * rows) ;
		// 每页数
		sporter.setRows(rows);
		List<Sporter> sporters = this.sporterDao.selectSporterList1(sporter);
		Integer count = 16;
		Page<Sporter> result=new Page<>();
		result.setPage(page);
		result.setRows(sporters);
        result.setSize(rows);	
        result.setTotal(count);
	    return result;	
	}

	@Override
	public Page<Sporter> selectSporterList2(Integer page,Integer rows,Sporter sporter) {
		
		sporter.setStart((page-1) * rows) ;
		// 每页数
		sporter.setRows(rows);
		List<Sporter> sporters = this.sporterDao.selectSporterList2(sporter);
		Integer count = 8;
		Page<Sporter> result=new Page<>();
		result.setPage(page);
		result.setRows(sporters);
        result.setSize(rows);	
        result.setTotal(count);
	    return result;	
	}
	@Override
	public Page<Sporter> selectSporterList3(Integer page,Integer rows,Sporter sporter) {
		sporter.setStart((page-1) * rows) ;
		// 每页数
		sporter.setRows(rows);
		List<Sporter> sporters = this.sporterDao.selectSporterList2(sporter);
		Integer count = 8;
		Page<Sporter> result=new Page<>();
		result.setPage(page);
		result.setRows(sporters);
        result.setSize(rows);	
        result.setTotal(count);
	    return result;	
	}
	@Override
	public List<Sporter> selectSporterList4(Sporter sporter) {
		List<Sporter> sporters = this.sporterDao.selectSporterList4(sporter);
	    return sporters;	
	}
	@Override
	public List<Sporter> selectSporterList5(Sporter sporter) {
		List<Sporter> sporters = this.sporterDao.selectSporterList5(sporter);
	    return sporters;	
	}
	@Override
	public List<Sporter> selectSporterCredit(Sporter sporter) {
		List<Sporter> sporters = this.sporterDao.selectSporterCredit(sporter);
	    return sporters;	
	}
	@Override
	public List<Sporter> selectSporterNewsreel(Sporter sporter) {
		List<Sporter> sporters = this.sporterDao.selectSporterNewsreel(sporter);
	    return sporters;	
	}
	@Override
	public int createSporter(Sporter sporter) {
		 return sporterDao.createSporter(sporter);
	}

	@Override
	public int createSporterNewsreel(Sporter sporter) {
		 return sporterDao.createSporterNewsreel(sporter);
	}
	@Override
	public Page<Sporter> getSporter(Integer page,Integer rows,Sporter sporter) {
		
		sporter.setStart((page-1) * rows) ;
		// 每页数
		sporter.setRows(rows);
		List<Sporter> sporters = this.sporterDao.getSporter(sporter);
		Integer count = sporterDao.getSporterCount(sporter);
		Page<Sporter> result=new Page<>();
		result.setPage(page);
		result.setRows(sporters);
        result.setSize(rows);	
        result.setTotal(count);
	    return result;
	}
	@Override
	public int updateSporter(Sporter sporter) {
		return sporterDao.updateSporter(sporter);
	}
	@Override
	public int updateSporter1(Sporter sporter) {
		return sporterDao.updateSporter1(sporter);
	}
	@Override
	public int updateSporter2(Sporter sporter) {
		return sporterDao.updateSporter2(sporter);
	}

	@Override
	public int updateSporterCredit(Sporter sporter) {
		return sporterDao.updateSporterCredit(sporter);
	}
	@Override
	public int updateNewsreel(Sporter sporter) {
		return sporterDao.updateNewsreel(sporter);
	}

}
