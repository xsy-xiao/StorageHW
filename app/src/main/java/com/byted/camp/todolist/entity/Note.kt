package com.byted.camp.todolist.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.byted.camp.todolist.model.Priority
import com.byted.camp.todolist.model.State
import java.util.*

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true) var id:Long,
    @ColumnInfo(name = "date") var date: Date,
    @ColumnInfo(name = "state") var state: State,
    @ColumnInfo(name = "content") var content:String,
    @ColumnInfo(name = "priority") var priority: Priority
    ){
//    constructor(date: Date, state: State, content: String, priority: Priority):
//            this(0, date, state, content, priority)
}