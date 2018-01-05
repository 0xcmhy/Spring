CREATE TABLE `business_apply` (
  `id` int(64) NOT NULL COMMENT '主键',
  `businessType` varchar(64) NOT NULL COMMENT '订单类型',
  `businessNo` varchar(64) NOT NULL COMMENT '订单编号',
  `businessSum` varchar(64) NOT NULL COMMENT '订单逻辑编号',
  `name` varchar(64) NOT NULL COMMENT '名字',
  `province` varchar(255) DEFAULT '' COMMENT '省份',
  `city` varchar(255) DEFAULT '' COMMENT '城市'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `customer` (
  `id` int(64) NOT NULL COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `credit_sys`.`business_apply` (`id`, `businessType`, `businessNo`, `businessSum`, `name`, `province`, `city`) VALUES ('1', '个贷', '1', '2000', '个贷', '上海市', '上海');
INSERT INTO `credit_sys`.`business_apply` (`id`, `businessType`, `businessNo`, `businessSum`, `name`, `province`, `city`) VALUES ('2', '个贷', '2', '2000', '个贷', '北京市', '北京');

