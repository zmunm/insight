package io.github.zmunm.insight.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.github.zmunm.insight.local.dao.GameDao
import io.github.zmunm.insight.local.table.GameTable

@Database(entities = [GameTable::class], version = 1, exportSchema = false)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun gameDao(): GameDao

    companion object {

        private const val DATABASE_NAME = "DATABASE"

        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .addCallback(
                    object : RoomDatabase.Callback() {
                    }
                )
                .build()
        }
    }
}
