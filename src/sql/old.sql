/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : old

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2019-11-11 10:31:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_admin`
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('1', 'admin', '123', 'admin');

-- ----------------------------
-- Table structure for `t_check`
-- ----------------------------
DROP TABLE IF EXISTS `t_check`;
CREATE TABLE `t_check` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `check_in` date DEFAULT NULL,
  `check_out` date DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_check
-- ----------------------------

-- ----------------------------
-- Table structure for `t_check_statistics`
-- ----------------------------
DROP TABLE IF EXISTS `t_check_statistics`;
CREATE TABLE `t_check_statistics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `statistics_year` int(11) DEFAULT NULL,
  `statistics_month` int(11) DEFAULT NULL,
  `late_count` int(11) DEFAULT NULL,
  `leaveearly_count` int(11) DEFAULT NULL,
  `absenteeism_count` int(11) DEFAULT NULL,
  `absenteeismhalf_count` int(11) DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_check_statistics
-- ----------------------------

-- ----------------------------
-- Table structure for `t_dept`
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `description` text,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1', '后勤部', '后勤', '1');
INSERT INTO `t_dept` VALUES ('2', '人事部', '人事', '1');
INSERT INTO `t_dept` VALUES ('3', '财务部', '财务', '1');
INSERT INTO `t_dept` VALUES ('4', '保安部', '保安', '1');
INSERT INTO `t_dept` VALUES ('5', '营运部', '营运', '1');
INSERT INTO `t_dept` VALUES ('6', '客服部', '客服', '1');
INSERT INTO `t_dept` VALUES ('7', '采购部', '采购', '1');
INSERT INTO `t_dept` VALUES ('8', '开发部01', '开发', '1');
INSERT INTO `t_dept` VALUES ('9', '开发部02', '开发', '1');
INSERT INTO `t_dept` VALUES ('10', '开发部03', '开发', '1');
INSERT INTO `t_dept` VALUES ('11', '开发部04', '开发', '1');

-- ----------------------------
-- Table structure for `t_emp`
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `work_number` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `startday` date DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `marital_status` int(11) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `birthplace_province` int(11) DEFAULT NULL,
  `birthplace_city` int(11) DEFAULT NULL,
  `political_outlook` int(11) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `position_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp` VALUES ('1', 'zhangsan', 'kaifa01', '123', '1991-11-14', '2019-07-09', '1', '1', '15268670000', '15268670000@qq.com', '11', '1101', '1', '8', '15', '1', '2');

-- ----------------------------
-- Table structure for `t_permission`
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `description` text,
  `uri` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7006 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES ('1000', '管理员登录', '管理员登录', 'adminLogin/login');
