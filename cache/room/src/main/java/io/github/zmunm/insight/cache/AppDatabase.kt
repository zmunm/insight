package io.github.zmunm.insight.cache

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import io.github.zmunm.insight.cache.converter.DateRoomConverter
import io.github.zmunm.insight.cache.converter.StringListRoomConverter
import io.github.zmunm.insight.cache.dao.GameRoomDao
import io.github.zmunm.insight.cache.table.TableGame
import io.github.zmunm.insight.cache.table.TableLike

@Database(
    entities = [
        TableGame::class,
        TableLike::class,
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(
    DateRoomConverter::class,
    StringListRoomConverter::class,
)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun gameDao(): GameRoomDao

    companion object {

        private const val DATABASE_NAME = "DATABASE"

        @Volatile
        private var instance: AppDatabase? = null

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
