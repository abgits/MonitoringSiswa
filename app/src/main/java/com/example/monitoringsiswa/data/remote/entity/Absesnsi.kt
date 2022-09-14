package com.example.monitoringsiswa.data.remote.entity

import java.util.Date
import java.util.UUID

data class Absesnsi(
    val idabsensi : String = UUID.randomUUID().toString(),
    val nis : String,
    val tgl: Date,
    val ket: String,
    val idmapel : String,
    val idkelas : String
    )
