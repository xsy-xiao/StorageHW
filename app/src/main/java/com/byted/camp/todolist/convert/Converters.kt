package com.byted.camp.todolist.convert

import android.arch.persistence.room.TypeConverter
import com.byted.camp.todolist.model.Priority
import com.byted.camp.todolist.model.State
import java.util.*

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }

    @TypeConverter
    fun fromState(state: State?): String? {
        return state?.name
    }

    @TypeConverter
    fun toState(name: String?): State? {
        return State.valueOf(name!!)
    }

    @TypeConverter
    fun fromPriority(priority: Priority?): String? {
        return priority?.name
    }

    @TypeConverter
    fun toPriority(name: String?): Priority? {
        return Priority.valueOf(name!!)
    }


}
