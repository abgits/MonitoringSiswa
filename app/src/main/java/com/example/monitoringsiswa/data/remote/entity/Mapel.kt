package com.example.monitoringsiswa.data.remote.entity

import java.util.UUID

data class Mapel(val idmapel : String = UUID.randomUUID().toString(),val mapel : String,val nip : String, val kkm : Float)
