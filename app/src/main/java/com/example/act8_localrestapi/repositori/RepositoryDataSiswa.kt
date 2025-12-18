package com.example.act8_localrestapi.repositori

import com.example.act8_localrestapi.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) : retrofit2.Response<Void>
}

