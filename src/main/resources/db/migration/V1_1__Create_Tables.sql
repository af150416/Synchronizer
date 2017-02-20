-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: analyze_declarations
-- ------------------------------------------------------
-- Server version	5.7.17-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `costs`
--

DROP TABLE IF EXISTS `costs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `costs` (
  `id` int(11) NOT NULL,
  `spec_expenses` varchar(45) DEFAULT NULL,
  `spec_other_expenses` varchar(45) DEFAULT NULL,
  `spec_expenses_subject` varchar(45) DEFAULT NULL,
  `spec_expenses_other_subject` varchar(45) DEFAULT NULL,
  `spec_expenses_assets_subject` varchar(45) DEFAULT NULL,
  `spec_expenses_realty_subject` varchar(45) DEFAULT NULL,
  `spec_expenses_movable_subject` varchar(45) DEFAULT NULL,
  `spec_expenses_other_realty_subject` varchar(45) DEFAULT NULL,
  `spec_expenses_other_movable_subject` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `costs`
--

LOCK TABLES `costs` WRITE;
/*!40000 ALTER TABLE `costs` DISABLE KEYS */;
/*!40000 ALTER TABLE `costs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financial_obligations`
--

DROP TABLE IF EXISTS `financial_obligations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `financial_obligations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `person_id` int(11) NOT NULL,
  `currency` varchar(45) DEFAULT NULL,
  `guarantor` varchar(45) DEFAULT NULL,
  `date_origin` date DEFAULT NULL,
  `object_type` varchar(45) DEFAULT NULL,
  `size_obligation` double DEFAULT NULL,
  `emitent_citizen` varchar(45) DEFAULT NULL,
  `other_object_type` varchar(45) DEFAULT NULL,
  `guarantor_exist` tinyint(1) DEFAULT NULL,
  `emitent_company_name` varchar(45) DEFAULT NULL,
  `emitent_firstname` varchar(45) DEFAULT NULL,
  `emitent_lastname` varchar(45) DEFAULT NULL,
  `emitent_middlename` varchar(45) DEFAULT NULL,
  `financial_obligationscol` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financial_obligations`
--

