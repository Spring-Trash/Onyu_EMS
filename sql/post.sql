CREATE TABLE `post` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `userId` int(11) NOT NULL,
                        `title` char(100) NOT NULL,
                        `content` text NOT NULL,
                        `postId` uuid DEFAULT uuid(),
                        PRIMARY KEY (`id`),
                        KEY `post_to_user_fk` (`userId`),
                        CONSTRAINT `post_to_user_fk` FOREIGN KEY (`userId`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='작성자'

