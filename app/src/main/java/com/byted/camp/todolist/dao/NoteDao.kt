package com.byted.camp.todolist.dao

import android.arch.persistence.room.*
import com.byted.camp.todolist.entity.Note


@Dao
interface NoteDao {
    @Query("select * from note order by state desc")
    fun getAll(): List<Note>

    @Delete
    fun delete(note: Note)

    @Insert
    fun insert(note: Note): Long

    @Update
    fun update(note: Note)


}