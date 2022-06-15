-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Jun 2022 pada 06.22
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ezbookingrestaurant`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `account`
--

CREATE TABLE `account` (
  `username` varchar(45) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `account`
--

INSERT INTO `account` (`username`, `email`, `password`, `role`) VALUES
('anugrah', 'anugrah@gmail.com', 'anugrah789', 'Partner Restaurant'),
('bagas', 'bagas@gmail.com', 'bagas456', 'Administrator'),
('berkah', 'berkah@gmail.com', 'berkah123', 'Partner Restaurant'),
('bima', 'bima@gmail.com', 'bima789', 'Administrator'),
('bobi', 'bobi@gmail.com', 'bobi123', 'Administrator'),
('haritan', 'hari@gmail.com', 'hari123', 'Pelanggan'),
('kurniawan', 'kurniawan@gmail.com', 'kurniawan123', 'Pelanggan'),
('makmur', 'makmur@gmail.com', 'makmur789', 'Partner Restaurant'),
('matius', 'matius@gmail.com', 'matius123', 'Pelanggan'),
('mojoagung', 'mojoagung@gmail.com', 'mojoagung789', 'Partner Restaurant'),
('mororoad', 'mororoad@gmail.com', 'mororoad123', 'Partner Restaurant'),
('sukses', 'sukses@gmail.com', 'sukses456', 'Partner Restaurant'),
('yohanes', 'yohanes@gmail.com', 'yohanes456', 'Pelanggan'),
('yuni', 'yuni@gmail.com', 'yuni456', 'Pelanggan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `report`
--

CREATE TABLE `report` (
  `account_username` varchar(45) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `Quality of service` decimal(3,2) NOT NULL,
  `Food quality` decimal(3,2) NOT NULL,
  `Review` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `reservasi`
--

CREATE TABLE `reservasi` (
  `id` int(11) NOT NULL,
  `tanggalPesanan` date NOT NULL,
  `jumlahMeja` int(11) NOT NULL,
  `jumlahOrang` int(11) NOT NULL,
  `status` varchar(45) NOT NULL,
  `penilaian` decimal(3,2) DEFAULT 0.00,
  `restaurant_id` int(11) NOT NULL,
  `account_username` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `reservasi`
--

INSERT INTO `reservasi` (`id`, `tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `penilaian`, `restaurant_id`, `account_username`) VALUES
(1, '2022-06-14', 2, 13, 'On Process', '0.00', 1, 'bagas'),
(2, '2022-06-14', 2, 10, 'Arrived', '0.00', 2, 'yuni'),
(3, '2022-06-15', 1, 3, 'On Process', '0.00', 3, 'kurniawan'),
(4, '2022-06-15', 1, 7, 'Arrived', '0.00', 1, 'matius'),
(5, '2022-06-15', 1, 5, 'On Process', '0.00', 2, 'haritan'),
(6, '2022-06-14', 3, 23, 'Confirmed', '0.00', 5, 'bagas'),
(7, '2022-06-14', 10, 100, 'Confirmed', '0.00', 5, 'yuni'),
(8, '2022-06-15', 2, 10, 'Canceled', '0.00', 5, 'kurniawan'),
(9, '2022-06-15', 2, 16, 'Finished', '0.00', 4, 'matius'),
(10, '2022-06-15', 1, 8, 'Arrived', '0.00', 4, 'haritan'),
(11, '2022-06-14', 1, 13, 'On Process', '0.00', 5, 'bagas'),
(12, '2022-06-14', 1, 10, 'On Process', '0.00', 5, 'yuni'),
(13, '2022-06-14', 1, 3, 'Arrived', '0.00', 5, 'kurniawan'),
(14, '2022-06-14', 1, 7, 'On Process', '0.00', 4, 'matius'),
(15, '2022-06-14', 1, 5, 'Canceled', '0.00', 2, 'haritan'),
(16, '2022-06-16', 1, 5, 'Confirmed', '0.00', 5, 'bagas'),
(17, '2022-06-16', 10, 10, 'Confirmed', '0.00', 5, 'yuni'),
(18, '2022-06-16', 1, 10, 'Finished', '0.00', 5, 'kurniawan'),
(19, '2022-06-16', 2, 12, 'Canceled', '0.00', 4, 'matius'),
(20, '2022-06-16', 1, 2, 'On Process', '0.00', 4, 'haritan');

