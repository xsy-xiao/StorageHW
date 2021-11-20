package com.byted.camp.todolist.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0006\u0010\u001b\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/byted/camp/todolist/ui/NoteListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/byted/camp/todolist/ui/NoteViewHolder;", "()V", "db", "Lcom/byted/camp/todolist/database/NoteDatabase2;", "getDb", "()Lcom/byted/camp/todolist/database/NoteDatabase2;", "setDb", "(Lcom/byted/camp/todolist/database/NoteDatabase2;)V", "list", "", "Lcom/byted/camp/todolist/entity/Note;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "refresh", "app_debug"})
public final class NoteListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.byted.camp.todolist.ui.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.byted.camp.todolist.entity.Note> list;
    @org.jetbrains.annotations.NotNull()
    private com.byted.camp.todolist.database.NoteDatabase2 db;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.byted.camp.todolist.entity.Note> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.byted.camp.todolist.entity.Note> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.database.NoteDatabase2 getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.database.NoteDatabase2 p0) {
    }
    
    public final void refresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.byted.camp.todolist.ui.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.ui.NoteViewHolder viewHolder, int pos) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public NoteListAdapter() {
        super();
    }
}