INSERT INTO `t_permission` VALUES ('1001', '员工登录', '员工登录', 'empLogin/login');
INSERT INTO `t_permission` VALUES ('1002', '员工修改密码', '员工修改密码', 'emp/modifyPassword');
INSERT INTO `t_permission` VALUES ('1003', '员工修改个人信息', '员工修改个人信息', 'emp/modify');
INSERT INTO `t_permission` VALUES ('1004', '管理员增加员工', '管理员增加员工', 'empAdmin/add');
INSERT INTO `t_permission` VALUES ('1005', '管理员根据员工id删除', '管理员根据员工id删除', 'empAdmin/remove');
INSERT INTO `t_permission` VALUES ('1006', '管理员修改员工工作信息', '管理员修改员工工作信息', 'empAdmin/modify');
INSERT INTO `t_permission` VALUES ('1007', '管理员查询一个员工', '管理员查询一个员工', 'empAdmin/findById');
INSERT INTO `t_permission` VALUES ('1008', '管理员查询所有员工', '管理员查询所有员工', 'empAdmin/findAll');
INSERT INTO `t_permission` VALUES ('1009', '管理员模糊查询员工', '管理员模糊查询员工', 'empAdmin/find');
INSERT INTO `t_permission` VALUES ('2001', '员工id查部门', '员工id查部门', 'dept/findById');
INSERT INTO `t_permission` VALUES ('2002', '管理员添加部门', '管理员添加部门', 'deptAdmin/add');
INSERT INTO `t_permission` VALUES ('2003', '管理员删除部门', '管理员删除部门', 'deptAdmin/remove');
INSERT INTO `t_permission` VALUES ('2004', '管理员修改部门', '管理员修改部门', 'deptAdmin/modify');
INSERT INTO `t_permission` VALUES ('2005', '管理员查询所有部门', '管理员查询所有部门', 'deptAdmin/findAll');
INSERT INTO `t_permission` VALUES ('2006', '管理员部门名称模糊查询', '管理员部门名称模糊查询', 'deptAdmin/findByName');
INSERT INTO `t_permission` VALUES ('3001', '员工职位查询', '员工职位查询', 'position/findById');
INSERT INTO `t_permission` VALUES ('3002', '管理员添加职位', '管理员添加职位', 'positionAdmin/add');
INSERT INTO `t_permission` VALUES ('3003', '管理员删除职位', '管理员删除职位', 'positionAdmin/remove');
INSERT INTO `t_permission` VALUES ('3004', '管理员修改职位', '管理员修改职位', 'positionAdmin/modify');
INSERT INTO `t_permission` VALUES ('3005', '管理员查询所有职位', '管理员查询所有职位', 'positionAdmin/findAll');
INSERT INTO `t_permission` VALUES ('3006', '管理员部门id查职位', '管理员部门id查职位', 'positionAdmin/findByDeptId');
INSERT INTO `t_permission` VALUES ('4001', '员工签到', '员工签到', 'check/checkIn');
INSERT INTO `t_permission` VALUES ('4002', '员工签退', '员工签退', 'check/checkOut');
INSERT INTO `t_permission` VALUES ('4003', '员工考勤查询', '员工考勤查询', 'check/findByIdYearMonth');
INSERT INTO `t_permission` VALUES ('4004', '管理员查询员工具体考勤', '管理员查询员工具体考勤', 'checkAdmin/findByIdYearMonth');
INSERT INTO `t_permission` VALUES ('4005', '管理员条件查询员工考勤', '管理员条件查询员工考勤', 'checkAdmin/findByDeptPosiTime');
INSERT INTO `t_permission` VALUES ('5001', '员工查薪资', '员工查薪资', 'salary/findByIdYearMonth');
INSERT INTO `t_permission` VALUES ('5002', '管理员模糊查询员工薪资', '管理员模糊查询员工薪资', 'salaryAdmin/find');
INSERT INTO `t_permission` VALUES ('6001', '管理员增加角色并设定权限', '管理员增加角色并设定权限', 'permissionAdmin/addRole');
INSERT INTO `t_permission` VALUES ('6002', '管理员删除角色', '管理员删除角色', 'permissionAdmin/removeRole');
INSERT INTO `t_permission` VALUES ('6003', '管理员修改角色', '管理员修改角色', 'permissionAdmin/modifyRole');
INSERT INTO `t_permission` VALUES ('6004', '管理员查询角色权限', '管理员查询角色权限', 'permissionAdmin/findRole');
INSERT INTO `t_permission` VALUES ('7001', '员工发布意见', '员工发布意见', 'suggestion/add');
INSERT INTO `t_permission` VALUES ('7002', '员工删除意见', '员工删除意见', 'suggestion/remove');
INSERT INTO `t_permission` VALUES ('7003', '员工查询意见', '员工查询意见', 'suggestion/find');
INSERT INTO `t_permission` VALUES ('7004', '管理员删除意见', '管理员删除意见', 'suggestionAdmin/remove');
INSERT INTO `t_permission` VALUES ('7005', '管理员查询意见', '管理员查询意见', 'suggestionAdmin/find');

-- ----------------------------
-- Table structure for `t_position`
-- ----------------------------
DROP TABLE IF EXISTS `t_position`;
CREATE TABLE `t_position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `description` text,
  `base_salary` double DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_position
-- ----------------------------
INSERT INTO `t_position` VALUES ('1', '后勤人员', '后勤', '3000', '1', '1');
INSERT INTO `t_position` VALUES ('2', '后勤经理', '后勤经理', '5000', '1', '1');
INSERT INTO `t_position` VALUES ('3', '人事人员', '人事', '4000', '1', '2');
INSERT INTO `t_position` VALUES ('4', '人事经理', '人事经理', '6000', '1', '2');
INSERT INTO `t_position` VALUES ('5', '财务人员', '财务', '4500', '1', '3');
INSERT INTO `t_position` VALUES ('6', '财务经理', '财务经理', '6500', '1', '3');
INSERT INTO `t_position` VALUES ('7', '保安人员', '保安', '3000', '1', '4');
INSERT INTO `t_position` VALUES ('8', '保安经理', '保安经理', '6000', '1', '4');
INSERT INTO `t_position` VALUES ('9', '营运人员', '营运', '5000', '1', '5');
INSERT INTO `t_position` VALUES ('10', '营运经理', '营运经理', '8000', '1', '5');
INSERT INTO `t_position` VALUES ('11', '客服人员', '客服', '4000', '1', '6');
INSERT INTO `t_position` VALUES ('12', '客服经理', '客服经理', '6000', '1', '6');
INSERT INTO `t_position` VALUES ('13', '采购人员', '采购', '5000', '1', '7');
INSERT INTO `t_position` VALUES ('14', '采购经理', '采购经理', '7000', '1', '7');
INSERT INTO `t_position` VALUES ('15', '开发人员01', '开发01', '7000', '1', '8');
INSERT INTO `t_position` VALUES ('16', '开发经理01', '开发经理01', '9000', '1', '8');
INSERT INTO `t_position` VALUES ('17', '开发人员02', '开发02', '7000', '1', '9');
INSERT INTO `t_position` VALUES ('18', '开发经理02', '开发经理02', '9000', '1', '9');
INSERT INTO `t_position` VALUES ('19', '开发人员03', '开发03', '8000', '1', '10');
INSERT INTO `t_position` VALUES ('20', '开发经理03', '开发经理03', '10000', '1', '10');
INSERT INTO `t_position` VALUES ('21', '开发人员04', '开发04', '9000', '1', '11');
INSERT INTO `t_position` VALUES ('22', '开发经理04', '开发经理04', '11000', '1', '11');

-- ----------------------------
-- Table structure for `t_replay`
-- ----------------------------
DROP TABLE IF EXISTS `t_replay`;
CREATE TABLE `t_replay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `replay_time` datetime DEFAULT NULL,
  `replay_empid` int(11) DEFAULT NULL,
  `content` text,
  `suggestion_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_replay
-- ----------------------------

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '超级管理员', '超级管理员');
INSERT INTO `t_role` VALUES ('2', '普通员工', '普通员工');

-- ----------------------------
-- Table structure for `t_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permission`;
CREATE TABLE `t_role_permission` (
  `role_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role_permission
