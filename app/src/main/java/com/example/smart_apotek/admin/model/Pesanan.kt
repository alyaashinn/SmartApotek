package com.example.smart_apotek.admin.model

data class Pesanan(
    var id: String = "",
    var userId: String = "",
    var totalHarga: Double = 0.0,
    var status: String = "",
    var tanggal: String = ""
)