package com.example.cinesmart.data

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.firestoreSettings
import com.google.firebase.ktx.Firebase


class FireBaseImplementation(){
    val firestore = Firebase.firestore
    fun FirebaseInitialization(){
        firestore.useEmulator("10.0.2.2", 8080)

        firestore.firestoreSettings = firestoreSettings {
            isPersistenceEnabled = false
        }

    }

}


