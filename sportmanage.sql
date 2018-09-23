# Host: localhost  (Version 5.7.17-log)
# Date: 2018-09-23 20:31:21
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "sys_user"
#

CREATE TABLE `sys_user` (
  `user_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_code` varchar(32) NOT NULL COMMENT '用户账号',
  `user_name` varchar(50) NOT NULL COMMENT '用户名称',
  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
  `user_state` int(1) NOT NULL COMMENT '1:正常,0:暂停',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "sys_user"
#

INSERT INTO `sys_user` VALUES (1,'g1','刘宏伟','123',1);

#
# Structure for table "t_class"
#

CREATE TABLE `t_class` (
  `c_class` varchar(255) DEFAULT NULL,
  `c_grade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "t_class"
#

INSERT INTO `t_class` VALUES ('1512',0),('1513',0),('1514',0),('1515',0),('1516',0),('1517',0);

#
# Structure for table "tb_newsreel"
#

CREATE TABLE `tb_newsreel` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(255) DEFAULT NULL,
  `s_sex` varchar(2) DEFAULT NULL,
  `s_class` varchar(255) DEFAULT NULL,
  `s_sno` varchar(255) DEFAULT NULL,
  `s_type` varchar(255) DEFAULT NULL,
  `s_score` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "tb_newsreel"
#

INSERT INTO `tb_newsreel` VALUES (1,'乙13','男','1502','20150027','跑步','10.1'),(2,'甲14','女','1501','20150013','跑步','11.35'),(3,'丙2','男','1503','20150031','跳远','345.0'),(4,'甲5','女','1501','20150004','跳远','324.0');

#
# Structure for table "tb_sporters"
#

CREATE TABLE `tb_sporters` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `s_name` varchar(50) NOT NULL COMMENT '用户名称',
  `s_class` varchar(32) NOT NULL COMMENT '用户账号',
  `s_sno` varchar(32) NOT NULL COMMENT '学号',
  `s_sex` varchar(2) NOT NULL COMMENT '用户密码',
  `s_type` varchar(10) NOT NULL COMMENT '运动类型',
  `s_zu` int(4) DEFAULT NULL COMMENT '组号',
  `s_score` double DEFAULT NULL COMMENT '分数',
  `s_score1` double DEFAULT NULL,
  `s_score2` double DEFAULT NULL,
  `s_credit` int(11) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;

#
# Data for table "tb_sporters"
#

INSERT INTO `tb_sporters` VALUES (1,'甲1','1501','20150000','男','跑步',NULL,235,12.32,NULL,NULL),(2,'甲2','1501','20150001','男','跳远',NULL,345,NULL,NULL,1),(3,'甲3','1501','20150002','女','跑步',NULL,14.32,12.89,11.54,3),(4,'甲4','1501','20150003','男','跳远',NULL,543,NULL,NULL,3),(5,'甲5','1501','20150004','女','跳远',NULL,324,NULL,NULL,3),(6,'甲6','1501','20150005','男','跳远',NULL,235,NULL,NULL,0),(7,'甲7','1501','20150006','女','跑步',NULL,14.56,12.9,11.46,2),(8,'甲8','1501','20150007','女','跑步',NULL,14.7,12.78,11.47,1),(9,'甲9','1501','20150008','男','跳远',NULL,343,NULL,NULL,0),(10,'甲10','1501','20150009','女','跳远',NULL,245,NULL,NULL,2),(11,'甲11','1501','20150010','男','跑步',NULL,10.43,11.12,NULL,NULL),(12,'甲12','1501','20150011','女','跑步',NULL,14.87,12.8,11.75,0),(13,'甲13','1501','20150012','男','跑步',NULL,14.24,12.4,NULL,NULL),(14,'甲14','1501','20150013','女','跑步',NULL,14.45,13.45,11.35,0),(15,'甲15','1501','20150014','男','跑步',NULL,11.12,11.7,11.12,3),(16,'乙1','1502','20150015','男','跑步',NULL,11.43,11.23,NULL,NULL),(17,'乙2','1502','20150016','男','跳远',NULL,543,NULL,NULL,2),(18,'乙3','1502','20150017','女','跑步',NULL,14.875,13.456,NULL,NULL),(19,'乙4','1502','20150018','男','跳远',NULL,320,NULL,NULL,0),(20,'乙5','1502','20150019','女','跳远',NULL,123,NULL,NULL,0),(21,'乙6','1502','20150020','男','跳远',NULL,345,NULL,NULL,0),(22,'乙7','1502','20150021','女','跑步',NULL,14.98,NULL,NULL,NULL),(23,'乙8','1502','20150022','女','跑步',NULL,14.23,13.67,NULL,NULL),(24,'乙9','1502','20150023','男','跳远',NULL,220,NULL,NULL,0),(25,'乙10','1502','20150024','女','跳远',NULL,231,NULL,NULL,0),(26,'乙11','1502','20150025','男','跑步',NULL,10.67,11.43,NULL,NULL),(27,'乙12','1502','20150026','女','跑步',NULL,13.98,13.453,NULL,NULL),(28,'乙13','1502','20150027','男','跑步',NULL,14.5,12.23,10.1,2),(29,'乙14','1502','20150028','女','跑步',NULL,14.56,12.35,11.58,0),(30,'乙15','1502','20150029','男','跑步',NULL,14.6,11.234,10.7,1),(31,'丙1','1503','20150030','男','跑步',NULL,11.5,14.24,11.5,0),(32,'丙2','1503','20150031','男','跳远',NULL,345,NULL,NULL,0),(33,'丙3','1503','20150032','女','跑步',NULL,14.37,12.78,11.86,0),(34,'丙4','1503','20150033','男','跳远',NULL,324,NULL,NULL,0),(35,'丙5','1503','20150034','女','跳远',NULL,240,NULL,NULL,1),(36,'丙6','1503','20150035','男','跳远',NULL,324,NULL,NULL,0),(37,'丙7','1503','20150036','女','跑步',NULL,14.46,11.2,NULL,NULL),(38,'丙8','1503','20150037','女','跑步',NULL,14.29,12.4,11.5,0),(39,'丙9','1503','20150038','男','跳远',NULL,234,NULL,NULL,0),(40,'丙10','1503','20150039','女','跳远',NULL,220,NULL,NULL,0),(41,'丙11','1503','20150040','男','跑步',NULL,14.6,11.25,10.14,0),(42,'丙12','1503','20150041','女','跑步',NULL,14.93,NULL,NULL,NULL),(43,'丙13','1503','20150042','男','跑步',NULL,14.15,13.5,NULL,NULL),(44,'丙14','1503','20150043','女','跑步',NULL,15.2,NULL,NULL,NULL),(45,'丙15','1503','20150044','男','跑步',NULL,12.3,10.7,10.54,0),(46,'丁1','1504','20150045','男','跑步',NULL,14.5,10.67,NULL,NULL),(47,'丁2','1504','20150046','男','跳远',NULL,327,NULL,NULL,0),(48,'丁3','1504','20150047','女','跑步',NULL,13.99,12.4,NULL,NULL),(49,'丁4','1504','20150048','男','跳远',NULL,240,NULL,NULL,0),(50,'丁5','1504','20150049','女','跳远',NULL,234,NULL,NULL,0),(51,'丁6','1504','20150050','男','跳远',NULL,324,NULL,NULL,0),(52,'丁7','1504','20150051','女','跑步',NULL,14.85,11.23,NULL,NULL),(53,'丁8','1504','20150052','女','跑步',NULL,13.97,14.6,NULL,NULL),(54,'丁9','1504','20150053','男','跳远',NULL,245,NULL,NULL,0),(55,'丁10','1504','20150054','女','跳远',NULL,235,NULL,NULL,0),(56,'丁11','1504','20150055','男','跑步',NULL,12.98,11.12,NULL,NULL),(57,'丁12','1504','20150056','女','跑步',NULL,15.4,NULL,NULL,NULL),(58,'丁13','1504','20150057','男','跑步',NULL,12.23,12.4,NULL,NULL),(59,'丁14','1504','20150058','女','跑步',NULL,14.69,245,NULL,NULL),(60,'丁15','1504','20150059','男','跑步',NULL,12.35,14.6,NULL,NULL),(61,'甲16','1501','20150060','男','跑步',NULL,11.5,14.7,NULL,NULL),(62,'乙16','1502','20150061','男','跑步',NULL,14.24,11.43,10.23,0),(63,'丙16','1503','20150062','男','跑步',NULL,10.4,12.3,10.25,0),(64,'丁16','1504','20150063','男','跑步',NULL,14.6,NULL,NULL,NULL);
