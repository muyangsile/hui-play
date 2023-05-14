/*
 Navicat Premium Data Transfer

 Source Server         : 8.0本地连接
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3307
 Source Schema         : hui_play

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 15/05/2023 00:13:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_menu_info
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_menu_info`;
CREATE TABLE `t_sys_menu_info`  (
                                    `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                    `pid` int(0) UNSIGNED NOT NULL DEFAULT 0 COMMENT '父ID',
                                    `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '名称',
                                    `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '菜单图标',
                                    `href` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '链接',
                                    `target` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '_self' COMMENT '链接打开方式',
                                    `sort` int(0) NULL DEFAULT 0 COMMENT '菜单排序',
                                    `status` tinyint(0) UNSIGNED NOT NULL DEFAULT 1 COMMENT '状态(0:禁用,1:启用)',
                                    `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
                                    `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
                                    `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                    PRIMARY KEY (`id`) USING BTREE,
                                    INDEX `title`(`title`) USING BTREE,
                                    INDEX `href`(`href`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 250 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统菜单表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_sys_menu_info
-- ----------------------------
INSERT INTO `t_sys_menu_info` VALUES (1, 0, '菜单管理', 'fa fa-window-maximize', '', '_self', 0, 1, NULL, '2023-05-14 23:46:59', '2023-05-14 23:47:01');
INSERT INTO `t_sys_menu_info` VALUES (2, 0, '商家管理', 'fa fa-lemon-o', '', '_self', 0, 1, NULL, '2023-05-14 23:48:07', '2023-05-14 23:48:14');
INSERT INTO `t_sys_menu_info` VALUES (3, 2, '审核商家', 'fa fa-adn', '', '_self', 0, 1, NULL, '2023-05-14 23:48:47', '2023-05-14 23:48:49');

SET FOREIGN_KEY_CHECKS = 1;
