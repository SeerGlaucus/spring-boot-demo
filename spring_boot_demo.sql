/*
 Navicat Premium Data Transfer

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : utf-8

 Date: 10/12/2017 15:50:37 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `roncoo_user`
-- ----------------------------
DROP TABLE IF EXISTS `roncoo_user`;
CREATE TABLE `roncoo_user` (
  `name` varchar(10) DEFAULT NULL,
  `create_time` datetime(6) DEFAULT NULL,
  `id` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `roncoo_user`
-- ----------------------------
BEGIN;
INSERT INTO `roncoo_user` VALUES ('测试', '2017-10-11 11:24:46.829000', '1'), ('测试2', '2017-10-11 11:25:29.126000', '2'), ('测试', '2017-10-11 11:25:06.205000', '3'), ('测试', '2017-10-11 17:02:20.301000', '4'), ('测试', '2017-10-11 17:08:56.663000', '5'), ('测试', '2017-10-11 17:23:00.743000', '6');
COMMIT;

-- ----------------------------
--  Table structure for `roncoo_user_log`
-- ----------------------------
DROP TABLE IF EXISTS `roncoo_user_log`;
CREATE TABLE `roncoo_user_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `user_ip` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `roncoo_user_log`
-- ----------------------------
BEGIN;
INSERT INTO `roncoo_user_log` VALUES ('2', '无境2', '192.168.0.1', '2017-10-11 14:06:27'), ('3', '无境', '192.168.0.1', '2017-10-11 14:05:51');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
