CREATE TABLE `user` (
                        `userId` char(50) NOT NULL,
                        `userPass` char(50) NOT NULL,
                        `name` char(30) DEFAULT NULL,
                        `empId` char(30) NOT NULL,
                        `email` char(100) NOT NULL,
                        `nickname` char(30) NOT NULL,
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `message` char(100) DEFAULT NULL,
                        `admin` tinyint(1) NOT NULL DEFAULT 0,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

