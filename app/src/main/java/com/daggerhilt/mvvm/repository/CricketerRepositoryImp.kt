package com.daggerhilt.mvvm.repository

import com.daggerhilt.mvvm.model.Cricketer

class CricketerRepositoryImp : CricketerRepository {

    override fun getPlayers(): List<Cricketer> = listOf(
        Cricketer("https://bit.ly/3LuHdbW", "Virender Sehwag"),
        Cricketer("https://bit.ly/3BhdrCN", "Sachin Tendulkar"),
        Cricketer("https://bit.ly/3BejXu8", "Gautam Gambhir"),
        Cricketer("https://bit.ly/3LrzuLJ", "Virat Kohli"),
        Cricketer("https://bit.ly/3HJaAoX", "MS Dhoni"),
        Cricketer("https://bit.ly/34A1gVN", "Yuvraj Singh"),
        Cricketer("https://bit.ly/3sCRsCJ", "Suresh Raina"),
        Cricketer("https://bit.ly/3GHslne", "Harbhajan Singh"),
        Cricketer("https://bit.ly/3uJcja6", "Zaheer Khan"),
        Cricketer("https://bit.ly/3JiQZMz", "Munaf Patel"),
        Cricketer("https://bit.ly/3rHTt12", "Sreesanth")
    )

}