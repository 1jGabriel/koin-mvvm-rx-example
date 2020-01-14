package br.com.base.data

import io.reactivex.Single

interface Repository {
    fun getData(): Single<Any>
}