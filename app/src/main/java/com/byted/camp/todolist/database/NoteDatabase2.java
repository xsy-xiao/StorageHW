package com.byted.camp.todolist.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.byted.camp.todolist.convert.Converters;
import com.byted.camp.todolist.dao.NoteDao;
import com.byted.camp.todolist.entity.Note;
@TypeConverters(Converters.class)
@Database(entities = {Note.class}, version = 1)
public abstract class NoteDatabase2 extends RoomDatabase {

    private static NoteDatabase2 INSTANCE;

    public abstract NoteDao noteDao();

    public static NoteDatabase2 getNoteDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context,
                            NoteDatabase2.class,
                            "note").allowMainThreadQueries().build();

            //Room.inMemoryDatabaseBuilder(context.getApplicationContext(),AppDatabase.class).allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
