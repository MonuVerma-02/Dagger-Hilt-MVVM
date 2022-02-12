package com.daggerhilt.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daggerhilt.mvvm.model.Cricketer
import com.daggerhilt.mvvm.repository.CricketerRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CricketerViewModel @Inject constructor(private val cricketerRepositoryImp: CricketerRepositoryImp) :
    ViewModel() {

    val cricketerList = MutableLiveData<List<Cricketer>>()

    init {
        getCricketerList()
    }

    private fun getCricketerList() {
        cricketerList.value = cricketerRepositoryImp!!.getPlayers()
    }
}