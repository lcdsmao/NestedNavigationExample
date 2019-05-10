package com.paranoid.mao.modulec

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ModuleCOneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_module_c_one, container, false).apply {

            findViewById<Button>(R.id.nav_inside).setOnClickListener {
                findNavController().navigate(
                        ModuleCOneFragmentDirections.actionModuleCOneFragmentToModuleCTwoFragment()
                )
            }
        }
    }
}
