package br.com.base.ui.main

import androidx.lifecycle.ViewModel
import br.com.base.data.Repository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable

class MainViewModel(private val repository: Repository) : ViewModel() {
    val disposables = CompositeDisposable()

    fun getData() {
        disposables.add(
            repository.getData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ println(it) }, { println(it) })
        )
    }
}
