-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 15, 2025 alle 17:06
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `progettopozzi`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dump dei dati per la tabella `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `email`) VALUES
(1, 'admin1', '25e4ee4e9229397b6b17776bfceaf8e7', 'admin1@example.com'),
(2, 'admin2', '25e4ee4e9229397b6b17776bfceaf8e7', 'admin2@example.com'),
(4, 'rondo', '1fc68c24f09c6987dfc697bdd4918c13', 'admin1@example.com');

-- --------------------------------------------------------

--
-- Struttura della tabella `autista`
--

CREATE TABLE `autista` (
  `idAutista` int(11) NOT NULL,
  `nome` varchar(64) DEFAULT NULL,
  `cognome` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `autista`
--

INSERT INTO `autista` (`idAutista`, `nome`, `cognome`) VALUES
(1, 'Autista1', 'Cognome1'),
(2, 'Autista2', 'Cognome2'),
(3, 'Autista3', 'Cognome3'),
(4, 'Autista4', 'Cognome4'),
(5, 'Autista5', 'Cognome5'),
(6, 'Autista6', 'Cognome6'),
(7, 'Autista7', 'Cognome7'),
(8, 'Autista8', 'Cognome8'),
(9, 'Autista9', 'Cognome9'),
(10, 'Autista10', 'Cognome10');

-- --------------------------------------------------------

--
-- Struttura della tabella `buonoconsegna`
--

CREATE TABLE `buonoconsegna` (
  `idBuono` int(11) NOT NULL,
  `idPolizza` int(11) NOT NULL,
  `peso_kg` int(11) NOT NULL,
  `cliente` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `buonoconsegna`
--

INSERT INTO `buonoconsegna` (`idBuono`, `idPolizza`, `peso_kg`, `cliente`) VALUES
(1, 1, 100, '1'),
(2, 2, 200, '2'),
(3, 3, 300, '3'),
(4, 4, 400, '4');

-- --------------------------------------------------------

--
-- Struttura della tabella `camion`
--

CREATE TABLE `camion` (
  `targa` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `camion`
--

INSERT INTO `camion` (`targa`) VALUES
('TARGA001'),
('TARGA002'),
('TARGA003'),
('TARGA004'),
('TARGA005'),
('TARGA006'),
('TARGA007'),
('TARGA008'),
('TARGA009'),
('TARGA010');

-- --------------------------------------------------------

--
-- Struttura della tabella `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dump dei dati per la tabella `cliente`
--

INSERT INTO `cliente` (`id`, `username`, `password`, `nome`, `cognome`) VALUES
(1, 'cliente1', '8e1be2d5700ed83423c3ce6532c277a2', 'Nome1', 'Cognome1'),
(2, 'cliente2', '8e1be2d5700ed83423c3ce6532c277a2', 'Nome2', 'Cognome2'),
(3, 'cliente3', '8e1be2d5700ed83423c3ce6532c277a2', 'Nome3', 'Cognome3'),
(4, 'cliente4', '8e1be2d5700ed83423c3ce6532c277a2', 'Nome4', 'Cognome4'),
(5, 'cliente5', '8e1be2d5700ed83423c3ce6532c277a2', 'Nome5', 'Cognome5'),
(6, 'rondo', '765e8619e9a4789bd5272f37bd82437e', 'ale', 'ronco');

-- --------------------------------------------------------

--
-- Struttura della tabella `nave`
--