LOCK TABLES `financial_obligations` WRITE;
/*!40000 ALTER TABLE `financial_obligations` DISABLE KEYS */;
/*!40000 ALTER TABLE `financial_obligations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `income`
--

DROP TABLE IF EXISTS `income`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `income` (
  `id` int(11) NOT NULL,
  `person_id` int(11) DEFAULT NULL,
  `rights_id` int(11) DEFAULT NULL,
  `iteration` int(11) DEFAULT NULL,
  `object_type` varchar(45) DEFAULT NULL,
  `size_income` int(11) DEFAULT NULL,
  `income_source` varchar(45) DEFAULT NULL,
  `source_citizen` varchar(45) DEFAULT NULL,
  `source_ua_company_name` varchar(45) DEFAULT NULL,
  `size_assets` int(11) DEFAULT NULL,
  `organization` varchar(45) DEFAULT NULL,
  `assets_currency` varchar(45) DEFAULT NULL,
  `type_income` enum('GIFT','ASSETS') DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `income`
--

LOCK TABLES `income` WRITE;
/*!40000 ALTER TABLE `income` DISABLE KEYS */;
/*!40000 ALTER TABLE `income` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `luxury_things`
--

DROP TABLE IF EXISTS `luxury_things`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `luxury_things` (
  `id` int(11) NOT NULL,
  `person_id` int(11) DEFAULT NULL,
  `rights_id` int(11) DEFAULT NULL,
  `date_use` date DEFAULT NULL,
  `iteration` int(11) DEFAULT NULL,
  `trademark` varchar(45) DEFAULT NULL,
  `object_type` varchar(45) DEFAULT NULL,
  `property_descr` varchar(45) DEFAULT NULL,
  `other_object_type` varchar(45) DEFAULT NULL,
  `manufacturer_name` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `luxury_things`
--

LOCK TABLES `luxury_things` WRITE;
/*!40000 ALTER TABLE `luxury_things` DISABLE KEYS */;
/*!40000 ALTER TABLE `luxury_things` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `realuty`
--

DROP TABLE IF EXISTS `realuty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `realuty` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `person_id` int(11) DEFAULT NULL,
  `rights_id` int(11) DEFAULT NULL,
  `cost_date` int(11) DEFAULT NULL,
  `iteration` int(11) DEFAULT NULL,
  `total_area` double DEFAULT NULL,
  `object_type` varchar(45) DEFAULT NULL,
  `owning_date` date DEFAULT NULL,
  `ua_post_code` int(11) DEFAULT NULL,
  `other_object_type` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `realuty`
--

LOCK TABLES `realuty` WRITE;
/*!40000 ALTER TABLE `realuty` DISABLE KEYS */;
/*!40000 ALTER TABLE `realuty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rights`
--

DROP TABLE IF EXISTS `rights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rights` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `person_id` int(11) NOT NULL,
  `citizen` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `house_num` varchar(45) DEFAULT NULL,
  `number_apartments` int(11) DEFAULT NULL,
  `ua_last_name` varchar(45) DEFAULT NULL,
  `ua_first_name` varchar(45) DEFAULT NULL,
  `ua_middle_name` varchar(45) DEFAULT NULL,
  `ua_full_name` varchar(45) DEFAULT NULL,
  `eng_last_name` varchar(45) DEFAULT NULL,
  `eng_middle_name` varchar(45) DEFAULT NULL,
  `eng_first_name` varchar(45) DEFAULT NULL,
  `eng_full_name` varchar(45) DEFAULT NULL,
  `ownership_type` varchar(45) DEFAULT NULL,
  `other_ownership` varchar(45) DEFAULT NULL,
  `ua_company_name` varchar(45) DEFAULT NULL,
  `eng_company_name` varchar(45) DEFAULT NULL,
  `percent_ownership` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rights`
--

LOCK TABLES `rights` WRITE;
/*!40000 ALTER TABLE `rights` DISABLE KEYS */;
/*!40000 ALTER TABLE `rights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shares`
--

DROP TABLE IF EXISTS `shares`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shares` (
  `id` int(11) NOT NULL,
  `cost` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `person_id` int(11) DEFAULT NULL,
  `rights_id` int(11) DEFAULT NULL,
  `emitent` varchar(45) DEFAULT NULL,
  `iteration` int(11) DEFAULT NULL,
  `owning_date` date DEFAULT NULL,
  `emitent_type` varchar(45) DEFAULT NULL,
  `type_property` varchar(45) DEFAULT NULL,
  `emitent_ua_company_name` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `country` int(11) DEFAULT NULL,
  `en_name` varchar(45) DEFAULT NULL,
  `legal_form` varchar(45) DEFAULT NULL,
  `cost_percent` double DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `cost_date_origin` int(11) DEFAULT NULL,
  `description_object` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shares`
--

LOCK TABLES `shares` WRITE;
/*!40000 ALTER TABLE `shares` DISABLE KEYS */;
/*!40000 ALTER TABLE `shares` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_info`
--

DROP TABLE IF EXISTS `subject_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` int(11) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `middle_name` varchar(45) DEFAULT NULL,
  `post_type` varchar(45) DEFAULT NULL,
  `work_post` varchar(45) DEFAULT NULL,
  `work_place` varchar(45) DEFAULT NULL,
  `post_category` varchar(45) DEFAULT NULL,
  `actual_street` varchar(45) DEFAULT NULL,
  `street_type` varchar(45) DEFAULT NULL,
  `changed_name` tinyint(1) DEFAULT NULL,
  `country_path` varchar(45) DEFAULT NULL,
  `actual_country` int(11) DEFAULT NULL,
  `actual_region` varchar(45) DEFAULT NULL,
  `actual_city` varchar(45) DEFAULT NULL,
  `actual_district` varchar(45) DEFAULT NULL,
  `corruption_affected` varchar(45) DEFAULT NULL,
  `responsible_position` varchar(45) DEFAULT NULL,
  `previous_last_name` varchar(45) DEFAULT NULL,
  `previous_first_name` varchar(45) DEFAULT NULL,
  `previous_middle_name` varchar(45) DEFAULT NULL,
  `citizenship` int(11) DEFAULT NULL,
  `subject_relation` varchar(45) DEFAULT NULL,
  `eng_post_code` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_info`
--

LOCK TABLES `subject_info` WRITE;
/*!40000 ALTER TABLE `subject_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `declaration_type` int(11) DEFAULT NULL,
  `declaration_year` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vechicles`
--

DROP TABLE IF EXISTS `vechicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vechicles` (
  `id` int(11) NOT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `person_id` int(11) DEFAULT NULL,
  `rights_id` int(11) DEFAULT NULL,
  `cost_date` int(11) DEFAULT NULL,
  `iteration` int(11) DEFAULT NULL,
  `object_type` varchar(45) DEFAULT NULL,
  `owning_date` date DEFAULT NULL,
  `graduation_year` date DEFAULT NULL,
  `other_object_type` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vechicles`
--

LOCK TABLES `vechicles` WRITE;
/*!40000 ALTER TABLE `vechicles` DISABLE KEYS */;
/*!40000 ALTER TABLE `vechicles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-07 13:01:02


--
-- Table structure for table `stagingDeclaration`
--

DROP TABLE IF EXISTS `stagingDeclaration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stagingDeclaration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `declaration_id` varchar(255) NOT NULL,
  `first_name` varchar(255) CHARACTER SET utf8 DEFAULT '-',
  `last_name` varchar(255) CHARACTER SET utf8 DEFAULT '-',
  `work_place` varchar(255) CHARACTER SET utf8 DEFAULT '-',
  `position` varchar(255) CHARACTER SET utf8 DEFAULT '-',
  `pdf_link` varchar(255) DEFAULT '-',
  `status` varchar(255) DEFAULT '-',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `declaration_id_UNIQUE` (`declaration_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stagingDeclaration`
--

LOCK TABLES `stagingDeclaration` WRITE;
/*!40000 ALTER TABLE `stagingDeclaration` DISABLE KEYS */;
/*!40000 ALTER TABLE `stagingDeclaration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
