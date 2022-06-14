-- Fill data account
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('haritan', 'hari@gmail.com', 'hari123', 'Pelanggan');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('bagas', 'bagas@gmail.com', 'bagas456', 'Administrator');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('bima', 'bima@gmail.com', 'bima789', 'Administrator');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('bobi', 'bobi@gmail.com', 'bobi123', 'Administrator');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('yuni', 'yuni@gmail.com', 'yuni456', 'Pelanggan');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('anugrah', 'anugrah@gmail.com', 'anugrah789', 'Partner');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('berkah', 'berkah@gmail.com', 'berkah123', 'Partner');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('yohanes', 'yohanes@gmail.com', 'yohanes456', 'Pelanggan');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('makmur', 'makmur@gmail.com', 'makmur789', 'Partner');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('matius', 'matius@gmail.com', 'matius123', 'Pelanggan');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('kurniawan', 'kurniawan@gmail.com', 'kurniawan123', 'Pelanggan');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('sukses', 'sukses@gmail.com', 'sukses456', 'Partner');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('mojoagung', 'mojoagung@gmail.com', 'mojoagung789', 'Partner');
INSERT INTO `ezbookingrestaurant`.`account` (`username`, `email`, `password`, `role`) VALUES ('mororoad', 'mororoad@gmail.com', 'mororoad123', 'Partner');

-- Fill data restaurant
INSERT INTO `ezbookingrestaurant`.`restaurant` (`ownerName`, `nama`, `alamat`, `max_table`, `account_username`) VALUES ('Agus Ndurin', 'Berkah', 'Jl. Panglima Utara 30', '10', 'berkah');
INSERT INTO `ezbookingrestaurant`.`restaurant` (`ownerName`, `nama`, `alamat`, `max_table`, `account_username`) VALUES ('Suniman', 'Makmur', 'Jl. Ayaman dalam 10A', '35', 'makmur');
INSERT INTO `ezbookingrestaurant`.`restaurant` (`ownerName`, `nama`, `alamat`, `max_table`, `account_username`) VALUES ('Angkasa Sapur', 'Anugrah', 'Jl. Kalibaratan 25K', '25', 'anugrah');
INSERT INTO `ezbookingrestaurant`.`restaurant` (`ownerName`, `nama`, `alamat`, `max_table`, `account_username`) VALUES ('Tukinem', 'Sukses', 'Jl. Lingkarselatan Buntu 20', '100', 'sukses');
INSERT INTO `ezbookingrestaurant`.`restaurant` (`ownerName`, `nama`, `alamat`, `max_table`, `account_username`) VALUES ('Abraham', 'Mojo Agung', 'Jl. Mars sidomun IV/50', '60', 'mojoagung');
INSERT INTO `ezbookingrestaurant`.`restaurant` (`ownerName`, `nama`, `alamat`, `max_table`, `account_username`) VALUES ('Bejo Jahi', 'Moro Road', 'Jl. Besuka Bahari 25', '40', 'mororoad');

-- Fill data reservasi
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '2', '13', 'On Process', '1', 'bagas');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '2', '10', 'On Process', '2', 'yuni');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-15', '1', '3', 'On Process', '3', 'kurniawan');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-15', '1', '7', 'On Process', '1', 'matius');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-15', '1', '5', 'On Process', '2', 'haritan');

INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '3', '23', 'Confirm', '5', 'bagas');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '10', '100', 'Confirm', '5', 'yuni');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-15', '2', '10', 'Success', '5', 'kurniawan');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-15', '2', '16', 'Success', '4', 'matius');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-15', '1', '8', 'On Process', '4', 'haritan');

INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '1', '13', 'On Process', '5', 'bagas');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '1', '10', 'On Process', '5', 'yuni');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '1', '3', 'On Process', '5', 'kurniawan');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '1', '7', 'On Process', '4', 'matius');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-14', '1', '5', 'On Process', '2', 'haritan');

INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-16', '1', '5', 'Confirm', '5', 'bagas');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-16', '10', '10', 'Confirm', '5', 'yuni');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-16', '1', '10', 'Success', '5', 'kurniawan');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-16', '2', '12', 'Success', '4', 'matius');
INSERT INTO `ezbookingrestaurant`.`reservasi` (`tanggalPesanan`, `jumlahMeja`, `jumlahOrang`, `status`, `restaurant_id`, `account_username`) VALUES ('2022-06-16', '1', '2', 'On Process', '4', 'haritan');

-- trigger
delimiter $
create trigger trUpdateRating after update on reservasi
for each row begin
update restaurant set overall_rating = ((overall_rating+ new.penilaian)/2)
where id = old.restaurant_id;
end $
delimiter ;

delimiter $
create trigger trTotalPelanggan after update on reservasi
for each row begin
update restaurant set total_pelanggaan = (total_pelanggaan + new.jumlahOrang)
where id = old.restaurant_id and new.statuss = 'Success';
end $
delimiter ;


