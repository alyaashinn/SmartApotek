package com.example.smart_apotek.admin.repository

import com.example.smart_apotek.admin.firebase.Collections
import com.example.smart_apotek.admin.firebase.FirebaseManager

class PesananRepository {

    private val db = FirebaseManager.firestore

    fun getSemuaPesanan() =
        db.collection(Collections.PESANAN)

    fun updateStatusPesanan(
        pesananId: String,
        status: String
    ) {
        db.collection(Collections.PESANAN)
            .document(pesananId)
            .update("status", status)
    }
}