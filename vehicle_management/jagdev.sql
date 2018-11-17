-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2018 at 10:07 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 5.6.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jagdev`
--

-- --------------------------------------------------------

--
-- Table structure for table `gaurd`
--

CREATE TABLE `gaurd` (
  `g_id` varchar(11) NOT NULL,
  `g_name` varchar(20) NOT NULL,
  `mob_no` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gaurd`
--

INSERT INTO `gaurd` (`g_id`, `g_name`, `mob_no`) VALUES
('10001', 'abc', '028345039');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `date` varchar(15) NOT NULL,
  `v_no` varchar(20) NOT NULL,
  `in_time` varchar(15) NOT NULL,
  `out_time` varchar(15) DEFAULT NULL,
  `ingaurd_id` varchar(20) NOT NULL,
  `outgaurd_id` varchar(20) DEFAULT NULL,
  `purpose` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`date`, `v_no`, `in_time`, `out_time`, `ingaurd_id`, `outgaurd_id`, `purpose`) VALUES
('2018-11-08', 'MP 16 9026', '18:53:41', '13:44:56', '10001', '10001', 'meeting'),
('2018-11-08', 'UP 95 9046', '22:28:44', '22:29:31', '10001', '10001', 'fchgfjhgf'),
('2018-11-08', 'MP 16 9779', '23:04:11', NULL, '10001', NULL, 'visiting inside collage');

-- --------------------------------------------------------

--
-- Table structure for table `login_table`
--

CREATE TABLE `login_table` (
  `user_id` int(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_table`
--

INSERT INTO `login_table` (`user_id`, `password`) VALUES
(1001, 'Nitt@1001'),
(1002, 'Nitt@1002');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle_info`
--

CREATE TABLE `vehicle_info` (
  `v_no` varchar(15) NOT NULL,
  `v_name` varchar(30) NOT NULL,
  `v_type` varchar(20) NOT NULL,
  `v_colour` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle_info`
--

INSERT INTO `vehicle_info` (`v_no`, `v_name`, `v_type`, `v_colour`) VALUES
('MP 16 9026', 'Passion_Pro', 'Two_Wheeler', 'java.awt.Color[r=0,g=0,b=102]'),
('MP 16 9779', 'P zero', 'Four_Wheeler', 'java.awt.Color[r=51,g=0,b=204]'),
('UP 95 9046', 'Passion_Pro', 'Two_Wheeler', 'java.awt.Color[r=0,g=51,b=102]');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle_name`
--

CREATE TABLE `vehicle_name` (
  `v_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle_name`
--

INSERT INTO `vehicle_name` (`v_name`) VALUES
('Passion_Pro'),
('Maruti'),
('TVS'),
('Bullet'),
('Van'),
('Pickup'),
('Shine'),
('P zero');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle_type`
--

CREATE TABLE `vehicle_type` (
  `v_type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle_type`
--

INSERT INTO `vehicle_type` (`v_type`) VALUES
('Two_Wheeler'),
('Four_Wheeler'),
('Six_Wheeler');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gaurd`
--
ALTER TABLE `gaurd`
  ADD UNIQUE KEY `g_id` (`g_id`);

--
-- Indexes for table `vehicle_info`
--
ALTER TABLE `vehicle_info`
  ADD PRIMARY KEY (`v_no`) USING BTREE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
