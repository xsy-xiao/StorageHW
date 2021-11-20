package com.byted.camp.todolist.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.byted.camp.todolist.convert.Converters;
import com.byted.camp.todolist.entity.Note;
import com.byted.camp.todolist.model.Priority;
import com.byted.camp.todolist.model.State;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNote;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfNote;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Note`(`id`,`date`,`state`,`content`,`priority`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getId());
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.fromState(value.getState());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        final String _tmp_2;
        _tmp_2 = __converters.fromPriority(value.getPriority());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
      }
    };
    this.__deletionAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Note` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Note` SET `id` = ?,`date` = ?,`state` = ?,`content` = ?,`priority` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getId());
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.fromState(value.getState());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        final String _tmp_2;
        _tmp_2 = __converters.fromPriority(value.getPriority());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public long insert(Note note) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfNote.insertAndReturnId(note);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Note note) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfNote.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Note note) {
    __db.beginTransaction();
    try {
      __updateAdapterOfNote.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Note> getAll() {
    final String _sql = "select * from note order by state desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
      final int _cursorIndexOfState = _cursor.getColumnIndexOrThrow("state");
      final int _cursorIndexOfContent = _cursor.getColumnIndexOrThrow("content");
      final int _cursorIndexOfPriority = _cursor.getColumnIndexOrThrow("priority");
      final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Note _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Date _tmpDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfDate);
        }
        _tmpDate = __converters.fromTimestamp(_tmp);
        final State _tmpState;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfState);
        _tmpState = __converters.toState(_tmp_1);
        final String _tmpContent;
        _tmpContent = _cursor.getString(_cursorIndexOfContent);
        final Priority _tmpPriority;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfPriority);
        _tmpPriority = __converters.toPriority(_tmp_2);
        _item = new Note(_tmpId,_tmpDate,_tmpState,_tmpContent,_tmpPriority);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
