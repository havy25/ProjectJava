-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.32-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for database
CREATE DATABASE IF NOT EXISTS `database` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
USE `database`;

-- Dumping structure for table database.files
CREATE TABLE IF NOT EXISTS `files` (
  `FileID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `FileExtension` varchar(255) DEFAULT NULL,
  `BlurHash` varchar(255) DEFAULT NULL,
  `Status` char(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`FileID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Dumping data for table database.files: ~6 rows (approximately)
INSERT INTO `files` (`FileID`, `FileExtension`, `BlurHash`, `Status`) VALUES
	(1, '.jpg', NULL, '0'),
	(2, '.jpg', NULL, '0'),
	(3, '.jpg', 'LJLg*4yst,eS=|WVtSaK%~#+IotR', '1'),
	(4, '.jpg', 'LIGI=j?H4:9Z?wWV%2xu00M{sms;', '1'),
	(5, '.jpg', 'LIGI=j?H4:9Z?wWV%2xu00M{sms;', '1'),
	(6, '.jpg', 'LIGI=j?H4:9Z?wWV%2xu00M{sms;', '1');

-- Dumping structure for table database.messages
CREATE TABLE IF NOT EXISTS `messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `from_user_id` int(11) NOT NULL,
  `to_user_id` int(11) NOT NULL,
  `message` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `send_time` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Dumping data for table database.messages: ~6 rows (approximately)
INSERT INTO `messages` (`id`, `from_user_id`, `to_user_id`, `message`, `send_time`) VALUES
	(1, 113, 114, 'chào', '2024-06-20 07:59:41'),
	(2, 114, 113, 'đi học k?', '2024-06-20 08:00:19'),
	(3, 113, 114, 'mấy giờ', '2024-06-20 08:11:05'),
	(4, 114, 113, '8h', '2024-06-20 08:11:10'),
	(5, 113, 114, 'L', '2024-06-20 08:57:52'),
	(6, 114, 113, 'O', '2024-06-20 08:57:55');

-- Dumping structure for table database.user
CREATE TABLE IF NOT EXISTS `user` (
  `UserID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `UserName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Dumping data for table database.user: ~10 rows (approximately)
INSERT INTO `user` (`UserID`, `UserName`, `Password`) VALUES
	(36, 'dara', '123'),
	(104, 'Lee Thắm', 'tham123'),
	(105, 'Minh Duy', 'duy123'),
	(107, 'Hạ Vy', '123'),
	(108, 'Thảo Vy', '123456789'),
	(109, 'Khả Ni', '123456789@@'),
	(110, 'Đặng Nhung', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225'),
	(111, 'Khang', 'fae1657b9bf9a22e091ad18307b8a3f172abc20aa99a7a5f58699561c49dd5f1'),
	(113, 'Hân', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3'),
	(114, 'Ngọc', 'ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad');

-- Dumping structure for table database.user_account
CREATE TABLE IF NOT EXISTS `user_account` (
  `UserID` int(10) unsigned NOT NULL,
  `UserName` varchar(255) DEFAULT NULL,
  `Gender` char(1) NOT NULL DEFAULT '',
  `Image` longblob DEFAULT NULL,
  `ImageString` varchar(255) DEFAULT '',
  `Status` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`UserID`),
  CONSTRAINT `user_account_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Dumping data for table database.user_account: ~9 rows (approximately)
INSERT INTO `user_account` (`UserID`, `UserName`, `Gender`, `Image`, `ImageString`, `Status`) VALUES
	(36, 'dara', '', _binary 0x6c6f61645f66696c652827433a2f2f55736572732f2f617375732f2f4f6e6544726976652f2f5461cc69206c69eaf2752f2f4e65744265616e7350726f6a656374732f2f43756f694b694a6176612f2f54657374436861742f2f50726f6a6563744a6176612f2f636b2f2f7372632f2f69636f6e2f2f75736572322e706e672729, '', '1'),
	(104, 'Thắm', '', NULL, '', '1'),
	(105, 'Duy', '', NULL, '', '1'),
	(107, 'Vy', '', NULL, '', '1'),
	(108, 'Thảo Vy', '', NULL, '', '1'),
	(109, 'Khả Ni', '', NULL, '', '1'),
	(110, 'Đặng Nhung', '', NULL, '', '1'),
	(111, 'Khang', '', NULL, '', '1'),
	(113, 'Hân', '', _binary 0x6c6f61645f66696c652827433a2f2f55736572732f2f617375732f2f4f6e6544726976652f2f5461cc69206c69eaf2752f2f4e65744265616e7350726f6a656374732f2f43756f694b694a6176612f2f54657374436861742f2f50726f6a6563744a6176612f2f636b2f2f7372632f2f69636f6e2f2f75736572322e706e672729, '', '1'),
	(114, 'Ngọc', '', _binary 0x6c6f61645f66696c652827433a2f2f55736572732f2f617375732f2f4f6e6544726976652f2f5461cc69206c69eaf2752f2f4e65744265616e7350726f6a656374732f2f43756f694b694a6176612f2f54657374436861742f2f50726f6a6563744a6176612f2f636b2f2f7372632f2f69636f6e2f2f75736572322e706e672729, '', '1');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
