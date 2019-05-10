package com.paranoid.mao.modulea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ModuleAOneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_module_a_one, container, false).apply {
            findViewById<Button>(R.id.nav_inside).setOnClickListener {
                findNavController().navigate(
                        ModuleAOneFragmentDirections.actionModuleAOneFragmentToModuleATwoFragment()
                )
            }
            findViewById<Button>(R.id.nav_module_b).setOnClickListener {
                findNavController().navigate(
                        ModuleAOneFragmentDirections.actionModuleAOneFragmentToModuleB(
                                "Navigate from module A to module B"
                        )
                )
            }
            findViewById<Button>(R.id.nav_module_c).setOnClickListener {
                findNavController().navigate(
                        ModuleAOneFragmentDirections.actionModuleAOneFragmentToModuleC()
                )
            }
        }
    }
}