CREATE TABLE `nave` (
  `idNave` int(11) NOT NULL,
  `nome` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `nave`
--

INSERT INTO `nave` (`idNave`, `nome`) VALUES
(1, 'Nave1'),
(10, 'Nave10'),
(2, 'Nave2'),
(3, 'Nave3'),
(4, 'Nave4'),
(5, 'Nave5'),
(6, 'Nave6'),
(7, 'Nave7'),
(8, 'Nave8'),
(9, 'Nave9');

-- --------------------------------------------------------

--
-- Struttura della tabella `polizza`
--

CREATE TABLE `polizza` (
  `idPolizza` int(11) NOT NULL,
  `idViaggio` int(11) NOT NULL,
  `idPortoCarico` int(11) NOT NULL,
  `idPortoDestinazione` int(11) NOT NULL,
  `tipologia_merce` varchar(64) DEFAULT NULL,
  `peso_kg` int(11) NOT NULL,
  `fornitore` varchar(64) DEFAULT NULL,
  `giorniFranchigia` int(11) DEFAULT NULL,
  `tariffaGiornaliera` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `polizza`
--

INSERT INTO `polizza` (`idPolizza`, `idViaggio`, `idPortoCarico`, `idPortoDestinazione`, `tipologia_merce`, `peso_kg`, `fornitore`, `giorniFranchigia`, `tariffaGiornaliera`) VALUES
(1, 1, 1, 10, 'Merce1', 100, 'Fornitore1', 2, 11.50),
(2, 2, 2, 9, 'Merce2', 200, 'Fornitore2', 3, 12.50),
(3, 3, 3, 8, 'Merce3', 300, 'Fornitore3', 4, 13.50),
(4, 4, 4, 7, 'Merce4', 400, 'Fornitore4', 5, 14.50);

-- --------------------------------------------------------

--
-- Struttura della tabella `porto`
--

CREATE TABLE `porto` (
  `idPorto` int(11) NOT NULL,
  `nome` varchar(64) NOT NULL,
  `nazionalita` varchar(64) NOT NULL,
  `linea` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `porto`
--

INSERT INTO `porto` (`idPorto`, `nome`, `nazionalita`, `linea`) VALUES
(1, 'Porto1', 'Nazionalita1', 'linea1'),
(2, 'Porto2', 'Nazionalita2', 'linea2'),
(3, 'Porto3', 'Nazionalita3', 'linea3'),
(4, 'Porto4', 'Nazionalita4', 'linea4'),
(5, 'Porto5', 'Nazionalita5', 'linea5'),
(6, 'Porto6', 'Nazionalita6', 'linea6'),
(7, 'Porto7', 'Nazionalita7', 'linea7'),
(8, 'Porto8', 'Nazionalita8', 'linea8'),
(9, 'Porto9', 'Nazionalita9', 'linea9'),
(10, 'Porto10', 'Nazionalita10', 'linea10');

-- --------------------------------------------------------

--
-- Struttura della tabella `ritiro`
--

CREATE TABLE `ritiro` (
  `idRitiro` int(11) NOT NULL,
  `idBuono` int(11) NOT NULL,
  `targaCamion` varchar(20) NOT NULL,
  `idAutista` int(11) NOT NULL,
  `data_ritiro` date NOT NULL,
  `peso_ritirato` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `ritiro`
--

INSERT INTO `ritiro` (`idRitiro`, `idBuono`, `targaCamion`, `idAutista`, `data_ritiro`, `peso_ritirato`) VALUES
(1, 1, 'TARGA001', 1, '2025-05-11', 90),
(2, 2, 'TARGA002', 2, '2025-05-12', 180),
(3, 3, 'TARGA003', 3, '2025-05-13', 270),
(4, 4, 'TARGA004', 4, '2025-05-14', 360);

-- --------------------------------------------------------

--
-- Struttura della tabella `viaggio`
--

CREATE TABLE `viaggio` (
  `idViaggio` int(11) NOT NULL,
  `idNave` int(11) NOT NULL,
  `data_partenza` date NOT NULL,
  `idPortoPartenza` int(11) NOT NULL,
  `idPortoArrivo` int(11) NOT NULL,
  `dataAllibramento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `viaggio`
--

INSERT INTO `viaggio` (`idViaggio`, `idNave`, `data_partenza`, `idPortoPartenza`, `idPortoArrivo`, `dataAllibramento`) VALUES
(1, 1, '2025-04-02', 1, 10, '2025-05-02'),
(2, 2, '2025-04-02', 2, 9, '2025-05-03'),
(3, 3, '2025-04-02', 3, 8, '2025-05-04'),
(4, 4, '2025-04-02', 4, 7, '2025-05-05');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indici per le tabelle `autista`
--
ALTER TABLE `autista`
  ADD PRIMARY KEY (`idAutista`);

--
-- Indici per le tabelle `buonoconsegna`
--
ALTER TABLE `buonoconsegna`
  ADD PRIMARY KEY (`idBuono`),
  ADD KEY `idPolizza` (`idPolizza`),
  ADD KEY `cliente` (`cliente`);

--
-- Indici per le tabelle `camion`
--
ALTER TABLE `camion`
  ADD PRIMARY KEY (`targa`);

--
-- Indici per le tabelle `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indici per le tabelle `nave`
--
ALTER TABLE `nave`
  ADD PRIMARY KEY (`idNave`),
  ADD UNIQUE KEY `nome` (`nome`);

--
-- Indici per le tabelle `polizza`
--
ALTER TABLE `polizza`
  ADD PRIMARY KEY (`idPolizza`),
  ADD KEY `idViaggio` (`idViaggio`),
  ADD KEY `idPortoCarico` (`idPortoCarico`),
  ADD KEY `idPortoDestinazione` (`idPortoDestinazione`);

--
-- Indici per le tabelle `porto`
--
ALTER TABLE `porto`
  ADD PRIMARY KEY (`idPorto`);

--
-- Indici per le tabelle `ritiro`
--
ALTER TABLE `ritiro`
  ADD PRIMARY KEY (`idRitiro`),
  ADD KEY `idBuono` (`idBuono`),
  ADD KEY `targaCamion` (`targaCamion`),
  ADD KEY `idAutista` (`idAutista`);

--
-- Indici per le tabelle `viaggio`
--
ALTER TABLE `viaggio`
  ADD PRIMARY KEY (`idViaggio`),
  ADD KEY `idNave` (`idNave`),
  ADD KEY `idPortoPartenza` (`idPortoPartenza`),
  ADD KEY `idPortoArrivo` (`idPortoArrivo`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT per la tabella `autista`
--
ALTER TABLE `autista`
  MODIFY `idAutista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `buonoconsegna`
--
ALTER TABLE `buonoconsegna`
  MODIFY `idBuono` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT per la tabella `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT per la tabella `nave`
--
ALTER TABLE `nave`
  MODIFY `idNave` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `polizza`
--
ALTER TABLE `polizza`
  MODIFY `idPolizza` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT per la tabella `porto`
--
ALTER TABLE `porto`
  MODIFY `idPorto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `ritiro`
--
ALTER TABLE `ritiro`
  MODIFY `idRitiro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT per la tabella `viaggio`
--
ALTER TABLE `viaggio`
  MODIFY `idViaggio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `buonoconsegna`
--
ALTER TABLE `buonoconsegna`
  ADD CONSTRAINT `buonoconsegna_ibfk_1` FOREIGN KEY (`idPolizza`) REFERENCES `polizza` (`idPolizza`);

--
-- Limiti per la tabella `polizza`
--
ALTER TABLE `polizza`
  ADD CONSTRAINT `polizza_ibfk_1` FOREIGN KEY (`idViaggio`) REFERENCES `viaggio` (`idViaggio`),
  ADD CONSTRAINT `polizza_ibfk_2` FOREIGN KEY (`idPortoCarico`) REFERENCES `porto` (`idPorto`),
  ADD CONSTRAINT `polizza_ibfk_3` FOREIGN KEY (`idPortoDestinazione`) REFERENCES `porto` (`idPorto`);

--
-- Limiti per la tabella `ritiro`
--
ALTER TABLE `ritiro`
  ADD CONSTRAINT `ritiro_ibfk_1` FOREIGN KEY (`idBuono`) REFERENCES `buonoconsegna` (`idBuono`),
  ADD CONSTRAINT `ritiro_ibfk_2` FOREIGN KEY (`targaCamion`) REFERENCES `camion` (`targa`),
  ADD CONSTRAINT `ritiro_ibfk_3` FOREIGN KEY (`idAutista`) REFERENCES `autista` (`idAutista`);

--
-- Limiti per la tabella `viaggio`
--
ALTER TABLE `viaggio`
  ADD CONSTRAINT `viaggio_ibfk_1` FOREIGN KEY (`idNave`) REFERENCES `nave` (`idNave`),
  ADD CONSTRAINT `viaggio_ibfk_2` FOREIGN KEY (`idPortoPartenza`) REFERENCES `porto` (`idPorto`),
  ADD CONSTRAINT `viaggio_ibfk_3` FOREIGN KEY (`idPortoArrivo`) REFERENCES `porto` (`idPorto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
