package br.com.base.data

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class RepositoryImpl(val service: Service) : Repository {
    override fun getData(): Single<Any> {
        return service.getCharacters()
            .subscribeOn(Schedulers.io())
            .map { response ->
                when {
                    response.isSuccessful -> {
                        response.body() ?: Any()
                    }
                    else -> throw Throwable(response.message())
                }
            }
    }
}
