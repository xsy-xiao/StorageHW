package com.byted.camp.todolist.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.byted.camp.todolist.dao.NoteDao;
import com.byted.camp.todolist.dao.NoteDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;

public class NoteDatabase2_Impl extends NoteDatabase2 {
  private volatile NoteDao _noteDao;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Note` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` INTEGER NOT NULL, `state` TEXT NOT NULL, `content` TEXT NOT NULL, `priority` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"ed3c916fe1356201ed97f45ff7713be1\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Note`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNote = new HashMap<String, TableInfo.Column>(5);
        _columnsNote.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsNote.put("date", new TableInfo.Column("date", "INTEGER", true, 0));
        _columnsNote.put("state", new TableInfo.Column("state", "TEXT", true, 0));
        _columnsNote.put("content", new TableInfo.Column("content", "TEXT", true, 0));
        _columnsNote.put("priority", new TableInfo.Column("priority", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNote = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNote = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNote = new TableInfo("Note", _columnsNote, _foreignKeysNote, _indicesNote);
        final TableInfo _existingNote = TableInfo.read(_db, "Note");
        if (! _infoNote.equals(_existingNote)) {
          throw new IllegalStateException("Migration didn't properly handle Note(com.byted.camp.todolist.entity.Note).\n"
                  + " Expected:\n" + _infoNote + "\n"
                  + " Found:\n" + _existingNote);
        }
      }
    }, "ed3c916fe1356201ed97f45ff7713be1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Note");
  }

  @Override
  public NoteDao noteDao() {
    if (_noteDao != null) {
      return _noteDao;
    } else {
      synchronized(this) {
        if(_noteDao == null) {
          _noteDao = new NoteDao_Impl(this);
        }
        return _noteDao;
      }
    }
  }
}
