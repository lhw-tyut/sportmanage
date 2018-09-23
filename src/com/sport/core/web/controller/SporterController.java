package com.sport.core.web.controller;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sport.common.utils.Page;
import com.sport.core.po.Sporter;
import com.sport.core.po.User;
import com.sport.core.service.SporterService;
/**
 * 用户控制器类
 */
@Controller
public class SporterController {
	// 依赖注入
		@Autowired
		private SporterService sporterService;
		
		@RequestMapping(value = "/chaxun.action")
		//@ResponseBody
		public String chaxun(Integer id,Model model,HttpSession session) {
			 Sporter sporter = sporterService.getSporterById(1);
			model.addAttribute("msg", sporter);	
			model.addAttribute("msg1", "男子百米参赛人员");	
			return "view";
		}
		@RequestMapping(value = "/chaxun1.action")
		//@ResponseBody
		public String chaxun1(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			 Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米参赛人员");	
			model.addAttribute("msg2", "chaxun1.action");
			return "view";
		}

		@RequestMapping(value = "/chaxun2.action")
		//@ResponseBody
		public String chaxun2(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			 Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米参赛人员");	
			model.addAttribute("msg2", "chaxun2.action");	
			return "view";
		}

		@RequestMapping(value = "/chaxun3.action")
		//@ResponseBody
		public String chaxun3(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子跳远参赛人员");	
			model.addAttribute("msg2", "chaxun3.action");
			return "view";
		}

		@RequestMapping(value = "/chaxun4.action")
		//@ResponseBody
		public String chaxun4(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子跳远参赛人员");	
			model.addAttribute("msg2", "chaxun4.action");
			return "view";
		}		

		@RequestMapping(value = "/chaxun5.action")
		//@ResponseBody
		public String chaxun5(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米预赛人员");	
			model.addAttribute("msg2", "chaxun5.action");
			return "view1";
		}

		@RequestMapping(value = "/chaxun6.action")
		//@ResponseBody
		public String chaxun6(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米预赛人员");	
			model.addAttribute("msg2", "chaxun6.action");
			return "view1";
		}

