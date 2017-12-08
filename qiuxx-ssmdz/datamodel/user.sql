/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-08 23:58:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_name` varchar(8) NOT NULL COMMENT '用户姓名',
  `user_telephone` varchar(18) NOT NULL COMMENT '用户手机号',
  `user_email` varchar(18) NOT NULL COMMENT '用户邮箱',
  `user_address` varchar(40) NOT NULL COMMENT '用户所在地',
  `user_description` varchar(80) NOT NULL COMMENT '用户相关描述',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标志，N:为删除，Y:已删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `idx_user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王五', '1894232433', '3241234313@qq.com', '北京', '这个人在北京', 'N', '2017-12-08 22:02:18', '2017-12-08 23:41:49');
INSERT INTO `user` VALUES ('4', '李四', '1894232433', '3241234313@qq.com', '天津', '这个人在天津', 'N', '2017-12-08 23:48:27', '2017-12-08 23:48:27');
INSERT INTO `user` VALUES ('5', '张三', '1894232433', '3241234313@qq.com', '天津', '这个人在天津', 'N', '2017-12-08 23:57:56', '2017-12-08 23:57:56');
