package com.byted.camp.todolist.ui

import android.graphics.Color
import android.graphics.Paint
import android.support.v7.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import com.byted.camp.todolist.R
//import com.byted.camp.todolist.database.NoteDatabase
import com.byted.camp.todolist.database.NoteDatabase2
import com.byted.camp.todolist.entity.Note
import com.byted.camp.todolist.model.State

class NoteListAdapter: RecyclerView.Adapter<NoteViewHolder>() {
    var list: MutableList<Note> = ArrayList()
    var db: NoteDatabase2 = NoteDatabase2.getNoteDatabase(null)

    fun refresh() {
        list.clear()
        list.addAll(db.noteDao().getAll())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): NoteViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_note, parent, false)
        return NoteViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: NoteViewHolder, pos: Int) {
        var itemView: View = viewHolder.itemView

        var note = list[pos]

        var checkBox: CheckBox = itemView.findViewById(R.id.checkbox)
        checkBox.isChecked = note.state== State.DONE
        checkBox.setOnClickListener { view ->
            note.state = if (checkBox.isChecked) State.DONE else State.TODO
            db.noteDao().update(note)
            refresh()
        }

        var contentText: TextView = itemView.findViewById(R.id.text_content)
        contentText.text = note.content

        var dateText = itemView.findViewById<TextView>(R.id.text_date)
        dateText.text = note.date.toString()

        var deleteBtn = itemView.findViewById<View>(R.id.btn_delete)
        deleteBtn.setOnClickListener {
                view ->
            db.noteDao().delete(note)
            refresh()
        }
        if (note.state == State.DONE) {
            contentText.setTextColor(Color.GRAY)
            contentText.paintFlags = contentText.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            contentText.setTextColor(Color.BLACK)
            contentText.paintFlags = contentText.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        itemView.setBackgroundColor(note.priority.color)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}