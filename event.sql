CREATE DATABASE  IF NOT EXISTS `mogo_directory`;
USE `mogo_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `event`;

CREATE TABLE `event` (
  `id` int NOT NULL AUTO_INCREMENT,
  `min_people` int  DEFAULT 2,
  `max_people` int  DEFAULT 2,
  `name` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `starting_at` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `event` VALUES 
	(1,'2','4','Hógolyózás', "lenn az utcán","ma"),
	(2,'22','22','Foci', "a téren","holnap");

