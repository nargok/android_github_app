package com.example.github.model.remote_data_source

interface RemoteDataSource {
    /**
     * サーバーからのレスポンスを[GitHubUser]として返す
     */
    suspend fun getGitHubUser(userName: String): GitHubUser
}