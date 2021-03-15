package com.huasuiyue.webapp.service

interface HuaSystemUserDao {
    fun addUser(): String
    fun findUserByAccount(params: Map<String, Any>): Map<String, Any>
    fun deleteUserByAccount(): String
}