package com.huasuiyue.webapp.controller

import com.huasuiyue.webapp.service.impl.HuaSystemUserImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/sys/user")
class HuaSystemUser {
    @Autowired
    lateinit var huaSystemUserImpl: HuaSystemUserImpl

    @GetMapping("/login")
    fun login(
        @RequestParam params: Map<String , Any>
    ) : Map<String, Any> {
        return huaSystemUserImpl.findUserByAccount(params)
    }
}