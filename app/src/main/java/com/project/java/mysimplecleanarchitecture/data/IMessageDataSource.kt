package com.project.java.mysimplecleanarchitecture.data

import com.project.java.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}