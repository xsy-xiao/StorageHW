package com.byted.camp.todolist.entity;

import java.lang.System;

@android.arch.persistence.room.Entity()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\t\u0010%\u001a\u00020\u000bH\u00c6\u0003J;\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006-"}, d2 = {"Lcom/byted/camp/todolist/entity/Note;", "", "id", "", "date", "Ljava/util/Date;", "state", "Lcom/byted/camp/todolist/model/State;", "content", "", "priority", "Lcom/byted/camp/todolist/model/Priority;", "(JLjava/util/Date;Lcom/byted/camp/todolist/model/State;Ljava/lang/String;Lcom/byted/camp/todolist/model/Priority;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getId", "()J", "setId", "(J)V", "getPriority", "()Lcom/byted/camp/todolist/model/Priority;", "setPriority", "(Lcom/byted/camp/todolist/model/Priority;)V", "getState", "()Lcom/byted/camp/todolist/model/State;", "setState", "(Lcom/byted/camp/todolist/model/State;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Note {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "date")
    private java.util.Date date;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "state")
    private com.byted.camp.todolist.model.State state;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "content")
    private java.lang.String content;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "priority")
    private com.byted.camp.todolist.model.Priority priority;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.model.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.State p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.model.Priority getPriority() {
        return null;
    }
    
    public final void setPriority(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.Priority p0) {
    }
    
    public Note(long id, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.State state, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.Priority priority) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.model.State component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.model.Priority component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.entity.Note copy(long id, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.State state, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.Priority priority) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}