		@RequestMapping(value = "/chaxun7.action")
		//@ResponseBody
		public String chaxun7(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList1(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米半决赛人员");	
			model.addAttribute("msg2", "chaxun7.action");
			return "view1";
		}

		@RequestMapping(value = "/chaxun8.action")
		//@ResponseBody
		public String chaxun8(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList1(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米半决赛人员");	
			model.addAttribute("msg2", "chaxun8.action");
			return "view1";
		}
		
		@RequestMapping(value = "/chaxun9.action")
		//@ResponseBody
		public String chaxun9(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米决赛人员");	
			model.addAttribute("msg2", "chaxun9.action");
			return "view1";
		}

		@RequestMapping(value = "/chaxun10.action")
		//@ResponseBody
		public String chaxun10(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米决赛人员");	
			model.addAttribute("msg2", "chaxun10.action");
			return "view1";
		}
		
		@RequestMapping(value = "/chaxun11.action")
		//@ResponseBody
		public String chaxun11(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米决赛成绩");	
			model.addAttribute("msg2", "chaxun11.action");
			return "view3";
		}
		@RequestMapping(value = "/chaxun12.action")
		//@ResponseBody
		public String chaxun12(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米决赛成绩");	
			model.addAttribute("msg2", "chaxun12.action");
			return "view3";
		}
		@RequestMapping(value = "/chaxun13.action")
		public String chaxun13(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("男");
			
			 Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子跳远决赛成绩");	
			model.addAttribute("msg2", "chaxun13.action");
			return "view2";
		}
		@RequestMapping(value = "/chaxun14.action")
		public String chaxun14(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("女");
			
			 Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子跳远决赛成绩");	
			model.addAttribute("msg2", "chaxun14.action");
			return "view2";
		}
		
		@RequestMapping(value = "/preupdate1.action")
		public String preupdate1(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			 Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米预赛成绩录入");
			model.addAttribute("msg2", "update1.action");
			model.addAttribute("msg3", "preupdate1.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update1.action")
		public String update1(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score(s);
				 int row=sporterService.updateSporter(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		@RequestMapping(value = "/preupdate2.action")
		public String preupdate2(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米预赛成绩录入");
			model.addAttribute("msg2", "update2.action");
			model.addAttribute("msg3", "preupdate2.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update2.action")
		public String update2(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			
			 Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score(s);
				 int row=sporterService.updateSporter(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				 if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		@RequestMapping(value = "/preupdate3.action")
		public String preupdate3(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子跳远成绩录入");
			model.addAttribute("msg2", "update3.action");
			model.addAttribute("msg3", "preupdate3.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update3.action")
		public String update3(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("男");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			System.out.println(j);
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score(s);
				 int row=sporterService.updateSporter(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				 if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		@RequestMapping(value = "/preupdate4.action")
		public String preupdate4(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子跳远成绩录入");
			model.addAttribute("msg2", "update4.action");
			model.addAttribute("msg3", "preupdate4.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update4.action")
		public String update4(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跳远");
			sporter1.setS_sex("女");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			
			Page<Sporter> sporters = sporterService.selectSporterList(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score(s);
				 int row=sporterService.updateSporter(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				 if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		@RequestMapping(value = "/preupdate5.action")
		public String preupdate5(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList1(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米半决赛成绩录入");
			model.addAttribute("msg2", "update5.action");
			model.addAttribute("msg3", "preupdate5.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update5.action")
		public String update5(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			
			 Page<Sporter> sporters = sporterService.selectSporterList1(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score1(s);
				 int row=sporterService.updateSporter1(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				 if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		@RequestMapping(value = "/preupdate6.action")
		public String preupdate6(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList1(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米半决赛成绩录入");
			model.addAttribute("msg2", "update6.action");
			model.addAttribute("msg3", "preupdate6.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update6.action")
		public String update6(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			
			 Page<Sporter> sporters = sporterService.selectSporterList1(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score1(s);
				 int row=sporterService.updateSporter1(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				 if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		@RequestMapping(value = "/preupdate7.action")
		public String preupdate7(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			
			Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "男子百米决赛成绩录入");
			model.addAttribute("msg2", "update7.action");
			model.addAttribute("msg3", "preupdate7.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update7.action")
		public String update7(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("男");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			
			 Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score2(s);
				 int row=sporterService.updateSporter2(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				 if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		@RequestMapping(value = "/preupdate8.action")
		public String preupdate8(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			
			Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "女子百米决赛成绩录入");
			model.addAttribute("msg2", "update8.action");
			model.addAttribute("msg3", "preupdate8.action");
			return "submitscore1";
		}
		//成绩输入
		@RequestMapping(value = "/update8.action")
		public String update8(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows,Model model,HttpSession session, HttpServletRequest request) {
			int rows1=0;
			int sporter_count=0;
			int sporter_count1=20;
			Sporter sporter1=new Sporter();
			sporter1.setS_type("跑步");
			sporter1.setS_sex("女");
			Integer j=Integer.valueOf(request.getParameter("sum"));
			
			 Page<Sporter> sporters = sporterService.selectSporterList2(page,rows,sporter1);
			 for(Sporter sporter2:sporters.getRows()) {
				 String a=String.valueOf(sporter_count);
				 String b=String.valueOf(sporter_count1);
					Double s=Double.valueOf(request.getParameter(a));
					Integer i=Integer.valueOf(request.getParameter(b));
				 Sporter sporter3=new Sporter();
				 sporter3.setS_id(i);
				 sporter3.setS_score2(s);
				 int row=sporterService.updateSporter2(sporter3);
				 rows1+=row;
				 sporter_count++;
				 sporter_count1++;
				 if(sporter_count>(j-1)) {
					 break;
				 }
			 }
			 if(rows1>0) {
				 return "success";
			 }
			 else {return "unsuccess";}

		}
		
		@RequestMapping(value = "/insert.action")
		public String insert(String type,Model model,HttpSession session, String s_class, String s_name, String s_sex, String s_sno, String s_type) {
			Sporter sporter=new Sporter();
			sporter.setS_id(null);
			sporter.setS_name(s_name);
			sporter.setS_class(s_class);
			sporter.setS_sex(s_sex);
			sporter.setS_sno(s_sno);
			sporter.setS_type(s_type);
			sporter.setS_zu(null);
			sporter.setS_score(0);
			
			 int rows = sporterService.createSporter(sporter);
			    if(rows > 0){
			        return "OK";
			    }else{
			        return "FAIL";
			    }
			}

	
		@RequestMapping(value = "/search.action")
		//@ResponseBody
		public String search(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows,Sporter sporter,Model model,HttpSession session) {
			
			
			Page<Sporter> sporters = sporterService.getSporter(page,rows,sporter);
			model.addAttribute("page", sporters);	
			model.addAttribute("msg1", "查询结果");	
			model.addAttribute("msg2", "search.action");
			return "view7";
		}

		@RequestMapping("/update.action")
		public String sporterUpdate(Sporter sporter,String phase){
			phase =phase; 	
			//String phase="百米半决赛";
			//System.out.println(phase);
			//System.out.println(s_score);
			if(phase.equals("百米预赛") || phase.equals("跳远")) {

				  int rows = sporterService.updateSporter(sporter);
				    if(rows > 0){
				        return "success";
				    }else{
				        return "unsuccess";
				    }
			}
			else if(phase.equals("百米半决赛")) {
				 sporter.setS_score1(sporter.getS_score());
				  int rows = sporterService.updateSporter1(sporter);
				    if(rows > 0){
				        return "success";
				    }else{
				        return "unsuccess";
				    }
			}
			else if(phase.equals("百米决赛")) {
				 sporter.setS_score2(sporter.getS_score());
				  int rows = sporterService.updateSporter2(sporter);
				    if(rows > 0){
				        return "success";
				        
				    }else{
				        return "unsuccess";
				    }
			}
			else { return "unsuccess";}
		}
		
	      @RequestMapping(value = "/updateCredit.action")
	      public String updateCredit(Sporter sporter, Model model,HttpSession session) {
	    	  int rows=0;
	    	  int a=0;
	    	  int b=0;
	    	  int c=0;
	    	  int d=0;
	    	  Sporter s=new Sporter();
	    	  s.setS_type("跳远");
	    	  List<Sporter> sporters = sporterService.selectSporterList4(sporter);
	    	  List<Sporter> sporter1s = sporterService.selectSporterList5(s);
	    	  for(Sporter sporter1:sporters) {
	    		  Sporter sporter2=new Sporter();
	    		  sporter2.setS_id(sporter1.getS_id());
	    		  if(sporter1.getS_sex().equals("男")) {
	    			 
	    			  if(a==0) {
	    				  sporter2.setS_credit(3);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }else if(a==1) {
	    				  sporter2.setS_credit(2);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }else if(a==2) {
	    				  sporter2.setS_credit(1);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }else  {
	    				  sporter2.setS_credit(0);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }
	    			  a++;
	    		  }  
	    		  if(sporter1.getS_sex().equals("女")) {
	    			  if(b==0) {
	    				  sporter2.setS_credit(3);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }else if(b==1) {
	    				  sporter2.setS_credit(2);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }else if(b==2) {
	    				  sporter2.setS_credit(1);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }else  {
	    				  sporter2.setS_credit(0);
	    				  int row=sporterService.updateSporterCredit(sporter2);
	    				  rows+=row;
	    			  }
	    			  b++;
	    		  } 
	    	  }
	    	  for(Sporter sporter3:sporter1s) {
	    		  Sporter sporter4=new Sporter();
	    		  sporter4.setS_id(sporter3.getS_id());
	    		  if(sporter3.getS_sex().equals("男")) {
	    			 
	    			  if(c==0) {
	    				  sporter4.setS_credit(3);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }else if(c==1) {
	    				  sporter4.setS_credit(2);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }else if(c==2) {
	    				  sporter4.setS_credit(1);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }else  {
	    				  sporter4.setS_credit(0);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }
	    			  c++;
	    		  }  
	    		  if(sporter3.getS_sex().equals("女")) {
	    			  if(d==0) {
	    				  sporter4.setS_credit(3);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }else if(d==1) {
	    				  sporter4.setS_credit(2);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }else if(d==2) {
	    				  sporter4.setS_credit(1);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }else  {
	    				  sporter4.setS_credit(0);
	    				  int row=sporterService.updateSporterCredit(sporter4);
	    				  rows+=row;
	    			  }
	    			 d++;
	    		  } 
	    	  }
           List<Sporter> sporter2s=sporterService.selectSporterCredit(sporter);
			model.addAttribute("msg", sporter2s);	
			model.addAttribute("msg1", "班级排名表");	
			return "view5";
	  }

	      @RequestMapping(value = "/updateNewsreel.action")
	      public String updateNewsreel(Sporter sporter, Model model,HttpSession session) {
	    	  int rows=0;
	    	  Sporter s=new Sporter();
	    	  s.setS_type("跳远");
	    	  List<Sporter> sporters = sporterService.selectSporterList4(sporter);
	    	  List<Sporter> sporter1s = sporterService.selectSporterList5(s);
	    	  List<Sporter> sporter2s = sporterService.selectSporterNewsreel(sporter);
	    	  for(Sporter sporter1:sporters) {

	    		  if(sporter1.getS_sex().equals("男")) {
	    			 for(Sporter sporter5:sporter2s) {
	    				 if(sporter5.getS_sex().equals("男")&&sporter5.getS_type().equals("跑步")) {
	    					 if(sporter1.getS_score2()<sporter5.getS_score())
	    					 {
	    						 Sporter sporter8=new Sporter();
	    						 sporter8.setS_id(sporter5.getS_id());
	    						 sporter8.setS_score(sporter1.getS_score2());
	    						 sporter8.setS_name(sporter1.getS_name());
	    						 sporter8.setS_sno(sporter1.getS_sno());
	    						 sporter8.setS_class(sporter1.getS_class());
	    						 //sporter8.setS_sex(sporter1.getS_sex());
	    						 //sporter8.setS_type(sporter1.getS_type());
	    						 int row=sporterService.updateNewsreel(sporter8);
	    						 //int row=sporterService.createSporterNewsreel(sporter8);
	    					 }	    				 }
	    			 }
	    			  
	    		  }  
	    		  if(sporter1.getS_sex().equals("女")) {
	    			  for(Sporter sporter5:sporter2s) {
		    				 if(sporter5.getS_sex().equals("女")&&sporter5.getS_type().equals("跑步")) {
		    					 if(sporter1.getS_score2()<sporter5.getS_score())
		    					 {
		    						 Sporter sporter8=new Sporter();
		    						 sporter8.setS_id(sporter5.getS_id());
		    						 sporter8.setS_score(sporter1.getS_score2());
		    						 sporter8.setS_name(sporter1.getS_name());
		    						 sporter8.setS_sno(sporter1.getS_sno());
		    						 sporter8.setS_class(sporter1.getS_class());
		    						// sporter8.setS_sex(sporter1.getS_sex());
		    						// sporter8.setS_type(sporter1.getS_type());
		    						 int row=sporterService.updateNewsreel(sporter8);
		    						 //int row=sporterService.createSporterNewsreel(sporter8);
		    					 }	    				 }
		    			 }
		    			  
	    		  } 
	    	  }
	    	  for(Sporter sporter3:sporter1s) {
	    		  if(sporter3.getS_sex().equals("男")) {
		    			 for(Sporter sporter5:sporter2s) {
		    				 if(sporter5.getS_sex().equals("男")&&sporter5.getS_type().equals("跳远")) {
		    					 if(sporter3.getS_score()>sporter5.getS_score())
		    					 {
		    						 Sporter sporter8=new Sporter();
		    						 sporter8.setS_id(sporter5.getS_id());
		    						 sporter8.setS_score(sporter3.getS_score());
		    						 sporter8.setS_name(sporter3.getS_name());
		    						 sporter8.setS_sno(sporter3.getS_sno());
		    						 sporter8.setS_class(sporter3.getS_class());
		    						 //sporter8.setS_sex(sporter3.getS_sex());
		    						 //sporter8.setS_type(sporter3.getS_type());
		    						 int row=sporterService.updateNewsreel(sporter8);
		    						 //int row=sporterService.createSporterNewsreel(sporter8);
		    					 }	    				 }
		    			 }
	    		  }
		    			 if(sporter3.getS_sex().equals("女")) {
			    			 for(Sporter sporter5:sporter2s) {
			    				 if(sporter5.getS_sex().equals("女")&&sporter5.getS_type().equals("跳远")) {
			    					 if(sporter3.getS_score()>sporter5.getS_score())
			    					 {
			    						 Sporter sporter8=new Sporter();
			    						 sporter8.setS_id(sporter5.getS_id());
			    						 sporter8.setS_score(sporter3.getS_score());
			    						 sporter8.setS_name(sporter3.getS_name());
			    						 sporter8.setS_sno(sporter3.getS_sno());
			    						 sporter8.setS_class(sporter3.getS_class());
			    						// sporter8.setS_sex(sporter3.getS_sex());
			    						// sporter8.setS_type(sporter3.getS_type());
			    						 int row=sporterService.updateNewsreel(sporter8);
			    						// int row=sporterService.createSporterNewsreel(sporter8);
			    					 }	    				 }
			    			 }
	    	  }
	    		  }
		     List<Sporter> sporter4s = sporterService.selectSporterNewsreel(sporter);
			model.addAttribute("msg", sporter4s);	
			model.addAttribute("msg1", "运动会纪录表");	
			return "view6";
	  }	
		
	   
		

}
