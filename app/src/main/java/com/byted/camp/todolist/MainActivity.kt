package com.byted.camp.todolist

import android.content.Intent

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

//import com.byted.camp.todolist.database.NoteDatabase
import com.byted.camp.todolist.database.NoteDatabase2
import com.byted.camp.todolist.ui.NoteListAdapter
import android.app.Activity




class MainActivity : AppCompatActivity() {
    lateinit var db: NoteDatabase2
    lateinit var recyclerView: RecyclerView
    lateinit var noteListAdapter: NoteListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        var toolbar: Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)

        var fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener{
            view ->
                startActivityForResult(Intent(this,
                    AddActivity::class.java),122)
        }


        // 数据库实例
        db = NoteDatabase2.getNoteDatabase(applicationContext)

        recyclerView = findViewById(R.id.list_todo)
        recyclerView.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL, false
            )

        noteListAdapter = NoteListAdapter()
        recyclerView.adapter = noteListAdapter

        noteListAdapter.refresh()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int,  data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 122
            && resultCode == RESULT_OK
        ) {
            noteListAdapter.refresh()
        }
    }


}