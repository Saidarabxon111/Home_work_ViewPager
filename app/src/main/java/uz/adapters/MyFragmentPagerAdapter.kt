package uz.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import uz.fragments.ItemViewPagerAdapter
import uz.models.Useer

class MyFragmentPagerAdapter(  fm:FragmentManager, private val list:ArrayList<Useer>  ):FragmentPagerAdapter(fm) {
    override fun getCount(): Int = list.size


    override fun getItem(position: Int): Fragment {
        return  ItemViewPagerAdapter.newInstance(list[position].name,list[position].image)

    }

//    override fun getPageTitle(position: Int): CharSequence? {
//
//return list[position].name
//
//    }
}