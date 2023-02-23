package com.example.bolalaruchunalifbo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bolalaruchunalifbo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    lateinit var alifboAdapter: AlifboAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayletter=arrayOf("Aa","Bb","Dd","Ee","Ff","Gg","Hh","Ii","Jj","Kk","Ll","Mm","Nn","Oo","Pp","Qq","Rr","Ss","Tt","Uu","Vv","Xx","Yy","Zz","O'o'","G'g'","Shsh","Chch","Ngng","'")
        val arraytext= arrayOf("ari","baliq","daraxt","eshik","fil","gul","hamshira","ilon","jo'ja","kapalak","limon","mashina","non","olma","pomidor","qovun","ruchka","sabzi","tarvuz","uzum","varrak","xo'roz","yo'lbars","zebra","o'rdak","g'ijjak","shar","chumoli","ng","tutuq belgisi")
        val arrayimages=arrayOf(
            R.drawable.ari,
            R.drawable.baliq,
            R.drawable.daraxt,
            R.drawable.eshik,
            R.drawable.fil,
            R.drawable.gul,
            R.drawable.hamshira,
            R.drawable.ilon,
            R.drawable.joja,
            R.drawable.kapalak,
            R.drawable.limon,
            R.drawable.mashina,
            R.drawable.non,
            R.drawable.olma,
            R.drawable.pamidor,
            R.drawable.qovun,
            R.drawable.ruchka,
            R.drawable.sabzi,
            R.drawable.tarvuz,
            R.drawable.uzum,
            R.drawable.varrak,
            R.drawable.xoroz,
            R.drawable.yolbars,
            R.drawable.zebra,
            R.drawable.ordak,
            R.drawable.gijjak1,
            R.drawable.sahr,
            R.drawable.chumoli,
            R.drawable.ng,
            R.drawable.tutuq,
        )
        val musicarray= arrayOf(
            R.raw.aaaa,
            R.raw.bbbb,
            R.raw.dddd,
            R.raw.eeee,
            R.raw.ffff,
            R.raw.gggg,
            R.raw.hhhh,
            R.raw.iiii,
            R.raw.jjjj,
            R.raw.kkkk,
            R.raw.llll,
            R.raw.mmmm,
            R.raw.nnnn,
            R.raw.oooo,
            R.raw.pppp,
            R.raw.qqqq,
            R.raw.rrrr,
            R.raw.ssss,
            R.raw.tttt,
            R.raw.uuuu,
            R.raw.vvvv,
            R.raw.xxxc,
            R.raw.yyyy,
            R.raw.zzzz,
            R.raw.oooo1,
            R.raw.gggg1,
            R.raw.shshshsh,
            R.raw.chchchch,
            R.raw.ngngngng,
            R.raw.tutuq,
        )


        alifboAdapter=AlifboAdapter(this@MainActivity2,arrayletter,arraytext,arrayimages,musicarray)
        binding.recyclerview1.layoutManager= GridLayoutManager(this@MainActivity2,2)
        binding.recyclerview1.adapter=alifboAdapter

    }
}