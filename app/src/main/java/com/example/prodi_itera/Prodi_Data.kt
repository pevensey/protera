package com.example.prodi_itera

object Prodi_Data {
    private val nama_prodi = arrayOf("Biologi",
        "Biosistem",
        "Farmasi",
        "Fisika",
        "Matematika",
        "Sains Atmosfer dan Keplanetan",
        "Teknik Elektro",
        "Teknik Geofisika",
        "Teknik Geologi",
        "Teknik Geomatika",
        "Teknik Informatika",
        "Teknik Kelautan",
        "Teknik Lingkungan",
        "Teknik Mesin",
        "Teknologi Industri Pertanian")

    private val detail_prodi = arrayOf("biologi ITERA")
    private val gambar_prodi = intArrayOf(R.mipmap.biologi_foreground)

    val listData: ArrayList<Prodi>
        get() {
            val list = arrayListOf<Prodi>()
            for (position in nama_prodi.indices) {
                val hero = Prodi()
                hero.name = nama_prodi[position]
                hero.detail = detail_prodi[position]
                hero.photo = gambar_prodi[position]
                list.add(hero)
            }
            return list
        }
}