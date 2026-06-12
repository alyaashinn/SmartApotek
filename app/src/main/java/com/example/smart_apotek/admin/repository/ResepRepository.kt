package com.example.smart_apotek.admin.repository

import com.example.smart_apotek.admin.firebase.Collections
import com.example.smart_apotek.admin.firebase.FirebaseManager

class ResepRepository {

    private val db = FirebaseManager.firestore

    fun getSemuaResep() =
        db.collection(Collections.RESEP)

    fun updateStatusResep(
        resepId: String,
        status: String
    ) {
        db.collection(Collections.RESEP)
            .document(resepId)
            .update("status", status)
    }
}