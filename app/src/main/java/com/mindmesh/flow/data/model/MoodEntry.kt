package com.mindmesh.flow.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mood_entries")
data class MoodEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val moodEmoji: String,
    val note: String,
    val moodScore: Int, // e.g., 1–5 scale
    val timestamp: Long = System.currentTimeMillis()
)
