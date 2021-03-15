package com.huasuiyue.webapp.model

import org.ktorm.database.Database
import org.ktorm.entity.Entity
import org.ktorm.entity.sequenceOf
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.long

interface HuaToolsModel : Entity<HuaToolsModel> {
    companion object : Entity.Factory<HuaToolsModel>()
    val id : Int
    var idNo : Long
}

object HuaToolsModels : Table<HuaToolsModel>("tools"){
    val id = int("id").primaryKey().bindTo { it.id }
    val idNo = long("id_no").bindTo { it.idNo }
}

val Database.toolsCreate get() = this.sequenceOf(HuaToolsModels)