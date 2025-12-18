package com.example.act8_localrestapi.view.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.act8_localrestapi.repositori.AplikasiDataSiswa
import com.example.act8_localrestapi.view.viewmodel.EntryViewModel
import com.example.act8_localrestapi.view.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa() : AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as
                AplikasiDataSiswa)
object PenyediaViewModel {
    val Factory = viewModelFactory  {
        initializer {
            HomeViewModel(aplikasiDataSiswa().container.repositoryDataSiswa)
        }
        initializer {
            EntryViewModel(aplikasiDataSiswa().container.repositoryDataSiswa)
        }
    }
}