package uz.saidarabxon.akramov.homeworkviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.adapters.MyFragmentPagerAdapter
import uz.models.Useer
import uz.saidarabxon.akramov.homeworkviewpager.databinding.ActivityMainBinding
import uz.saidarabxon.akramov.homeworkviewpager.databinding.ItemTabviewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var myFragmentPagerAdapter: MyFragmentPagerAdapter
    private lateinit var binding: ActivityMainBinding
    private lateinit var list: ArrayList<Useer>

    //   private lateinit var myViewPagerAdapter: MyViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        loadDate()

//        myViewPagerAdapter  = MyViewPagerAdapter(list,this)
//        binding.myViewPager.adapter = myViewPagerAdapter

        myFragmentPagerAdapter = MyFragmentPagerAdapter(supportFragmentManager, list)
        binding.myViewPager.adapter = myFragmentPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.myViewPager)


    }

    private fun loadDate() {
        list = ArrayList()


        list.add(
            Useer(
                "dddd",
                "https://avatars.mds.yandex.net/i?id=aec28d4a71473d41b85a8cf964e52514-6974755-images-thumbs&n=13",

                )
        )

        list.add(
            Useer(
                "dddd",
                "https://avatars.mds.yandex.net/i?id=aec28d4a71473d41b85a8cf964e52514-6974755-images-thumbs&n=13"
            )
        )
        list.add(
            Useer(
                "dddd",
                "https://avatars.mds.yandex.net/i?id=aec28d4a71473d41b85a8cf964e52514-6974755-images-thumbs&n=13"
            )
        )
    }
    private fun setTab(){
        val tabCount =  binding.tabLayout.tabCount


        for (i in 0 until tabCount){
            val tabViewItem = ItemTabviewBinding.inflate(layoutInflater)
            val selected = binding.tabLayout.getTabAt(i)

            selected?.customView = tabViewItem.root
            tabViewItem.tabTv.text = list[i].name



        }
    }

}