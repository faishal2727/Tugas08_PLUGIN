package com.example.tugas008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas008.adepter.adapter
import com.example.tugas008.databinding.ActivityMainBinding
import com.example.tugas008.model.halaman

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = ArrayList<halaman>()
        data.add(halaman(R.drawable.indonesia,"Indonesia", "Indonesia adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia."))
        data.add(halaman(R.drawable.malaysia1,"Malaysia", "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km persegi."))
        data.add(halaman(R.drawable.sinagpura1,"Sinapura","Singapura adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya, 137 kilometer (85 mi) di utara khatulistiwa di Asia Tenggara."))
        data.add(halaman(R.drawable.thailand1,"Thailand","Thailand adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat."))
        data.add(halaman(R.drawable.myanmar1,"Myanmar", "Myanmar adalah sebuah negara berdaulat di Asia Tenggara. Myanmar berbatasan dengan India dan Bangladesh di sebelah barat, Thailand dan Laos di sebelah timur dan China di sebelah utara dan timur laut."))
        data.add(halaman(R.drawable.vietnam,"Vietnam", "Vietanam dalah negara paling timur di Semenanjung Indochina di Asia Tenggara. Vietnam berbatasan dengan Republik Rakyat Tiongkok di sebelah utara"))
        data.add(halaman(R.drawable.brunei,"Brunei", "Brunei Darussalam  adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan."))

        var adapter =adapter(data)
        binding.rcy1.adapter =adapter
        binding.rcy1.layoutManager = LinearLayoutManager(this)
    }
}