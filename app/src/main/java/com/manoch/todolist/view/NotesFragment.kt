package com.manoch.todolist.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.manoch.todolist.viewmodel.NotesViewModel
import com.manoch.todolist.R

class NotesFragment : Fragment() {
    private lateinit var viewModel: NotesViewModel
    private lateinit var noteList :List<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val noteView = inflater.inflate(R.layout.notes_fragment, container, false)
        val addNewNote:View =noteView.findViewById(R.id.addNote_fab)
        addNewNote.setOnClickListener{
            Navigation.findNavController(noteView).navigate(R.id.action_notesFragment_to_newNoteFragment)
        }
        return noteView;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NotesViewModel::class.java)
        getNotesList();
        // TODO: Use the ViewModel
    }

    private fun getNotesList() {
        TODO("Not yet implemented")

    }

}