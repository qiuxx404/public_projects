/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-11 17:11:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_Id` tinyint(15) NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `user_name` varchar(8) NOT NULL COMMENT '用户姓名',
  `user_telephone` varchar(14) NOT NULL COMMENT '用户手机号',
  `user_address` varchar(50) NOT NULL COMMENT '用户地址',
  `user_email` varchar(20) NOT NULL COMMENT '用户邮箱',
  `user_description` varchar(100) NOT NULL COMMENT '用户描述信息',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标识，N:未删除，Y:已删除',
  PRIMARY KEY (`user_Id`),
  UNIQUE KEY `idx_user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '18942306374', '杭州', '1207655804@qq.com', '这是一个在杭州的人', '2017-12-06 14:00:46', '2017-12-06 14:00:46', 'N');
INSERT INTO `user` VALUES ('2', '李四', '12421423143', '上海', '2343122@qq.com', '这是一个在上海的人', '2017-12-08 17:50:27', '2017-12-11 17:08:10', 'N');
INSERT INTO `user` VALUES ('3', '王五', '12421423143', '北京', '2343122@qq.com', '这是一个在北京的人', '2017-12-08 17:50:27', '2017-12-11 17:08:22', 'N');
INSERT INTO `user` VALUES ('4', '赵六', '12421423143', '深圳', '2343122@qq.com', '这是一个在深圳的人', '2017-12-08 17:51:32', '2017-12-11 17:08:36', 'N');
