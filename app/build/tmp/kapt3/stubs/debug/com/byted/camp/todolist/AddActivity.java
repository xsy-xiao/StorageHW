package com.byted.camp.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J&\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00060"}, d2 = {"Lcom/byted/camp/todolist/AddActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "addBtn", "Landroid/widget/Button;", "getAddBtn", "()Landroid/widget/Button;", "setAddBtn", "(Landroid/widget/Button;)V", "db", "Lcom/byted/camp/todolist/database/NoteDatabase2;", "getDb", "()Lcom/byted/camp/todolist/database/NoteDatabase2;", "setDb", "(Lcom/byted/camp/todolist/database/NoteDatabase2;)V", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "lowRadio", "Landroid/support/v7/widget/AppCompatRadioButton;", "getLowRadio", "()Landroid/support/v7/widget/AppCompatRadioButton;", "setLowRadio", "(Landroid/support/v7/widget/AppCompatRadioButton;)V", "radioGroup", "Landroid/widget/RadioGroup;", "getRadioGroup", "()Landroid/widget/RadioGroup;", "setRadioGroup", "(Landroid/widget/RadioGroup;)V", "getSelectedPriority", "Lcom/byted/camp/todolist/model/Priority;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "saveNote2Database", "", "date", "Ljava/util/Date;", "state", "Lcom/byted/camp/todolist/model/State;", "content", "", "priority", "app_debug"})
public final class AddActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText editText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button addBtn;
    @org.jetbrains.annotations.NotNull()
    public android.widget.RadioGroup radioGroup;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.AppCompatRadioButton lowRadio;
    @org.jetbrains.annotations.NotNull()
    public com.byted.camp.todolist.database.NoteDatabase2 db;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEditText() {
        return null;
    }
    
    public final void setEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getAddBtn() {
        return null;
    }
    
    public final void setAddBtn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioGroup getRadioGroup() {
        return null;
    }
    
    public final void setRadioGroup(@org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.AppCompatRadioButton getLowRadio() {
        return null;
    }
    
    public final void setLowRadio(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.AppCompatRadioButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.database.NoteDatabase2 getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.database.NoteDatabase2 p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean saveNote2Database(@org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.State state, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.byted.camp.todolist.model.Priority priority) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byted.camp.todolist.model.Priority getSelectedPriority() {
        return null;
    }
    
    public AddActivity() {
        super();
    }
}