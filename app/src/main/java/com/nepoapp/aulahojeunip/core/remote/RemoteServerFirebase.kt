package com.nepoapp.aulahojeunip.core.remote

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RemoteServerFirebase {

    val database = FirebaseDatabase.getInstance()
    val authenticator = FirebaseAuth.getInstance()

}