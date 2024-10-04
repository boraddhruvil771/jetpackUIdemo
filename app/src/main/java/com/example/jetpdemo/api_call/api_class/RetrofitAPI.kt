package com.example.jetpdemo.api_call.api_class

import com.example.jetpdemo.api_call.data_model.DataModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitAPI {
    @POST("users")
    fun postData(@Body dataModel: DataModel?): Call<DataModel?>?
}