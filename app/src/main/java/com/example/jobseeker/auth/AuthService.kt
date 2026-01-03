package com.example.jobseeker.auth

import com.example.jobseeker.model.Lmodel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface AuthService {

    fun authser(lmodel: Lmodel): Task<AuthResult>

}