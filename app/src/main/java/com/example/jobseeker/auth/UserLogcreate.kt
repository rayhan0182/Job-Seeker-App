package com.example.jobseeker.auth

import com.example.jobseeker.model.Lmodel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class UserLogcreate() : AuthService {

    override fun authser(lmodel: Lmodel): Task<AuthResult> {

        val authenticate = FirebaseAuth.getInstance()

        return authenticate.signInWithEmailAndPassword(lmodel.email, lmodel.pass)

    }


}