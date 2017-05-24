/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-05-24 18:25:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_dict`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `dictcde` varchar(255) NOT NULL,
  `dictval` varchar(255) DEFAULT NULL,
  `dfltval` varchar(255) DEFAULT NULL,
  `dicttype` varchar(255) DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  `dictorder` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_dict
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_dicttype`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dicttype`;
CREATE TABLE `sys_dicttype` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `dicttype` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_dicttype
-- ----------------------------
INSERT INTO `sys_dicttype` VALUES ('1', '性别', null, '0');
INSERT INTO `sys_dicttype` VALUES ('2', '张三', null, null);

-- ----------------------------
-- Table structure for `sys_func`
-- ----------------------------
DROP TABLE IF EXISTS `sys_func`;
CREATE TABLE `sys_func` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `menuid` int(10) NOT NULL,
  `funcname` varchar(255) DEFAULT NULL,
  `functype` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_func
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `params` varchar(255) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `pid` int(10) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `order` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_param`
-- ----------------------------
DROP TABLE IF EXISTS `sys_param`;
CREATE TABLE `sys_param` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `parmcde` varchar(20) DEFAULT NULL,
  `parmval` varchar(2000) DEFAULT NULL,
  `note` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_param
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `loginname` varchar(20) DEFAULT NULL COMMENT '登录名',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `username` varchar(255) DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `othername` varchar(255) DEFAULT NULL COMMENT '别名',
  `telphone` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮件',
  `qq` varchar(255) DEFAULT NULL COMMENT 'QQ号码',
  `webchat` varchar(255) DEFAULT NULL COMMENT '微信号码',
  `dept` varchar(255) DEFAULT NULL COMMENT '所在科室ID',
  `status` varchar(10) DEFAULT NULL COMMENT '状态',
  `expiredate` datetime DEFAULT NULL COMMENT '过期日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('2', '00001', null, '2017-05-24', '系统管理员', null, '系统管理员', '18758187939', 'clanzl@126.com', '284550341', '18758187939', '', null, '2017-05-31 00:00:00');
INSERT INTO `sys_user` VALUES ('3', '123123123', null, null, '测试5', null, '123123123', '123123', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('4', '1112', null, null, '测试3', null, '111', '1231231', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('5', '1212', null, null, '1212', null, '', '121212', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('6', '123123', null, null, '123123', null, '', '123123', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('7', '123123', null, null, '测试9', null, '123123', '1213', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('8', '123123', null, null, '测试8', null, '123123', '1213', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('9', '1231', null, null, '测试7', null, '', '123123', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('10', '11', null, null, '测试1', null, '', '1231231', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('11', '123', null, null, '测试6', null, '123123', '123123', '', '', '', '', null, null);
INSERT INTO `sys_user` VALUES ('12', '12312', null, null, '测试2', null, '', '12312312', '', '', '', '', null, null);
