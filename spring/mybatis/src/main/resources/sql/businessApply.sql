CREATE TABLE `business_apply` (
  `id` int(64) NOT NULL COMMENT '主键',
  `businessType` varchar(64) NOT NULL COMMENT '订单类型',
  `businessNo` varchar(64) NOT NULL COMMENT '订单编号',
  `businessSum` varchar(64) NOT NULL COMMENT '订单逻辑编号',
  `name` varchar(64) NOT NULL COMMENT '名字',
  `province` varchar(255) DEFAULT '' COMMENT '省份',
  `city` varchar(255) DEFAULT '' COMMENT '城市'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

