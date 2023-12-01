package br.com.thalesnishida.orgs.extensions

import android.widget.ImageView
import coil.load


fun ImageView.tentaCarregarImagem(url: String? = null){
    load(url) {
        fallback(br.com.thalesnishida.orgs.R.drawable.erro)
        error(br.com.thalesnishida.orgs.R.drawable.erro)
        placeholder(br.com.thalesnishida.orgs.R.drawable.placeholder)
    }
}