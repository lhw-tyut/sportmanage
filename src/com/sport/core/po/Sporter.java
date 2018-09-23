package com.sport.core.po;
import java.io.Serializable;
import java.util.Date;
public class Sporter implements Serializable{
   /**
    * 运动员持久化类
   */

		private static final long serialVersionUID = 1L;
		private Integer s_id;        
		private String s_name;        
		private String s_class;
		private String s_sno;   
		private String s_sex;      
		private String s_type;    
		private Integer s_zu;       
		private double s_score;   
		private double s_score1;
		private double s_score2;
		private Integer s_credit;
		private Integer start;            // 起始行
		private Integer rows;   
		
		public Integer getStart() {
			return start;
		}
		public void setStart(Integer start) {
			this.start = start;
		}
		public Integer getRows() {
			return rows;
		}
		public void setRows(Integer rows) {
			this.rows = rows;
		}
		public Integer getS_credit() {
			return s_credit;
		}
		public void setS_credit(Integer s_credit) {
			this.s_credit = s_credit;
		}
		public double getS_score1() {
			return s_score1;
		}
		public void setS_score1(double s_score1) {
			this.s_score1 = s_score1;
		}
		public double getS_score2() {
			return s_score2;
		}
		public void setS_score2(double s_score2) {
			this.s_score2 = s_score2;
		}
		public Integer getS_id() {
			return s_id;
		}
		public void setS_id(Integer s_id) {
			this.s_id = s_id;
		}
		public String getS_name() {
			return s_name;
		}
		public void setS_name(String s_name) {
			this.s_name = s_name;
		}
		public String getS_class() {
			return s_class;
		}
		public void setS_class(String s_class) {
			this.s_class = s_class;
		}
		public String getS_sno() {
			return s_sno;
		}
		public void setS_sno(String s_sno) {
			this.s_sno = s_sno;
		}
		public String getS_sex() {
			return s_sex;
		}
		public void setS_sex(String s_sex) {
			this.s_sex = s_sex;
		}
		public String getS_type() {
			return s_type;
		}
		public void setS_type(String s_type) {
			this.s_type = s_type;
		}
		public Integer getS_zu() {
			return s_zu;
		}
		public void setS_zu(Integer s_zu) {
			this.s_zu = s_zu;
		}
		public double getS_score() {
			return s_score;
		}
		public void setS_score(double s_score) {
			this.s_score = s_score;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

}