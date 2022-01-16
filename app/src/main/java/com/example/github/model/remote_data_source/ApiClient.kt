package com.example.github.model.remote_data_source

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    /**
     * GitHub Userを取得する
     * Kotlin Coroutinesを使って非同期処理を行うため suspendをつけている
     */
    @GET("users/{username}")
    suspend fun getGitHubUser(@Path("username") userName: String): Response<GitHubUser>
}