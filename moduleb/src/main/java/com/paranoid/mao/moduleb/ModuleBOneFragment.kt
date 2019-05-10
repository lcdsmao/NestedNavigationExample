package com.paranoid.mao.moduleb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ModuleBOneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_module_b_one, container, false).apply {
            findViewById<Button>(R.id.nav_inside).setOnClickListener {
                findNavController().navigate(
                        ModuleBOneFragmentDirections.actionModuleBOneFragmentToModuleBTwoFragment()
                )
            }
            findViewById<Button>(R.id.nav_module_c).setOnClickListener {
                findNavController().navigate(
                        ModuleBOneFragmentDirections.actionModuleBOneFragmentToModuleC()
                )
            }
        }
    }
}
