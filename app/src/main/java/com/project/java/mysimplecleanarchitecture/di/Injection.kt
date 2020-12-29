package com.project.java.mysimplecleanarchitecture.di

import com.project.java.mysimplecleanarchitecture.data.IMessageDataSource
import com.project.java.mysimplecleanarchitecture.data.MessageDataSource
import com.project.java.mysimplecleanarchitecture.data.MessageRepository
import com.project.java.mysimplecleanarchitecture.domain.IMessageRepository
import com.project.java.mysimplecleanarchitecture.domain.MessageInteractor
import com.project.java.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}