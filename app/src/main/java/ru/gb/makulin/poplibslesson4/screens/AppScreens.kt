package ru.gb.makulin.poplibslesson4.screens

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gb.makulin.poplibslesson4.ui.imageconverter.ImageConverterFragment

object AppScreens {

    fun imageConverterScreen() =FragmentScreen {
        ImageConverterFragment.newInstance()
    }
}