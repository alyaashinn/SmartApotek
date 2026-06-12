package com.example.smart_apotek.admin.repository

import com.example.smart_apotek.admin.firebase.Collections
import com.example.smart_apotek.admin.firebase.FirebaseManager
import com.example.smart_apotek.admin.model.Obat

class ObatRepository {

    private val db = FirebaseManager.firestore

    fun tambahObat(obat: Obat) {
        db.collection(Collections.OBAT)
            .add(obat)
    }

    fun hapusObat(id: String) {
        db.collection(Collections.OBAT)
            .document(id)
            .delete()
    }

    fun updateObat(id: String, data: Map<String, Any>) {
        db.collection(Collections.OBAT)
            .document(id)
            .update(data)
    }

    fun getSemuaObat() =
        db.collection(Collections.OBAT)
}