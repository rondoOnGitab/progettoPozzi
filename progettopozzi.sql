-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 05, 2025 alle 01:21
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
-- Struttura della tabella `autista`
--

CREATE TABLE `autista` (
  `idAutista` int(11) NOT NULL,
  `nome` varchar(64) DEFAULT NULL,
  `cognome` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

-- --------------------------------------------------------

--
-- Struttura della tabella `camion`
--

CREATE TABLE `camion` (
  `targa` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `nave`
--

CREATE TABLE `nave` (
  `idNave` int(11) NOT NULL,
  `nome` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
-- Indici per le tabelle scaricate
--

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
  ADD KEY `idPolizza` (`idPolizza`);

--
-- Indici per le tabelle `camion`
--
ALTER TABLE `camion`
  ADD PRIMARY KEY (`targa`);

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
-- AUTO_INCREMENT per la tabella `autista`
--
ALTER TABLE `autista`
  MODIFY `idAutista` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `buonoconsegna`
--
ALTER TABLE `buonoconsegna`
  MODIFY `idBuono` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `nave`
--
ALTER TABLE `nave`
  MODIFY `idNave` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `polizza`
--
ALTER TABLE `polizza`
  MODIFY `idPolizza` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `porto`
--
ALTER TABLE `porto`
  MODIFY `idPorto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `ritiro`
--
ALTER TABLE `ritiro`
  MODIFY `idRitiro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `viaggio`
--
ALTER TABLE `viaggio`
  MODIFY `idViaggio` int(11) NOT NULL AUTO_INCREMENT;

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
