package com.manoch.todolist.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation
import com.manoch.todolist.viewmodel.NewNoteViewModel
import com.manoch.todolist.R

class AddNoteFragment : Fragment() {

    private lateinit var viewModel: NewNoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.new_note_fragment, container, false)
        val addNote:Button =rootView.findViewById(R.id.addNote_btn)
        val closeNote:Button =rootView.findViewById(R.id.closeNote_btn)
        val note:EditText=rootView.findViewById(R.id.note_etxt)
        addNote.setOnClickListener{
            Toast.makeText(rootView.context,note.text.toString(),Toast.LENGTH_LONG).show()
        }
        closeNote.setOnClickListener{
            Navigation.findNavController(rootView).navigate(R.id.action_newNoteFragment_to_notesFragment)
        }
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NewNoteViewModel::class.java)
        // TODO: Use the ViewModel
    }

}