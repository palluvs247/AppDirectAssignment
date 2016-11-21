/*
SQLyog Trial v12.3.1 (64 bit)
MySQL - 5.7.16-log : Database - appdirectdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`appdirectdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `appdirectdb`;

/*Table structure for table `customer_account` */

DROP TABLE IF EXISTS `customer_account`;

CREATE TABLE `customer_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accountIdentifier` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `account_identifier` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_account` */

/*Table structure for table `customer_address` */

DROP TABLE IF EXISTS `customer_address`;

CREATE TABLE `customer_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zip` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_address` */

/*Table structure for table `customer_company` */

DROP TABLE IF EXISTS `customer_company`;

CREATE TABLE `customer_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(100) DEFAULT NULL,
  `uuid` tinyblob,
  `website` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_company` */

/*Table structure for table `customer_item` */

DROP TABLE IF EXISTS `customer_item`;

CREATE TABLE `customer_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` varchar(11) DEFAULT NULL,
  `unit` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_item` */

/*Table structure for table `customer_order` */

DROP TABLE IF EXISTS `customer_order`;

CREATE TABLE `customer_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `edition_code` varchar(20) DEFAULT NULL,
  `pricing_duration` varchar(25) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `customer_order_ibfk_1` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_order` */

/*Table structure for table `product_subscription` */

DROP TABLE IF EXISTS `product_subscription`;

CREATE TABLE `product_subscription` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product_subscription_ibfk_2` (`company_id`),
  KEY `product_subscription_ibfk_3` (`order_id`),
  KEY `product_subscription_ibfk_4` (`account_id`),
  CONSTRAINT `product_subscription_ibfk_2` FOREIGN KEY (`company_id`) REFERENCES `customer_company` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `product_subscription_ibfk_3` FOREIGN KEY (`order_id`) REFERENCES `customer_order` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `product_subscription_ibfk_4` FOREIGN KEY (`account_id`) REFERENCES `customer_account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_subscription` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
