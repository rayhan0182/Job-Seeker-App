package com.example.jobseeker.auth

import com.example.jobseeker.model.Rmodel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class Repositoryuser: AuthService {

    override fun regis_create(rmodel: Rmodel): Task<AuthResult> {

        val jauth = FirebaseAuth.getInstance()

       return jauth.createUserWithEmailAndPassword(rmodel.email,rmodel.password)

    }
}