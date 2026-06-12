package com.example.smart_apotek.admin.model

data class Obat(
    var id: String = "",
    var namaObat: String = "",
    var harga: Int = 0,
    var stok: Int = 0,
    var kategori: String = "",
    var deskripsi: String = "",
    var gambar: String = ""
)