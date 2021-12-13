package com.furkankurt.kotlinnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation


class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View=inflater.inflate(R.layout.fragment_second, container, false)
        val button=view.findViewById<Button>(R.id.button2)
        val textView=view.findViewById<TextView>(R.id.textView2)
        arguments?.let {
            val usname=SecondFragmentArgs.fromBundle(it).userName
            textView.text=usname

        }

        // Inflate the layout for this fragment

        button.setOnClickListener(View.OnClickListener {
            val action=SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        })
        return view
    }

}