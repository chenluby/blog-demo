/*
 Navicat Premium Data Transfer

 Source Server         : demo_test
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : localhost:3306
 Source Schema         : blog-demo

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 21/03/2020 00:25:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog_demo
-- ----------------------------
DROP TABLE IF EXISTS `blog_demo`;
CREATE TABLE `blog_demo`  (
  `bd_id` int(4) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `bd_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `bd_add_time` datetime(0) NULL DEFAULT NULL COMMENT '添加时间',
  `bd_update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `bd_logic_delete` int(4) NULL DEFAULT NULL COMMENT '逻辑删除1 表示删除，0 表示未删除',
  PRIMARY KEY (`bd_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_demo
-- ----------------------------
INSERT INTO `blog_demo` VALUES (1, '小陈', '2020-03-21 00:20:30', '2020-03-21 00:20:38', 1);
INSERT INTO `blog_demo` VALUES (2, '小明', '2020-03-21 00:20:34', '2020-03-21 00:20:41', 0);

SET FOREIGN_KEY_CHECKS = 1;
