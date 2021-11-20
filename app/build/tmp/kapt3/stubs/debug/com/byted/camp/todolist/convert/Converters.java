package com.byted.camp.todolist.convert;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/byted/camp/todolist/convert/Converters;", "", "()V", "dateToTimestamp", "", "date", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/Long;", "fromPriority", "", "priority", "Lcom/byted/camp/todolist/model/Priority;", "fromState", "state", "Lcom/byted/camp/todolist/model/State;", "fromTimestamp", "value", "(Ljava/lang/Long;)Ljava/util/Date;", "toPriority", "name", "toState", "app_debug"})
public final class Converters {
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.util.Date fromTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.lang.Long dateToTimestamp(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.lang.String fromState(@org.jetbrains.annotations.Nullable()
    com.byted.camp.todolist.model.State state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final com.byted.camp.todolist.model.State toState(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.lang.String fromPriority(@org.jetbrains.annotations.Nullable()
    com.byted.camp.todolist.model.Priority priority) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final com.byted.camp.todolist.model.Priority toPriority(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
    
    public Converters() {
        super();
    }
}