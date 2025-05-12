-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 12, 2025 alle 19:49
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

--
-- Dump dei dati per la tabella `autista`
--

INSERT INTO `autista` (`idAutista`, `nome`, `cognome`) VALUES
(1, 'alessandro', 'ronconi'),
(2, 'Giulia', 'Azzurri'),
(3, 'Mario', 'Rossi'),
(4, 'Giovanni', 'Bianchi'),
(5, 'Anna', 'Verdi'),
(6, 'Luca', 'Neri'),
(7, 'Marco', 'Gialli'),
(8, 'Francesca', 'Grigi'),
(9, 'Roberto', 'Blu'),
(10, 'Sara', 'Verdi');

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
(3, 1, 5000, 'IKEA'),
(4, 2, 7000, 'Esselunga'),
(10, 8, 4000, 'Mediaworld'),
(11, 9, 11000, 'JohnDeere'),
(12, 10, 3000, 'FarmaciaCentrale');

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
('AB123CD'),
('CD234EF'),
('EF456GH'),
('GH567IJ'),
('IJ789KL'),
('KL890MN'),
('MN012OP'),
('QR345ST'),
('UV678WX'),
('YZ901AB');

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
(8, 'Discovery'),
(4, 'Explorer'),
(6, 'Horizon'),
(7, 'Majestic'),
(3, 'Oceania'),
(5, 'Poseidon'),
(2, 'QueenMary'),
(10, 'SeaBreeze'),
(1, 'Titanic'),
(9, 'Voyager');

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
(1, 1, 1, 5, 'Container', 10000, 'Maersk', 3, 75.50),
(2, 2, 2, 6, 'Auto', 15000, 'Fiat', 5, 65.00),
(8, 8, 8, 12, 'Elettronica', 8000, 'Samsung', 2, 70.00),
(9, 9, 9, 13, 'MezziAgricoli', 18000, 'NewHolland', 5, 85.00),
(10, 10, 10, 14, 'Farmaci', 4000, 'Pfizer', 2, 95.00);

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
(1, 'Porto A', 'Italia', 'Linea A'),
(2, 'Porto B', 'Spagna', 'Linea B'),
(3, 'Porto C', 'Francia', 'Linea C'),
(5, 'Porto D', 'Germania', 'Linea D'),
(6, 'Porto E', 'Portogallo', 'Linea E'),
(7, 'Porto F', 'Olanda', 'Linea F'),
(8, 'Porto G', 'Belgio', 'Linea G'),
(9, 'Porto H', 'USA', 'Linea H'),
(10, 'Porto I', 'Giappone', 'Linea I'),
(11, 'Porto J', 'Australia', 'Linea J'),
(12, 'Porto K', 'Brasile', 'Linea K'),
(13, 'Porto L', 'Argentina', 'Linea L'),
(14, 'Porto M', 'Canada', 'Linea M'),
(15, 'Porto N', 'Cina', 'Linea N'),
(16, 'Porto O', 'India', 'Linea O');

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
-- Dump dei dati per la tabella `viaggio`
--

INSERT INTO `viaggio` (`idViaggio`, `idNave`, `data_partenza`, `idPortoPartenza`, `idPortoArrivo`, `dataAllibramento`) VALUES
(1, 1, '2025-05-15', 1, 2, '2025-05-20'),
(2, 2, '2025-05-16', 2, 3, '2025-05-21'),
(8, 5, '2025-05-19', 5, 6, '2025-05-24'),
(9, 6, '2025-05-20', 6, 7, '2025-05-25'),
(10, 7, '2025-05-21', 7, 8, '2025-05-26'),
(11, 8, '2025-05-22', 8, 9, '2025-05-27'),
(12, 9, '2025-05-23', 9, 10, '2025-05-28'),
(13, 10, '2025-05-24', 10, 1, '2025-05-29');

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
  MODIFY `idAutista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT per la tabella `buonoconsegna`
--
ALTER TABLE `buonoconsegna`
  MODIFY `idBuono` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT per la tabella `nave`
--
ALTER TABLE `nave`
  MODIFY `idNave` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `polizza`
--
ALTER TABLE `polizza`
  MODIFY `idPolizza` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `porto`
--
ALTER TABLE `porto`
  MODIFY `idPorto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT per la tabella `ritiro`
--
ALTER TABLE `ritiro`
  MODIFY `idRitiro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `viaggio`
--
ALTER TABLE `viaggio`
  MODIFY `idViaggio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

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
