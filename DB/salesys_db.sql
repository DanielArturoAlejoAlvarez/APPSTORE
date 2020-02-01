-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 01, 2020 at 12:28 PM
-- Server version: 5.7.28-0ubuntu0.16.04.2
-- PHP Version: 7.0.33-0ubuntu0.16.04.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `salesys_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `CLIE_Code` int(11) NOT NULL,
  `CLIE_Dni` varchar(10) NOT NULL,
  `CLIE_Fullname` varchar(100) NOT NULL,
  `CLIE_Address` text NOT NULL,
  `CLIE_Flag` tinyint(1) NOT NULL,
  `CLIE_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`CLIE_Code`, `CLIE_Dni`, `CLIE_Fullname`, `CLIE_Address`, `CLIE_Flag`, `CLIE_Date`) VALUES
(1, '97826152', 'Mark Zuckerberg', 'Palo Alto 550, California', 1, '2020-01-28 18:20:09'),
(2, '98563214', 'Elon Musk', 'Central Park 850, New York', 1, '2020-01-28 18:21:39'),
(3, '95846712', 'Jeff Bezos', 'Oak Park 650, Chicago', 1, '2020-01-28 18:24:21'),
(4, '99945612', 'Mark Cuban', 'El Paso 845, Texas', 1, '2020-01-28 22:42:14'),
(5, '99988877', 'Tim Cook', 'Brooklin 455, New York', 1, '2020-01-28 22:56:21');

-- --------------------------------------------------------

--
-- Table structure for table `detail_sales`
--

CREATE TABLE `detail_sales` (
  `DETA_Code` int(11) NOT NULL,
  `PROD_Code` int(11) NOT NULL,
  `SALE_Code` int(11) NOT NULL,
  `DETA_Qty` int(11) NOT NULL,
  `DETA_Subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_sales`
--

INSERT INTO `detail_sales` (`DETA_Code`, `PROD_Code`, `SALE_Code`, `DETA_Qty`, `DETA_Subtotal`) VALUES
(5, 1, 3, 2, 1475),
(6, 2, 3, 3, 585);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `PROD_Code` int(11) NOT NULL,
  `PROD_Serial` varchar(10) NOT NULL,
  `PROD_Name` varchar(128) NOT NULL,
  `PROD_Price` float NOT NULL,
  `PROD_Stock` int(11) NOT NULL,
  `PROD_Picture` varchar(512) NOT NULL,
  `PROD_Flag` tinyint(1) NOT NULL,
  `PROD_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`PROD_Code`, `PROD_Serial`, `PROD_Name`, `PROD_Price`, `PROD_Stock`, `PROD_Picture`, `PROD_Flag`, `PROD_Date`) VALUES
(1, 'C-123', 'iMac Pro', 1475.25, 498, 'https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/imac-21-cto-hero-201903?wid=627&hei=522&fmt=jpeg&qlt=95&.v=1553120926388', 1, '2020-01-31 00:40:23'),
(2, 'T-456', 'iPad Air', 585.45, 997, 'https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/ipad-pro-12-11-select-201810?wid=435&amp;hei=550&amp;fmt=jpeg&amp;qlt=95&amp;op_usm=0.5,0.5&amp;.v=1576263936101', 1, '2020-01-31 00:40:23'),
(3, 'S-789', 'iPhone X', 395, 5000, 'https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone8-select-2019-family?wid=882&amp;hei=1058&amp;fmt=jpeg&amp;qlt=80&amp;op_usm=0.5,0.5&amp;.v=1550795431127', 1, '2020-01-29 20:18:59');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `SALE_Code` int(11) NOT NULL,
  `CLIE_Code` int(11) NOT NULL,
  `USER_Code` int(11) NOT NULL,
  `SALE_Serial` varchar(25) NOT NULL,
  `SALE_Date` varchar(128) NOT NULL,
  `SALE_Total` float NOT NULL,
  `SALE_Flag` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`SALE_Code`, `CLIE_Code`, `USER_Code`, `SALE_Serial`, `SALE_Date`, `SALE_Total`, `SALE_Flag`) VALUES
(3, 1, 1, '0000001', '2020-0-30', 4706.85, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `USER_Code` int(11) NOT NULL,
  `USER_Fullname` varchar(100) NOT NULL,
  `USER_Email` varchar(128) NOT NULL,
  `USER_Username` varchar(128) NOT NULL,
  `USER_Password` varchar(256) NOT NULL,
  `USER_Phone` varchar(25) NOT NULL,
  `USER_Avatar` varchar(512) NOT NULL,
  `USER_Flag` tinyint(1) NOT NULL,
  `USER_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`USER_Code`, `USER_Fullname`, `USER_Email`, `USER_Username`, `USER_Password`, `USER_Phone`, `USER_Avatar`, `USER_Flag`, `USER_Date`) VALUES
(1, 'Admin', 'admin@gmail.com', 'admin', '7c4a8d09ca3762af61e59520943dc26494f8941b', '999-777-888', 'https://icons-for-free.com/iconfiles/png/512/business+costume+male+man+office+user+icon-1320196264882354682.png', 1, '2020-02-01 17:26:05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`CLIE_Code`),
  ADD UNIQUE KEY `CLIE_Dni` (`CLIE_Dni`);

--
-- Indexes for table `detail_sales`
--
ALTER TABLE `detail_sales`
  ADD PRIMARY KEY (`DETA_Code`),
  ADD KEY `PROD_Code` (`PROD_Code`,`SALE_Code`),
  ADD KEY `fk_sale_detail` (`SALE_Code`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`PROD_Code`),
  ADD UNIQUE KEY `PROD_Serial` (`PROD_Serial`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`SALE_Code`),
  ADD UNIQUE KEY `SALE_Serial` (`SALE_Serial`),
  ADD KEY `CLIE_Code` (`CLIE_Code`,`USER_Code`),
  ADD KEY `fk_user_sale` (`USER_Code`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`USER_Code`),
  ADD UNIQUE KEY `USER_Email` (`USER_Email`,`USER_Username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `CLIE_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `detail_sales`
--
ALTER TABLE `detail_sales`
  MODIFY `DETA_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `PROD_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `SALE_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `USER_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_sales`
--
ALTER TABLE `detail_sales`
  ADD CONSTRAINT `fk_product_detail` FOREIGN KEY (`PROD_Code`) REFERENCES `products` (`PROD_Code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_sale_detail` FOREIGN KEY (`SALE_Code`) REFERENCES `sales` (`SALE_Code`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `fk_client_sale` FOREIGN KEY (`CLIE_Code`) REFERENCES `clients` (`CLIE_Code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_user_sale` FOREIGN KEY (`USER_Code`) REFERENCES `users` (`USER_Code`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
