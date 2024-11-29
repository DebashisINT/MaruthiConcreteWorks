package com.breezefieldmaruthiconcreteworks.features.chat.api


object ChatRepoProvider {
    fun provideChatRepository(): ChatRepo {
        return ChatRepo(ChatApi.create())
    }
}