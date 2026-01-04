package com.example.jobseeker.viewmod
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.jobseeker.auth.Repositoryuser
import com.example.jobseeker.model.Lmodel
import com.example.jobseeker.model.Rmodel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

class Authviewmodel(): ViewModel() {

    fun  registrationcreate(rmodel: Rmodel){

        val repo = Repositoryuser()

        repo.regis_create(rmodel)

    }

}