package com.example.github.model.repository

/**
 * [User]のRepository
 */
interface UserRepository {

    /**
     * [UserName]に該当する[User]を返す
     */
    suspend fun getUser(userName: String): User
}