--
-- Trigger `reservasi`
--
DELIMITER $$
CREATE TRIGGER `trTotalPelanggan` AFTER UPDATE ON `reservasi` FOR EACH ROW begin
update restaurant set total_pelanggaan = (total_pelanggaan + new.jumlahOrang)
where id = old.restaurant_id and (new.status = 'Finished' or new.status = 'Confirmed');
end
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `trUpdateRating` AFTER UPDATE ON `reservasi` FOR EACH ROW begin
update restaurant set overall_rating = ((overall_rating + new.penilaian)/2)
where id = old.restaurant_id;
end
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `restaurant`
--

CREATE TABLE `restaurant` (
  `id` int(11) NOT NULL,
  `ownerName` varchar(45) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `alamat` varchar(45) NOT NULL,
  `max_table` int(11) NOT NULL DEFAULT 0,
  `total_pelanggaan` int(11) NOT NULL DEFAULT 0,
  `account_username` varchar(45) NOT NULL,
  `overall_rating` decimal(3,2) NOT NULL DEFAULT 5.00
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `restaurant`
--

INSERT INTO `restaurant` (`id`, `ownerName`, `nama`, `alamat`, `max_table`, `total_pelanggaan`, `account_username`, `overall_rating`) VALUES
(1, 'Agus Ndurin', 'Berkah', 'Jl. Panglima Utara 30', 10, 0, 'berkah', '5.00'),
(2, 'Suniman', 'Makmur', 'Jl. Ayaman dalam 10A', 35, 0, 'makmur', '5.00'),
(3, 'Angkasa Sapur', 'Anugrah', 'Jl. Kalibaratan 25K', 25, 0, 'anugrah', '5.00'),
(4, 'Tukinem', 'Sukses', 'Jl. Lingkarselatan Buntu 20', 100, 0, 'sukses', '5.00'),
(5, 'Abraham', 'Mojo Agung', 'Jl. Mars sidomun IV/50', 60, 0, 'mojoagung', '5.00'),
(6, 'Bejo Jahi', 'Moro Road', 'Jl. Besuka Bahari 25', 40, 0, 'mororoad', '5.00');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`account_username`,`restaurant_id`),
  ADD KEY `fk_account_has_restaurant_restaurant1_idx` (`restaurant_id`),
  ADD KEY `fk_account_has_restaurant_account1_idx` (`account_username`);

--
-- Indeks untuk tabel `reservasi`
--
ALTER TABLE `reservasi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_reservasi_restaurant_idx` (`restaurant_id`),
  ADD KEY `fk_reservasi_account1_idx` (`account_username`);

--
-- Indeks untuk tabel `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_restaurant_account1_idx` (`account_username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `reservasi`
--
ALTER TABLE `reservasi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT untuk tabel `restaurant`
--
ALTER TABLE `restaurant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `fk_account_has_restaurant_account1` FOREIGN KEY (`account_username`) REFERENCES `account` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_account_has_restaurant_restaurant1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ketidakleluasaan untuk tabel `reservasi`
--
ALTER TABLE `reservasi`
  ADD CONSTRAINT `fk_reservasi_account1` FOREIGN KEY (`account_username`) REFERENCES `account` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_reservasi_restaurant` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ketidakleluasaan untuk tabel `restaurant`
--
ALTER TABLE `restaurant`
  ADD CONSTRAINT `fk_restaurant_account1` FOREIGN KEY (`account_username`) REFERENCES `account` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
