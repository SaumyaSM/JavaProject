-- MySQL dump 10.13  Distrib 8.0.34, for macos13 (x86_64)
--
-- Host: localhost    Database: db_green_supermarket
-- ------------------------------------------------------
-- Server version	8.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int NOT NULL,
  `uname` varchar(225) NOT NULL,
  `uphone` varchar(20) NOT NULL,
  `pid` int NOT NULL,
  `product_name` varchar(225) NOT NULL,
  `qty` varchar(45) NOT NULL,
  `price` double NOT NULL,
  `total` double DEFAULT NULL,
  `p_date` varchar(225) NOT NULL,
  `uaddress` varchar(225) NOT NULL,
  `receive_date` varchar(45) DEFAULT NULL,
  `supplier` varchar(45) DEFAULT NULL,
  `status` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES (2,1,'saumya','0703942558',1,'phone','1',300,300,'20231225','Homagama,Sri Lanka','2023-12-12','cat','Pending'),(3,1,'saumya','0703942558',1,'phone','2',300,600,'20231225','Homagama,Sri Lanka',NULL,NULL,'Pending'),(4,1,'saumya','0703942558',1,'phone','4',300,1200,'20231225','Homagama,Sri Lanka',NULL,NULL,'Pending'),(5,1,'saumya','0703942558',2,'banana','12',200,2400,'20231225','Homagama,Sri Lanka',NULL,NULL,'Pending'),(6,1,'saumya','0703942558',1,'Banana','10',300,3000,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(7,1,'saumya','0703942558',3,'Orange','12',345,4140,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(8,1,'saumya','0703942558',2,'Mango','2',500,1000,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(9,1,'saumya','0703942558',2,'Mango','2',500,1000,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(10,1,'saumya','0703942558',2,'Mango','1',500,500,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(11,1,'saumya','0703942558',1,'Banana','2',300,600,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(12,1,'saumya','0703942558',1,'Banana','1',300,300,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(13,1,'saumya','0703942558',2,'Mango','1',500,500,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(14,1,'saumya','0703942558',2,'Mango','1',500,500,'20231228','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(15,1,'saumya','0703942558',3,'Orange','2',345,690,'20231229','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(16,1,'saumya','0703942558',2,'Mango','2',500,1000,'2023-12-29','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(17,1,'saumya','0703942558',3,'Orange','2',345,690,'2023-12-29','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(18,1,'saumya','0703942558',2,'Mango','5',500,2500,'2023-12-29','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(19,1,'saumya','0703942558',4,'Watermelon','1',700,700,'2023-12-29','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(20,1,'saumya','0703942558',2,'Mango','1',500,500,'2023-12-29','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(21,1,'saumya','0703942558',2,'Mango','5',500,2500,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(22,1,'saumya','0703942558',4,'Watermelon','1',700,700,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(23,1,'saumya','0703942558',3,'Orange','1',345,345,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka',NULL,NULL,'Pending'),(24,1,'saumya','0703942558',1,'Banana','2',300,600,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka','2023-12-31','suppthree','Received'),(25,1,'saumya','0703942558',1,'Banana','1',300,300,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka','2023-12-31','suppthree','Received'),(26,1,'saumya','0703942558',4,'Watermelon','1',700,700,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka',NULL,'suppthree','On the way'),(27,1,'saumya','0703942558',5,'Fresh MIlk','1',1200,1200,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka','2023-12-31','suppthree','Received'),(28,1,'saumya','0703942558',3,'Orange','1',345,345,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka','2023-12-31','Supplierone','Received'),(29,1,'saumya','0703942558',5,'Fresh MIlk','1',1200,1200,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka',NULL,'Anu','On the way'),(31,1,'saumya','0703942558',4,'Watermelon','1',700,700,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka','2023-12-31','Anu','Received'),(32,1,'saumya','0703942558',5,'Fresh MIlk','1',1200,1200,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka',NULL,'Anu','On the way'),(33,1,'saumya','0703942558',2,'Mango','1',500,500,'2023-12-30','Homagama,Uduwana,Temple road,Sri Lanka','2023-12-31','Anu','Received'),(34,1,'saumya','0703942558',3,'Orange','2',345,690,'2023-12-31','Homagama,Uduwana,Temple road,Sri Lanka','2023-12-31','Supplierone','Received'),(35,2,'usertwo','0741234567',3,'Orange','2',345,690,'2023-12-31','Colombo,Sri Lanka',NULL,'Supplierone','On the way'),(36,2,'usertwo','0741234567',1,'Banana','2',300,600,'2023-12-31','Colombo,Sri Lanka','2023-12-31','Supplierone','Received');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-31  5:17:30
