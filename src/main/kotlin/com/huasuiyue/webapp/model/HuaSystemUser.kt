package com.huasuiyue.webapp.model

import org.ktorm.database.Database
import org.ktorm.entity.Entity
import org.ktorm.entity.sequenceOf
import org.ktorm.schema.*
import java.sql.Date
import java.time.LocalDate
import java.time.LocalDateTime

interface HuaSystemUser : Entity<HuaSystemUser> {
    companion object : Entity.Factory<HuaSystemUser>()
    var id: Long
    var account: String
    var password: String
    var mail: String
    var phone: String
    var type: String
//    var createDate: Date
//    var updateDate: Date
    var delete: String
}

object HuaSystemUsers : Table<HuaSystemUser>("sys_user"){
    val id = long("id").primaryKey().bindTo { it.id }
    val account = varchar("account").bindTo { it.account }
    val password = varchar("password").bindTo { it.password }
    val mail = varchar("mail").bindTo { it.mail }
    val phone = varchar("phone").bindTo { it.phone }
    val type = varchar("type").bindTo { it.type }
//    val createDate = jdbcDate("createDate").bindTo { it.createDate }
//    val updateDate = jdbcDate("updateDate").bindTo { it.updateDate }
    val delete = varchar("delete").bindTo { it.delete }
}

val Database.sysUsers get() = this.sequenceOf(HuaSystemUsers)