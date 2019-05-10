package com.paranoid.mao.moduleb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class ModuleBOneFragment : Fragment() {

    private val args by navArgs<ModuleBOneFragmentArgs>()

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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Toast.makeText(context, "Test Args: ${args.message}", Toast.LENGTH_SHORT).show()
    }
}
