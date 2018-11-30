##用户表
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `login_name` varchar(40) DEFAULT NULL COMMENT '登录名',
  `login_pwd` varchar(40) DEFAULT NULL COMMENT '登录密码',
  `status` char(5) DEFAULT NULL COMMENT '状态',
  `bind_phone` varchar(20) DEFAULT NULL COMMENT '绑定手机号',
  `id_no` varchar(30) DEFAULT NULL COMMENT '身份证号码',
  `user_role` varchar(40) DEFAULT NULL COMMENT '团队内部角色',
  `last_login_dt` datetime DEFAULT NULL COMMENT '最新登录时间',
  `is_valid` char(1) DEFAULT NULL COMMENT '是否有效',
  `remark` varchar(40) DEFAULT NULL COMMENT '备注',
  `crt_id` varchar(40) DEFAULT NULL COMMENT '创建人ID',
  `last_upd_dt` datetime DEFAULT NULL COMMENT '最新更新时间',
  `last_upd_id` varchar(40) DEFAULT NULL COMMENT '最新更新人ID',
  `last_opr_code` varchar(40) DEFAULT NULL COMMENT '最新更新操作类型',
  `company_id` varchar(40) DEFAULT NULL COMMENT '直属公司ID',
  `user_name` varchar(40) DEFAULT NULL COMMENT '姓名',
  `crt_dt` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
