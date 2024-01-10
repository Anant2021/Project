-- MySQL dump 10.13  Distrib 5.1.35, for Win32 (ia32)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.1.35-community

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
-- Table structure for table `adm_login`
--

DROP TABLE IF EXISTS `adm_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adm_login` (
  `adm_name` varchar(20) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adm_login`
--

LOCK TABLES `adm_login` WRITE;
/*!40000 ALTER TABLE `adm_login` DISABLE KEYS */;
INSERT INTO `adm_login` VALUES ('Anant','anant 2002');
/*!40000 ALTER TABLE `adm_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `audi_cars`
--

DROP TABLE IF EXISTS `audi_cars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `audi_cars` (
  `Model_Name` varchar(20) DEFAULT NULL,
  `MILEAGE` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_EX_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audi_cars`
--

LOCK TABLES `audi_cars` WRITE;
/*!40000 ALTER TABLE `audi_cars` DISABLE KEYS */;
INSERT INTO `audi_cars` VALUES ('Audi A3 ','20.30','1968 cc','Automatic','33.1 Lakhs Onwards'),('Audi_Q3','16.28 ','1968 cc','Automatic','34.73 Lakhs Onwards'),('Audi Q7','14.75','2967 cc','Automatic','84.35 Lakhs Onwards '),('Audi R8','6.71','5204 cc','manual','3.1 Crores Onwards '),(' Audi A3 Cabriolet','19.2','1395 cc','Automatic','57.47 lakhs Onwards');
/*!40000 ALTER TABLE `audi_cars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bmw`
--

DROP TABLE IF EXISTS `bmw`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bmw` (
  `Model_Name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_Ex_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bmw`
--

LOCK TABLES `bmw` WRITE;
/*!40000 ALTER TABLE `bmw` DISABLE KEYS */;
INSERT INTO `bmw` VALUES ('BMW 3 Series','20.65','1998 cc','AUTOMATIC','46.64 LAKHS ONWARDS'),('BMW X1','20.68','1998 cc','AUTOMATIC','46.31 LAKHS ONWARDS'),('BMW X5','13.38','2993 cc','AUTOMATIC','84.96 LAKHS ONWARDS'),('BMW 5 Series','21.65','2993 cc','AUTOMATIC','46.64 LAKHS ONWARDS'),('BMW 7 Series','12.99','2998 cc','AUTOMATIC','1.43 crores ONWARDS'),('BMW z4','14.05','2998 cc','AUTOMATIC','74.24 lakhs ONWARDS'),('BMW i8','47.45','1499 cc','AUTOMATIC','2.98 crores ONWARDS');
/*!40000 ALTER TABLE `bmw` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cadillac`
--

DROP TABLE IF EXISTS `cadillac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cadillac` (
  `Model_name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_ex_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadillac`
--

LOCK TABLES `cadillac` WRITE;
/*!40000 ALTER TABLE `cadillac` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadillac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chevrolet`
--

DROP TABLE IF EXISTS `chevrolet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chevrolet` (
  `Model_Name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_Ex_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chevrolet`
--

LOCK TABLES `chevrolet` WRITE;
/*!40000 ALTER TABLE `chevrolet` DISABLE KEYS */;
INSERT INTO `chevrolet` VALUES ('Chevrolet Beat','24.44','1199 cc','manual','3.94 lakh onwards '),('Chevrolet Captiva','14.6','2231 cc','manual','25.14 lakh onwards '),('Chevrolet Corvette','10.5','6161 cc','automatic','50 lakh onwards '),('Chevrolet traiblazer','11.45','2776 cc','automatic','26.99 onwards ');
/*!40000 ALTER TABLE `chevrolet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chrysler`
--

DROP TABLE IF EXISTS `chrysler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chrysler` (
  `Model_name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_ex_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chrysler`
--

LOCK TABLES `chrysler` WRITE;
/*!40000 ALTER TABLE `chrysler` DISABLE KEYS */;
/*!40000 ALTER TABLE `chrysler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ford`
--

DROP TABLE IF EXISTS `ford`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ford` (
  `Model_name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_ex_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ford`
--

LOCK TABLES `ford` WRITE;
/*!40000 ALTER TABLE `ford` DISABLE KEYS */;
/*!40000 ALTER TABLE `ford` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lamborghini`
--

DROP TABLE IF EXISTS `lamborghini`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lamborghini` (
  `Model_name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_EX_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lamborghini`
--

LOCK TABLES `lamborghini` WRITE;
/*!40000 ALTER TABLE `lamborghini` DISABLE KEYS */;
INSERT INTO `lamborghini` VALUES ('Lamborghini Urus','8.0','3996 cc','Automatic','3.0 Cr* onwards '),('Lamborghini Aventador','7.69','6498 cc','Automatic','5.01 Cr* onwards '),('Lamborghini Huracan','11.24','5204 cc','Automatic','2.99 Cr* onwards '),('Lamborghini Huracan EVO','7.19','5204 cc','Automatic','3.73 Cr* onwards ');
/*!40000 ALTER TABLE `lamborghini` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mercedese`
--

DROP TABLE IF EXISTS `mercedese`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mercedese` (
  `Model_Name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_Ex_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mercedese`
--

LOCK TABLES `mercedese` WRITE;
/*!40000 ALTER TABLE `mercedese` DISABLE KEYS */;
INSERT INTO `mercedese` VALUES ('Mercedes-benz','17.9','2143 cc','Automatic','31.72 lakhs onwards'),('Mercedes-benz A-class','20.0','2143 cc','Automatic','29.72 lakhs onwards'),('Mercedes-benz CLS','23.40','1950 cc','Automatic','84.7 lakhs onwards'),('Mercedes-benz AMG GT','12.65','3982 cc','Automatic','2.16 Cr onwards'),('Mercedes-benz S-class','13.5','5980 cc','Automatic','1.36 Cr onwards'),('Mercedes-benz G-class','8.13','3998 cc','Automatic','2.19 Cr onwards');
/*!40000 ALTER TABLE `mercedese` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `porsche`
--

DROP TABLE IF EXISTS `porsche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `porsche` (
  `Model_name` varchar(30) DEFAULT NULL,
  `Mileage` varchar(30) DEFAULT NULL,
  `Engine` varchar(30) DEFAULT NULL,
  `Transmission` varchar(30) DEFAULT NULL,
  `Price_EX_showroom` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `porsche`
--

LOCK TABLES `porsche` WRITE;
/*!40000 ALTER TABLE `porsche` DISABLE KEYS */;
INSERT INTO `porsche` VALUES ('Porsche Cayenne','13.33','3996 cc','Automatic','1.19 Cr* onwards '),('Porsche Panamera','10.75','4806 cc','Automatic','1.89 Cr* onwards'),('Porsche 718','9.0','1988 cc','Automatic','85.05 lakhs onwards'),('Porsche 911','9.0','2981 cc','Manual','1.82 Cr* onwards');
/*!40000 ALTER TABLE `porsche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_centre_sign_in`
--

DROP TABLE IF EXISTS `service_centre_sign_in`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_centre_sign_in` (
  `NAME` varchar(30) DEFAULT NULL,
  `LAST_NAME` varchar(30) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `MOBILE` varchar(20) DEFAULT NULL,
  `USER_ID` varchar(30) NOT NULL,
  `PWD` varchar(30) DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `PWD` (`PWD`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_centre_sign_in`
--

LOCK TABLES `service_centre_sign_in` WRITE;
/*!40000 ALTER TABLE `service_centre_sign_in` DISABLE KEYS */;
INSERT INTO `service_centre_sign_in` VALUES ('anant','gautam','2002-11-04','7891203781','anantgautam.@gmail.com','anant 2002',17),('anant','gautam','2002-11-04','9414284954','gautam04@gmail.com','0anant',17);
/*!40000 ALTER TABLE `service_centre_sign_in` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sign_in`
--

DROP TABLE IF EXISTS `sign_in`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sign_in` (
  `NAME` varchar(20) DEFAULT NULL,
  `LAST_NAME` char(20) DEFAULT NULL,
  `MOBILE_NO` varchar(30) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `USER_NAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`USER_NAME`),
  UNIQUE KEY `PASSWORD` (`PASSWORD`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sign_in`
--

LOCK TABLES `sign_in` WRITE;
/*!40000 ALTER TABLE `sign_in` DISABLE KEYS */;
INSERT INTO `sign_in` VALUES ('anant','gautam','9414270245','2002-11-02','anantgautam@gmail.com','anant 2002');
/*!40000 ALTER TABLE `sign_in` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-03  0:43:13
