package com.example.komunitas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class UserFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    companion object{
        fun newInstance(): UserFragment{
            val fragment = UserFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
