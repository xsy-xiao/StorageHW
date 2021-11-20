package com.byted.camp.todolist.model

import android.graphics.Color

enum class Priority (var value:Int, var color:Int){
    HIGH(2, Color.RED),
    MEDIUM(1,Color.GREEN),
    LOW(0,Color.WHITE)
}