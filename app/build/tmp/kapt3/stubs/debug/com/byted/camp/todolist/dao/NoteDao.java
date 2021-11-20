package com.byted.camp.todolist.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/byted/camp/todolist/dao/NoteDao;", "", "delete", "", "note", "Lcom/byted/camp/todolist/entity/Note;", "getAll", "", "insert", "", "update", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "select * from note order by state desc")
    public abstract java.util.List<com.byted.camp.todolist.entity.Note> getAll();
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.entity.Note note);
    
    @android.arch.persistence.room.Insert()
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.entity.Note note);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.entity.Note note);
}