package br.com.base.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.base.R
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        viewModel.getData()
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.disposables.clear()
    }
}
