package com.example.monitoringsiswa.data.remote.entity

import java.util.*

data class Tugas(
    val idtugas : String,
    val idkelas : String,
    val idmapel : String,
    val tglDeadline: Date?,
    val keterangan: String
)
