package com.nepoapp.aulahojeunip.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.nepoapp.aulahojeunip.R
import com.nepoapp.aulahojeunip.databinding.ActivityMainBinding
import com.nepoapp.aulahojeunip.ui.fragments.RegisterFragment
import com.nepoapp.aulahojeunip.mvvm.viewModel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mViewModel : MainViewModel by viewModel()
    private lateinit var binding : ActivityMainBinding

    private var transitionFragment = supportFragmentManager.beginTransaction()

    companion object TAG{
        const val LOGIN_FRAGMENT = "login-fragment"
        const val REGISTER_FRAGMENT = "register-fragment"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        controllerFrameLayout()
    }

    private fun setupView() {

        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

    }

    private fun controllerFrameLayout(){
        if(binding.frameLayout != null){
            showFragmentLogin()
        }
    }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.new_user -> showFragmentRegister()

        }
        return true
    }

    private fun showFragmentLogin(){

        actionBar?.title = "Efetuar Login"
        actionBar?.elevation = 0f

        var loginFragment = supportFragmentManager.findFragmentByTag(LOGIN_FRAGMENT)

        if (loginFragment == null){
            loginFragment = RegisterFragment()
        }

        transitionFragment.replace(binding.frameLayout.id,loginFragment,
            LOGIN_FRAGMENT
        )
            .commit()
    }

    private fun showFragmentRegister(){

        actionBar?.title = "Novo usuário"
        actionBar?.elevation = 0f

        var registerFragment = supportFragmentManager.findFragmentByTag(REGISTER_FRAGMENT)

        if (registerFragment == null){
            registerFragment = RegisterFragment()
        }

        transitionFragment.replace(binding.frameLayout.id,registerFragment,
            REGISTER_FRAGMENT
        )
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

}
