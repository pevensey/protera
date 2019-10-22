package com.example.prodi_itera

object Prodi_Data {
    private val nama_prodi = arrayOf(
        "Biologi",
        "Biosistem",
        "Farmasi",
        "Fisika",
        "Matematika",
        "Sains Atmosfer dan Keplanetan",
        "Teknik Elektro",
        "Teknik Geologi",
        "Teknik Geomatika",
        "Teknik Informatika",
        "Teknik Kelautan",
        "Teknik Lingkungan")

    private val detail_prodi = arrayOf(
        "Program Studi Biologi ITERA berkonsentrasi pada eksplorasi keanekaragaman hayati di Pulau Sumatera. Keberadaan Program Studi Biologi ITERA diharapkan mampu menjadi pusat pembelajaran biodiversitas Sumatera.",
        "Teknik biosistem merupakan ilmu teknik yang mengombinasikan keilmuan matematika, biologi, fisika, kimia, dan prinsip-prinsip keteknikan untuk memecahkan masalah-masalah yang berkaitan dengan pertanian, lingkungan, biologi, dan energi.",
        "Program Studi Farmasi merupakan program studi baru yang dibuka pada tahun akademik 2018/2019. Program studi ini merupakan program studi yang mempelajari pengetahuan tentang identifikasi, sintesis, pengembangan, distribusi, terapi dan monitoring penggunaan obat sintesis maupun obat bahan alam.",
        "Fisika adalah ilmu alam dasar yang mempelajari materi dan energi serta interaksinya. Hal tersebut dilakukan melaluipengamatan, pemahaman dan prediksi fenomena alam maupun perilaku sistem buatan manusia. Secara khusus, Fisika mencoba menjawab pertanyaan mendasar tentang sifat alam semesta maupun tentang prinsip-prinsip yang lebih aplikatif dalam pwersoalan lingkungan dan teknologi masa kini. ",
        "Matematika adalah salah satu program studi yang berada dibawah Jurusan Sains Institut Teknologi Sumatera dan didirikan pada tanggal 23 September 2016",
        "Program Studi Sains Atmosfer dan Keplanetan (PS SAK) didirikian berdasarkan Surat Keputusan Menteri Riset, Teknologi, dan Pendidikan Tinggi Republik Indonesia Nomor 26/KPT/I/2018 Tanggal 10 Januari 2018 merupakan program studi baru di Institut Teknologi Sumatera yang yang akan dibuka pada tahun akademik 2018/2019.",
        "Teknik Elektro merupakan salah satu program studi favorit. Teknik Elektro memiliki peran yang sangat penting dalam mengembangkan dan memajukan teknologi. Selain itu, sarjana Teknik Elektro memiliki prospek lapangan kerja yang banyak dan dibutuhkan oleh banyak perusahaan, baik perusahaan BUMN, swasta, asing dan tenaga ahli. Secara umum, Ilmu Elektro yang dipelajari dibagi menjadi beberapa bidang, diantaranya: Tenaga Listrik, Elektronika, Telekomunikasi dan Kendali.",
        "Teknik Geologi adalah suatu ilmu yang mempelajari dan mengembangkan pengetahuan yang berkaitan dengan kebumian seperti, bentuk muka bumi, material penyusun bumi, berbagai jenis dan bentuk batuan, sifat fisika dan kimia, proses pembentukan dan sejarah bumi serta geologi terapan seperti Geologi Minyak dan Gas Bumi, Geologi Teknik, Hidrogeologi, Geologi Tata Lingkungan, Geologi Tambang, dan lain-lain. Teknik Geologi berperan sebagai wahana pengkajian dan pemanfaatan sumberdaya alam (mineral, energi, dan air) serta penerapan kerekayasaan, Lingkungan hidup, dan mitigasi bencana alam.",
        "Program Studi ini bernama Teknik Geodesi dan Geomatika pada awalnya, dan diubah menjadi Teknik Geomatika menyesuaikan dengan nomenklatur terbaru mengenai nama prodi yang telah ditetapkan pemerintah. Geomatika muncul dalam konteks integrasi beberapa disiplin ilmu dan profesi yang berhubungan dengan data dan informasi geospasial (berhubungan dengan pengukuran dan pemetaan digital), masalah-masalah kebumian dan kelautan berikut semua aspek yang terkait didalamnya (penataan ruang, tata guna lahan, lingkungan, sosial ekonomi), serta komputer terapan.",
        "Cakupan bidang ilmu (body of knowledge) yang diajarkan di Program Studi Teknik Informatika meliputi ilmu pada area computer science dan software engineering sehingga mahasiswa memiliki kemampuan analisis persoalan yang terkait bidang computer science dan software engineering; dan juga kemampuan untuk mengembangkan solusi perangkat lunak (software) baik yang kompleks  maupun dalam skala besar (large scale software).",
        "Program Studi Teknik Kelautan adalah Program Studi yang memiliki kompetensi pembelajaran dalam bidang infrastruktur pantai dan pengelolaan wilayah pesisir. Mahasiswa juga mempelajari bagaimana merancang dan mengendalikan kondisi lingkungan di laut sehingga dapat bermanfaat dengan baik.",
        "Teknik lingkungan merupakan bidang keilmuan yang mempelajari tindakan preventif (pencegahan) dan kuratif (penyembuhan) yang dapat dilakukan untuk menyelamatkan lingkungan air, tanah, dan udara melalui pendekatan rekayasa teknik. Teknik lingkungan dilatarbelakangi oleh upaya proteksi lingkungan akibat kegiatan manusia, proteksi kesehatan dan keselamatan manusia akibat penyakit, serta penaggulangan pencemaran kimia yang ada di lingkungan.")

    private val gambar_prodi = intArrayOf(
        R.mipmap.biologi_foreground,
        R.mipmap.biosistem_foreground,
        R.mipmap.farmasi_foreground,
        R.mipmap.fisika_foreground,
        R.mipmap.matematika_foreground,
        R.mipmap.sak_foreground,
        R.mipmap.teknik_elekto_foreground,
        R.mipmap.teknik_geologi_foreground,
        R.mipmap.teknik_geomatika_foreground,
        R.mipmap.teknik_informatika_foreground,
        R.mipmap.teknik_kelautan_foreground,
        R.mipmap.teknik_lingkungan_foreground)

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