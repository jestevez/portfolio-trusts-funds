

CREATE TABLE `tesoreria`.`tiposfid` (
 `fidtip` smallint(2) NOT NULL COMMENT 'FIDTIP',
 `fidtxt` VARCHAR(14) NOT NULL COMMENT 'FIDTXT'
);



CREATE TABLE  `tesoreria`.`perfil` (
  `prfprf` varchar(10) NOT NULL COMMENT 'PRFPRF',
  `prfnom` varchar(45) NOT NULL COMMENT 'PRFNOM',
  `prfced` varchar(12) NOT NULL COMMENT 'PRFCED'
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='PERFIL';

-- #############################################################################


CREATE TABLE  `tesoreria`.`permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `description` varchar(255) NOT NULL COMMENT 'DESCRIPTION',
  `url` varchar(255) NOT NULL COMMENT 'URL',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE  `tesoreria`.`role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `description` varchar(255) NOT NULL COMMENT 'DESCRIPTION',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE  `tesoreria`.`user_permission` (
  `username` varchar(255) NOT NULL COMMENT 'USERNAME',
  `permission_id` int(11) NOT NULL COMMENT 'PERMISSION_ID',
  PRIMARY KEY (`username`,`permission_id`),
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE  `tesoreria`.`role_members` (
  `username` varchar(255) NOT NULL COMMENT 'USERNAME',
  `role_id` int(11) NOT NULL COMMENT 'ROLE_ID',
  PRIMARY KEY (`username`,`role_id`),
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE  `tesoreria`.`role_permission` (
  `username` varchar(255) NOT NULL  COMMENT 'USERNAME',
  `role_id` int(11) NOT NULL  COMMENT 'ROLE_ID',
  PRIMARY KEY (`username`,`permission_id`),
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


