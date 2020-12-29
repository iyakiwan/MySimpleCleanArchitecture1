package com.project.java.mysimplecleanarchitecture.data

import com.project.java.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}