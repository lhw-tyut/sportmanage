package com.sport.core.dao;

import java.util.List;
import com.sport.core.po.Sporter;

public interface SporterDao {

	    //普通查询   通过运动类型和性别   主要用于生成参赛人员表    按成绩降序
	    public List<Sporter> selectSporterList(Sporter sporter);
	    public List<Sporter> selectSporterListF(Sporter sporter);
	    public List<Sporter> selectSporterListG(Sporter sporter);
	    public List<Sporter> selectSporterListH(Sporter sporter);
	    public Integer selectSporterListCount(Sporter sporter);
	    //条件查询        进入半决赛人员      通过比较预赛成绩生成
	    public List<Sporter> selectSporterList1(Sporter sporter);
	    //条件查询 进入决赛人员       通过比较半决赛成绩生成
	    public List<Sporter> selectSporterList2(Sporter sporter);
	    //条件查询  决赛人员成绩表    按决赛成绩升序
	    public List<Sporter> selectSporterList3(Sporter sporter);
	    //条件查询  查询进入百米决赛的运动员的成绩（用于设置百米运动员的积分）
	    public List<Sporter> selectSporterList4(Sporter sporter);
	    //根据运动类型查询预赛成绩，并按成绩降序（用于设置跳远运动员的积分）
	    public List<Sporter> selectSporterList5(Sporter sporter);
	    //按班级查询积分（View6）
	    public List<Sporter> selectSporterCredit(Sporter sporter);
	    //查询纪录表
	    public List<Sporter> selectSporterNewsreel(Sporter sporter);
		// 创建运动员
		public int createSporter(Sporter sporter);

		public int createSporterNewsreel(Sporter sporter);
		// 通过id查询客户
		public Sporter getSporterById(Integer id);
		// 	输入预赛成绩
		public  int updateSporter(Sporter sporter);
		//输入半决赛成绩
		public  int updateSporter1(Sporter sporter);
		//输入决赛成绩
		public  int updateSporter2(Sporter sporter);
		//通过决赛成绩给运动员相应的积分
		public  int updateSporterCredit(Sporter sporter);
		//更新纪录表
		public  int updateNewsreel(Sporter sporter);
		//条件查询  根据编号、班级、学号
		public List<Sporter> getSporter(Sporter sporter);
		 public Integer getSporterCount(Sporter sporter);
	}


