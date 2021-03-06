package com.ctt.dogcat

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    //Equivalente ao ItemCount da RV
    //Numero de Fragmentos a serem colocados

    override fun getCount(): Int {
        return 3
    }

    //Relacao entre Item/Posicao a fragment a ser exibida

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> AdocaoFragment()
            1 -> AdocaoFragment()
            2 -> AdocaoFragment()
            else -> AdocaoFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Meus Dados"
            1 -> "Adoção"
            2 -> "News"

            else -> super.getPageTitle(position)
        }

    }
}