-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Jun 2022 pada 11.11
-- Versi server: 10.4.20-MariaDB
-- Versi PHP: 8.0.9

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
('anton', 'anton092@gmail.com', 'anton984', 'Pelanggan'),
('anugrah', 'anugrah@gmail.com', 'anugrah789', 'Partner Restaurant'),
('avan', 'avanlove@gmail.com', 'avanGanteng123', 'Administrator'),
('bagas', 'bagas@gmail.com', 'bagas456', 'Administrator'),
('bagus', 'luxxy@gmail.com', 'luxxygaming893', 'Administrator'),
('berkah', 'berkah@gmail.com', 'berkah123', 'Partner Restaurant'),
('bima', 'bima@gmail.com', 'bima789', 'Administrator'),
('bobi', 'bobi@gmail.com', 'bobi123', 'Administrator'),
('bryan', 'bryanH@gmail.com', 'bryanm123', 'Pelanggan'),
('haritan', 'hari@gmail.com', 'hari123', 'Pelanggan'),
('ivan', 'ivangemoi@gmail.com', 'kepolu123', 'Administrator'),
('johncena', 'youcanseeme@gmail.com', 'wwe4ever', 'Pelanggan'),
('johndoe', 'johndoe@gmail.com', 'jPasswordField1', 'Pelanggan'),
('kevin', 'kevin@gmail.com', 'william231', 'Pelanggan'),
('kiki', 'kikih@gmail.com', 'kikaku332', 'Administrator'),
('kurniawan', 'kurniawan@gmail.com', 'kurniawan123', 'Pelanggan'),
('makmur', 'makmur@gmail.com', 'makmur789', 'Partner Restaurant'),
('matius', 'matius@gmail.com', 'matius123', 'Pelanggan'),
('mojoagung', 'mojoagung@gmail.com', 'mojoagung789', 'Partner Restaurant'),
('mororoad', 'mororoad@gmail.com', 'mororoad123', 'Partner Restaurant'),
('ruth', 'ruth@gmail.com', 'ruth123', 'Administrator'),
('sukses', 'sukses@gmail.com', 'sukses456', 'Partner Restaurant'),
('vivi', 'vivian@gmail.com', 'vivicantik12', 'Administrator'),
('william', 'william@gmail.com', 'kevin777', 'Pelanggan'),
('yohanes', 'yohanes@gmail.com', 'yohanes456', 'Pelanggan'),
('yuni', 'yuni@gmail.com', 'yuni456', 'Pelanggan'),
('zoro', 'roro@gmail.com', 'pelit1020', 'Administrator');

-- --------------------------------------------------------

--
-- Struktur dari tabel `report`
--

CREATE TABLE `report` (
  `account_username` varchar(45) NOT NULL,
  `restaurant_id` int(11) NOT NULL,
  `qualityOfService` decimal(3,2) NOT NULL,
  `foodQuality` decimal(3,2) NOT NULL,
  `Review` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `report`
--

INSERT INTO `report` (`account_username`, `restaurant_id`, `qualityOfService`, `foodQuality`, `Review`) VALUES
('avan', 5, '5.00', '4.00', 'pegawai cantik dan ramah bikin semangat kalo kesini, makanan enak'),
('bagas', 1, '5.00', '5.00', 'makanan enak, service bagus'),
('bagus', 2, '3.00', '4.00', 'pegawai cuek, makanan standart dengan harga yang lumayan'),
('bima', 3, '1.00', '2.00', 'pegawai tidak ramah! makanan juga tidak enak!'),
('bobi', 6, '4.00', '3.00', 'servis baik, makanan biasa aja'),
('ivan', 3, '3.00', '5.00', 'kasir tidak ramah, tapi untuk makanan nya enaki'),
('kiki', 1, '4.00', '5.00', 'makanan enak banget rekomen 10/10 pegawai juga ramah banget'),
('ruth', 5, '2.00', '1.00', 'pegawai cuek sekali, makanan yang disajikan tidak pantas dengan harga yang diberikan'),
('vivi', 4, '5.00', '5.00', 'pegawai sangat ramah, makanan enak poll'),
('zoro', 2, '4.00', '3.00', 'pegawai ramah tapi sayang rasa makanan standar saja dengan harga yang agak mahal');

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
(23, '2022-06-15', 3, 5, 'Confirmed', '0.00', 3, 'mojoagung'),
(24, '2022-06-15', 2, 4, 'Finish', '4.00', 2, 'johncena'),
(25, '2022-06-23', 5, 10, 'Confirmed', '0.00', 4, 'kurniawan'),
(26, '2022-06-23', 3, 6, 'Arrived', '0.00', 1, 'haritan'),
(30, '2022-06-14', 4, 5, 'Finish', '4.00', 3, 'matius'),
(33, '2022-06-30', 7, 15, 'On Process', '0.00', 6, 'yohanes'),
(34, '2022-06-08', 3, 4, 'Arrived', '0.00', 1, 'yuni'),
(35, '2022-06-25', 4, 7, 'On Process', '0.00', 5, 'anton'),
(36, '2022-06-25', 5, 8, 'Finish', '5.00', 2, 'bryan'),
(37, '2022-06-30', 2, 5, 'On Process', '0.00', 1, 'kevin'),
(38, '2022-06-30', 8, 21, 'Arrived', '0.00', 6, 'william'),
(39, '2022-06-30', 2, 5, 'On Process', '0.00', 2, 'johndoe'),
(40, '2022-06-30', 6, 9, 'Finish', '3.00', 5, 'anton'),
(41, '2022-06-30', 3, 7, 'On Process', '0.00', 4, 'bryan'),
(42, '2022-06-25', 2, 4, 'Arrived', '0.00', 3, 'kevin');

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
(1, 'Agus Nduri', 'ayam geprek preksu', 'Jl. Panglima Utara 30', 15, 4, 'berkah', '0.16'),
(2, 'Suniman', 'KATSUKU', 'Jl. Ayaman dalam 10A', 35, 14, 'makmur', '1.98'),
(3, 'Felix S', 'Kinton QQ', 'Jl. Tebat anjam 30B', 25, 12, 'anugrah', '1.32'),
(4, 'Tukinem', 'Bakso Jackpot 777', 'Jl. Lingkarselatan Buntu 20', 100, 43, 'sukses', '0.69'),
(5, 'Abraham', 'Bebek purnama sari', 'Jl. Mars sidomun IV/50', 60, 11, 'mojoagung', '1.82'),
(6, 'Bejo Jahi', 'Miro eatery', 'Jl. Besuka Bahari 25', 40, 16, 'mororoad', '0.16');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

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
