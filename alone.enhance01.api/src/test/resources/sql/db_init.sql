CREATE TABLE `user` (
                        `user_id` bigint NOT NULL AUTO_INCREMENT,
                        `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
                        `level` int DEFAULT NULL,
                        `nickname` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
                        `create_fulltime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                        PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


INSERT INTO `user`(`name`,`level`,`nickname`)
VALUES
       ('noear',1,'noear1'),
       ('noear',1,'noear2'),
       ('noear',1,'noear3'),
       ('noear',1,'noear4'),
       ('noear',1,'noear5')