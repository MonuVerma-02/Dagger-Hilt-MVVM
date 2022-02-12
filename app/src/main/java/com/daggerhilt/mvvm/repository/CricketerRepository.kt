package com.daggerhilt.mvvm.repository

import com.daggerhilt.mvvm.model.Cricketer

interface CricketerRepository {
    fun getPlayers(): List<Cricketer>
}