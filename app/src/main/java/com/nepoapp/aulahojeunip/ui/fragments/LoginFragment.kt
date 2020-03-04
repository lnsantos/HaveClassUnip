package com.nepoapp.aulahojeunip.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.nepoapp.aulahojeunip.R
import com.nepoapp.aulahojeunip.databinding.FragmentLoginBinding
import com.nepoapp.aulahojeunip.mvvm.viewModel.LoginViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {

    private val mViewModel : LoginViewModel by viewModel()
    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupListeners()
    }

    private fun setupListeners(){
        binding.accessAccount.setOnClickListener(accessAccountListener)
    }

    private val accessAccountListener = View.OnClickListener{
        mViewModel.handlerLogin(binding.user!!)
    }
}
