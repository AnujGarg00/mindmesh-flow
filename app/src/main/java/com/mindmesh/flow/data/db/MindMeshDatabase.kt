package com.mindmesh.flow.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mindmesh.flow.data.model.MoodEntry

@Database(entities = [MoodEntry::class], version = 1)
abstract class MindMeshDatabase : RoomDatabase() {

    abstract fun dao(): MindMeshDao

    companion object {
        @Volatile
        private var INSTANCE: MindMeshDatabase? = null

        fun get(context: Context): MindMeshDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MindMeshDatabase::class.java,
                    "mindmesh_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}