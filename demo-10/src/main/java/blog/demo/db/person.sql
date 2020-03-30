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

 Date: 31/03/2020 03:17:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `p_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `p_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `p_sex` int(2) NULL DEFAULT NULL COMMENT '0女1男',
  `c_id` int(10) NULL DEFAULT NULL COMMENT '城市表主键(city)',
  PRIMARY KEY (`p_id`) USING BTREE,
  INDEX `fk_person_city_1`(`c_id`) USING BTREE,
  CONSTRAINT `fk_person_city_1` FOREIGN KEY (`c_id`) REFERENCES `city` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '人的信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, '111', 1, 1);
INSERT INTO `person` VALUES (2, '2', 0, 1);
INSERT INTO `person` VALUES (3, '3', 1, 2);

SET FOREIGN_KEY_CHECKS = 1;
