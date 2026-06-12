package com.example.smart_apotek.admin.model

data class Pembayaran(
    var id: String = "",
    var pesananId: String = "",
    var buktiPembayaran: String = "",
    var status: String = ""
)