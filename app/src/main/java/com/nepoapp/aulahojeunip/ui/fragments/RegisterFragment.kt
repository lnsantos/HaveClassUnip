package com.nepoapp.aulahojeunip.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil

import com.nepoapp.aulahojeunip.R
import com.nepoapp.aulahojeunip.core.binding.UserDefault
import com.nepoapp.aulahojeunip.databinding.FragmentRegisterBinding
import com.nepoapp.aulahojeunip.mvvm.viewModel.RegisterViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private val mViewModel : RegisterViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_register,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
    }

    private fun setupListeners() {
        binding.registerAccount.setOnClickListener(registerUserListener)
    }


    private val registerUserListener = View.OnClickListener{
        binding.registerUser?.apply {
            mViewModel.handlerRegister(this)
            Toast.makeText(context,"NOT NULL",Toast.LENGTH_LONG).show()
        }

    }


}
