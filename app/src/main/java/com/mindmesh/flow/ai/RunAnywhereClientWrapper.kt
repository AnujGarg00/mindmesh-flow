package com.mindmesh.flow.ai

import android.content.Context
import kotlinx.coroutines.delay

class RunAnywhereClientWrapper(private val context: Context) {

    // TODO: Replace this mock with the actual SDK when available
    suspend fun generateReply(prompt: String): String {
        delay(300) // simulate AI thinking delay
        return "I hear you: $prompt. Try taking a short mindful break."
    }
}