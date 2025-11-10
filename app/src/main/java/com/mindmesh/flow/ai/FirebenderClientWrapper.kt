package com.mindmesh.flow.ai

import android.content.Context
import kotlinx.coroutines.delay

class FirebenderClientWrapper(private val context: Context) {

    // TODO: Replace this with real Firebender API when available
    suspend fun analyzeMoodSummary(summaryJson: String): String {
        delay(500) // simulate network delay
        return "Insight: your stress levels are highest mid-week. Try scheduling rest breaks."
    }
}
