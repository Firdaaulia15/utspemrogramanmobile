package com.example.pekerjaan

object PekerjaanData {

    private val pekerjaanNames = arrayOf(
        "DOKTER",
        "DOSEN",
        "GURU",
        "PETANI",
        "POLISI",
        "TNI",
        "PNS",
        "AKTOR",
        "AKTRIS",
        "PENGUSAHA",
    )

    private val pekerjaanDeskripsi = arrayOf(
        "Richard lee (Umur 35 Tahun)",
        "Muhammad Yani (45 Tahun)",
        "Hym Maltora (27 Tahun)",
        "Muhammad Indra Surya (40 Tahun)",
        "Raihan Nazhifa (22 Tahun)",
        "Muhammad Abrar (22 Tahun)",
        "Agus Gusnadi (22 Tahun)",
        "Raffi Ahmad (33 Tahun)",
        "Nagita Slavina (32 Tahun)",
        "Hary Tanoesoedibjo (55 Tahun)",
    )

    private val pekerjaanGambar = intArrayOf(
        R.drawable.dokter,
        R.drawable.dosen,
        R.drawable.guru,
        R.drawable.petani,
        R.drawable.polisi,
        R.drawable.tni,
        R.drawable.pns,
        R.drawable.aktor,
        R.drawable.aktris,
        R.drawable.pengusaha,
    )
    val listData: ArrayList<Pekerjaan>
        get() {
            var list = arrayListOf<Pekerjaan>()
            for(position in pekerjaanNames.indices){
                val pekerjaan = Pekerjaan()
                pekerjaan.name = pekerjaanNames[position]
                pekerjaan.deskripsi = pekerjaanDeskripsi[position]
                pekerjaan.gambar = pekerjaanGambar[position]
                list.add(pekerjaan)
            }
            return list
        }
}