-- ----------------------------
INSERT INTO `t_role_permission` VALUES ('1', '1000');
INSERT INTO `t_role_permission` VALUES ('1', '1004');
INSERT INTO `t_role_permission` VALUES ('1', '1005');
INSERT INTO `t_role_permission` VALUES ('1', '1006');
INSERT INTO `t_role_permission` VALUES ('1', '1007');
INSERT INTO `t_role_permission` VALUES ('1', '1008');
INSERT INTO `t_role_permission` VALUES ('1', '1009');
INSERT INTO `t_role_permission` VALUES ('1', '2002');
INSERT INTO `t_role_permission` VALUES ('1', '2003');
INSERT INTO `t_role_permission` VALUES ('1', '2004');
INSERT INTO `t_role_permission` VALUES ('1', '2005');
INSERT INTO `t_role_permission` VALUES ('1', '2006');
INSERT INTO `t_role_permission` VALUES ('1', '3002');
INSERT INTO `t_role_permission` VALUES ('1', '3003');
INSERT INTO `t_role_permission` VALUES ('1', '3004');
INSERT INTO `t_role_permission` VALUES ('1', '3005');
INSERT INTO `t_role_permission` VALUES ('1', '3006');
INSERT INTO `t_role_permission` VALUES ('1', '4004');
INSERT INTO `t_role_permission` VALUES ('1', '4005');
INSERT INTO `t_role_permission` VALUES ('1', '5002');
INSERT INTO `t_role_permission` VALUES ('1', '6001');
INSERT INTO `t_role_permission` VALUES ('1', '6002');
INSERT INTO `t_role_permission` VALUES ('1', '6003');
INSERT INTO `t_role_permission` VALUES ('1', '6004');
INSERT INTO `t_role_permission` VALUES ('1', '7004');
INSERT INTO `t_role_permission` VALUES ('1', '7005');
INSERT INTO `t_role_permission` VALUES ('2', '1001');
INSERT INTO `t_role_permission` VALUES ('2', '1002');
INSERT INTO `t_role_permission` VALUES ('2', '1003');
INSERT INTO `t_role_permission` VALUES ('2', '2001');
INSERT INTO `t_role_permission` VALUES ('2', '3001');
INSERT INTO `t_role_permission` VALUES ('2', '4001');
INSERT INTO `t_role_permission` VALUES ('2', '4002');
INSERT INTO `t_role_permission` VALUES ('2', '4003');
INSERT INTO `t_role_permission` VALUES ('2', '5001');
INSERT INTO `t_role_permission` VALUES ('2', '7001');
INSERT INTO `t_role_permission` VALUES ('2', '7002');
INSERT INTO `t_role_permission` VALUES ('2', '7003');

-- ----------------------------
-- Table structure for `t_salary`
-- ----------------------------
DROP TABLE IF EXISTS `t_salary`;
CREATE TABLE `t_salary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `salary_year` int(11) DEFAULT NULL,
  `salary_month` int(11) DEFAULT NULL,
  `base_salary` double DEFAULT NULL,
  `insurance` double DEFAULT NULL,
  `accumulation_fund` double DEFAULT NULL,
  `tax` double DEFAULT NULL,
  `achievements` double DEFAULT NULL,
  `really_salary` double DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_salary
-- ----------------------------

-- ----------------------------
-- Table structure for `t_suggestion`
-- ----------------------------
DROP TABLE IF EXISTS `t_suggestion`;
CREATE TABLE `t_suggestion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(32) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `content` text,
  `emp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_suggestion
-- ----------------------------
