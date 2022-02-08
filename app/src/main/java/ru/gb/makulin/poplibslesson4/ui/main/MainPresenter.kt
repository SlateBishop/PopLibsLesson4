package ru.gb.makulin.poplibslesson4.ui.main

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import ru.gb.makulin.poplibslesson4.screens.AppScreens

class MainPresenter(private val router: Router) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(AppScreens.imageConverterScreen())
    }

}