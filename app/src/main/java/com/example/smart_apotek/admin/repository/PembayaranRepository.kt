package com.example.smart_apotek.admin.repository

import com.example.smart_apotek.admin.firebase.Collections
import com.example.smart_apotek.admin.firebase.FirebaseManager

class PembayaranRepository {

    private val db = FirebaseManager.firestore

    fun getSemuaPembayaran() =
        db.collection(Collections.PEMBAYARAN)

    fun updateStatusPembayaran(
        pembayaranId: String,
        status: String
    ) {
        db.collection(Collections.PEMBAYARAN)
            .document(pembayaranId)
            .update("status", status)
    }
}