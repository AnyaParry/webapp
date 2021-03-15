package com.huasuiyue.webapp.tools

class IdCreator {
    companion object CreateId {
        fun createId(): Long{
            var time = System.currentTimeMillis()
            time *= 100
            var catchNumber = (0..10000).random()
            time += catchNumber
            return time
        }
    }
}