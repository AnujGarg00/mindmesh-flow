package com.mindmesh.flow.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mindmesh.flow.data.model.MoodEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface MindMeshDao {

    @Insert
    suspend fun insert(entry: MoodEntry)

    @Query("SELECT * FROM mood_entries ORDER BY timestamp DESC")
    fun getAll(): Flow<List<MoodEntry>>

    @Query("SELECT * FROM mood_entries WHERE timestamp >= :since ORDER BY timestamp ASC")
    suspend fun getSince(since: Long): List<MoodEntry>
}