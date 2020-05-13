-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2020 a las 00:42:02
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `rapidpago`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `department`
--

CREATE TABLE `department` (
  `id` bigint(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `department`
--

INSERT INTO `department` (`id`, `name`) VALUES
(1, 'Desarrollo'),
(2, 'Infraestructura'),
(3, 'Soporte y Monitoreo'),
(4, 'Base de datos'),
(5, 'Telecomunicaciones'),
(8, 'Contabilidad');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `employee`
--

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `identification_num` varchar(255) NOT NULL,
  `Department_id` bigint(20) NOT NULL,
  `Experience_id` bigint(20) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Admission_date` varchar(255) NOT NULL,
  `Available` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `employee`
--

INSERT INTO `employee` (`id`, `name`, `lastname`, `gender`, `identification_num`, `Department_id`, `Experience_id`, `Address`, `Admission_date`, `Available`) VALUES
(28, 'Ashley Andres', 'Alejo Guilarte', 'Masculino', '23796111', 1, 2, 'Caracas DC', '2019-05-13', 1),
(30, 'Carlos Enrique', 'Camacho Garcia', 'Masculino', '23796112', 3, 3, 'Los teques ', '13-05-2018', 1),
(31, 'Miguel Enrique', 'Camacho Garcia', 'Masculino', '23796113', 2, 1, 'Maracay ', '13-05-2017', 1),
(32, 'Maria Isabela', 'Gonzalez Garcia', 'Femenino', '23796114', 1, 5, 'Monagas ', '2020-05-28', 1),
(35, 'Maria Isabela', 'Gonzalez Garcia', 'Femenino', '23796115', 1, 5, 'Monagas ', '2020-05-20', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experience`
--

CREATE TABLE `experience` (
  `id` bigint(255) NOT NULL,
  `Description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experience`
--

INSERT INTO `experience` (`id`, `Description`) VALUES
(1, 'Poca'),
(2, 'Aceptable'),
(3, 'Suficiente'),
(4, 'Excelente'),
(5, 'Experto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE `person` (
  `id` bigint(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `identification_num` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `person`
--

INSERT INTO `person` (`id`, `name`, `lastname`, `gender`, `identification_num`) VALUES
(11, 'Andres', 'Alejo', 'Masculino', 23796111),
(12, 'Shelley ', 'Guilarte', 'Femenino', 9663302),
(13, 'Juenidtson ', 'Gonzalez', 'Masculino', 23796112),
(14, 'Diego', 'Alejo', 'Masculino', 237961132),
(19, 'Pablo', 'Escobar', 'Masculino', 9663302),
(20, 'adawdaw', '8', 'Masculino', 231231),
(21, 'adawdaw', '8', 'Masculino', 231231),
(22, 'adawdaw', '8', 'Masculino', 231231),
(23, 'adawdaw', '8', 'Masculino', 231231),
(24, 'adawdaw', '8', 'Masculino', 23232),
(25, 'adawdaw', '8', 'Masculino', 23213125),
(26, 'adawdaw', '8', 'Masculino', 231231),
(27, 'adawdaw', '8', 'Masculino', 231231),
(28, 'adawdaw', '8', 'Masculino', 231231),
(29, 'adawdawdawdaw', 'dawdawdawd', 'Masculino', 2323232),
(30, 'adawdaw', 'Andres', 'Masculino', 2222),
(31, 'adawdaw', '8', 'Masculino', 23232),
(32, 'adawdaw', '8', 'Masculino', 23232),
(33, 'adawdaw', '8', 'Femenino', 231231);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Department` (`Department_id`),
  ADD KEY `Experience` (`Experience_id`);

--
-- Indices de la tabla `experience`
--
ALTER TABLE `experience`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `department`
--
ALTER TABLE `department`
  MODIFY `id` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `employee`
--
ALTER TABLE `employee`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT de la tabla `experience`
--
ALTER TABLE `experience`
  MODIFY `id` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `person`
--
ALTER TABLE `person`
  MODIFY `id` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
