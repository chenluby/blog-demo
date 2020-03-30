/*
 Navicat Premium Data Transfer

 Source Server         : demo_test
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : localhost:3306
 Source Schema         : test_blog

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 31/03/2020 03:17:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `c_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `c_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '城市表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, '广州');
INSERT INTO `city` VALUES (2, '深圳');
INSERT INTO `city` VALUES (3, '上海');
INSERT INTO `city` VALUES (4, '北京');
INSERT INTO `city` VALUES (5, '浙江');
INSERT INTO `city` VALUES (6, '白云');

SET FOREIGN_KEY_CHECKS = 1;
