package com.huasuiyue.webapp.service.impl

import com.huasuiyue.webapp.model.sysUsers
import com.huasuiyue.webapp.service.HuaSystemUserDao
import org.ktorm.database.Database
import org.ktorm.dsl.and
import org.ktorm.dsl.eq
import org.ktorm.entity.find
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HuaSystemUserImpl : HuaSystemUserDao{
    @Autowired
    lateinit var database: Database

    override fun addUser(): String {
        TODO("Not yet implemented")
    }

    override fun findUserByAccount(params: Map<String, Any>): Map<String, Any> {
        val account = params.getValue("account").toString()
        val password = params.getValue("password").toString()

        val queryResult = database.sysUsers
            .find { it.account eq account }
        println(queryResult)
        println(params)
        return if (queryResult == null) {
             mapOf("code" to 200, "type" to "error", "message" to "账户不存在！")
        } else if (queryResult.account == account && queryResult.password == password) {
            mapOf("code" to 200, "type" to "success", "message" to "登录成功！" )
        } else {
            mapOf("code" to 200, "type" to "error", "message" to "用户名与账户不匹配！请检查后重新提交！")
        }
    }

    override fun deleteUserByAccount(): String {
        TODO("Not yet implemented")
    }

}