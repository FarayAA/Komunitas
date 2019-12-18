package com.example.komunitas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class EventFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_event, container, false)
    }

    companion object{
        fun newInstance(): EventFragment{
            val fragment = EventFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
