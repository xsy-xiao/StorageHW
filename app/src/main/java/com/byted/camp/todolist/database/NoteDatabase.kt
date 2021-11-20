//package com.byted.camp.todolist.database
//
//import android.arch.persistence.room.Database
//import android.arch.persistence.room.Room
//import android.arch.persistence.room.RoomDatabase
//import android.arch.persistence.room.TypeConverters
//import android.content.Context
//import com.byted.camp.todolist.convert.Converters
//import com.byted.camp.todolist.dao.NoteDao
//import com.byted.camp.todolist.entity.Note
//
//
//@Database(entities = [(Note::class)], version = 1)
//@TypeConverters(Converters::class)
//abstract class NoteDatabase(var context: Context): RoomDatabase() {
//    abstract fun noteDao(): NoteDao
//
//
//    companion object {
//        private var instance: NoteDatabase? = null
//           fun getInstance(context: Context?): NoteDatabase {
//                if (instance == null) {
//                    instance = Room.databaseBuilder(
//                        context!!,
//                        NoteDatabase::class.java,
//                        "note"
//                    ).build()
//                }
//                return instance!!
//            }
//        fun get(context: Context?): NoteDatabase {
//            return getInstance(context)
//        }
//    }
//
//}