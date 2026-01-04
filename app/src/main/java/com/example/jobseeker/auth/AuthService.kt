package com.example.jobseeker.auth

import com.example.jobseeker.model.Lmodel
import com.example.jobseeker.model.Rmodel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface AuthService {

    fun regis_create(rmodel: Rmodel): Task<AuthResult>

}