package com.furkankurt.kotlinnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_first, container, false)
        val button=view.findViewById<Button>(R.id.First)
        button.setOnClickListener(View.OnClickListener {
            val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment("kurt")
            Navigation.findNavController(it).navigate(action)
        })
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }



}