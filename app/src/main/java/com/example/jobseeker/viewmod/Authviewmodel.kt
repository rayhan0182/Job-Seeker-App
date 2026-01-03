package com.example.jobseeker.viewmod
import androidx.lifecycle.ViewModel
import com.example.jobseeker.auth.UserLogcreate
import com.example.jobseeker.model.Lmodel

class Authviewmodel(private val userLogcreate: UserLogcreate): ViewModel() {

    fun logincreate(lmodel: Lmodel){

        userLogcreate.authser(lmodel)
    }


}