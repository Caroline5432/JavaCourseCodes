-- # 用于用户数据库及表的初始化

CREATE DATABASE if not exists `test`;

USE `test`;

CREATE TABLE IF NOT EXISTS `users` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(16) NOT NULL COMMENT '名称',
    `password` varchar(16) NOT NULL COMMENT '密码',
    `phoneNumber` varchar(15) NOT NULL COMMENT '手机号',
    `identify_card` varchar(16) NOT NULL COMMENT '身份证号',
    `money` int(11) NOT NULL COMMENT '账户余额',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='生成时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='更新时间',
    `deleted` tinyint(1) DEFAULT 0 NOT NULL COMMENT '删除标记：0未删除，1已删除',
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE IF NOT EXISTS `stores` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(16) NOT NULL COMMENT='名称',
    `description` varchar(1024) NOT NULL COMMENT='描述',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='生成时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='更新时间',
    `deleted` tinyint(1) DEFAULT 0 NOT NULL COMMENT '删除标记：0未删除，1已删除',
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='店铺表';

CREATE TABLE IF NOT EXISTS `goods` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(16) NOT NULL COMMENT='名称',
    `description` varchar(1024) NOT NULL COMMENT='描述',
    `price` int(11) NOT NULL COMMENT='价格',
    `weight` int(11) NOT NULL COMMENT='重量',
    `store_id` int(11) NOT NULL COMMENT='所属店铺id',
    `store_name` varchar(16) NOT NULL COMMENT='所属店铺名称',
    `status` int(1) NOT NULL COMMENT='商品状态',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='生成时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='更新时间',
    `deleted` tinyint(1) DEFAULT 0 NOT NULL COMMENT '删除标记：0未删除，1已删除',
    PRIMARY KEY (`id`),
    foreign key (store_id) references stores(id)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='店铺表';

-- # 订单表:id、用户id、商品列表、订单状态、物流状态、总价、生成时间、更新时间
CREATE TABLE IF NOT EXISTS `orders` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `user_id` int(11) NOT NULL COMMENT='用户id',
    `commodities` varchar(10024) NOT NULL COMMENT='商品列表',
    `status` int(1) NOT NULL COMMENT='订单状态',
    `deliver_status` varchar(10024) NOT NULL COMMENT='物流状态',
    `total_price` int(11) NOT NULL COMMENT='总价',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='生成时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT='更新时间',
    `deleted` tinyint(1) DEFAULT 0 NOT NULL COMMENT '删除标记：0未删除，1已删除',
    PRIMARY KEY (`id`),
    foreign key (user_id) references users(id)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
