DROP TABLE gpsqlweb.param_type
GO

CREATE TABLE  gpsqlweb.param_type (
    id BIGINT NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    data_source_id BIGINT DEFAULT NULL,
    data_type varchar(255) NOT NULL,
    name varchar(255) NOT NULL,
    description VARCHAR(32000),
    query VARCHAR(32000),
    enabled char(1) DEFAULT 'Y',
    deleted char(1) DEFAULT 'N',
    created_at timestamp,
    created_by VARCHAR(20),
    updated_at timestamp,
    updated_by VARCHAR(20),
    CONSTRAINT gpsqlweb.pk_param_type_id PRIMARY KEY (id),
    FOREIGN KEY (data_source_id) REFERENCES gpsqlweb.data_source(id)
)
GO

/*

CREATE TABLE  `tesoreria`.`param_type` (
  `id` int(11) NOT NULL,
  `data_source_id` int(11) DEFAULT NULL,
  `data_type` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text,
  `query` text,
  `enabled` char(1) DEFAULT NULL,
  `deleted` char(1) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1
*/