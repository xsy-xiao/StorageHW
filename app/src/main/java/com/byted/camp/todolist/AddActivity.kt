package com.byted.camp.todolist

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatRadioButton

import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast

//import com.byted.camp.todolist.database.NoteDatabase
import com.byted.camp.todolist.database.NoteDatabase2
import com.byted.camp.todolist.entity.Note
import com.byted.camp.todolist.model.Priority
import com.byted.camp.todolist.model.State
import java.util.*

class AddActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var addBtn: Button
    lateinit var radioGroup: RadioGroup
    lateinit var lowRadio: AppCompatRadioButton

    lateinit var db: NoteDatabase2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        setTitle("take a note")

        editText = findViewById(R.id.edit_text)
        editText.isFocusable = true
        editText.requestFocus()

        radioGroup = findViewById(R.id.radio_group)

        lowRadio = findViewById(R.id.btn_low)
        lowRadio.isChecked = true

        db = NoteDatabase2.getNoteDatabase(applicationContext)

        addBtn = findViewById(R.id.btn_add)

        addBtn.setOnClickListener {
            view ->

                var content: CharSequence = editText.text
                if (TextUtils.isEmpty(content)) {
                    Toast.makeText(this, "no content", Toast.LENGTH_SHORT).show()
                    finish()
                }
                var state: State = State.TODO
                var date: Date = Date()
                var priority: Priority = getSelectedPriority()
                var succeed = saveNote2Database(date, state, content.trim().toString(), priority)
                if (succeed) {
                    Toast.makeText(
                        this,
                        "Note added", Toast.LENGTH_SHORT
                    ).show()
                    setResult(Activity.RESULT_OK)
                } else {
                    Toast.makeText(
                        this,
                        "Error", Toast.LENGTH_SHORT
                    ).show()
            }
            finish()

        }

    }
    fun saveNote2Database(date: Date, state: State, content: String, priority: Priority): Boolean{
        if(db == null) {
            return false
        }
        var rowId: Long= db.noteDao().insert(Note(
            0,
            date,
            state,
            content,
            priority
        ))

        return rowId != -1L

    }

    fun getSelectedPriority(): Priority {
        when(radioGroup.checkedRadioButtonId) {
            R.id.btn_low -> return Priority.LOW
            R.id.btn_medium -> return Priority.MEDIUM
            R.id.btn_high -> return Priority.HIGH
        }
        return Priority.LOW
    }


}