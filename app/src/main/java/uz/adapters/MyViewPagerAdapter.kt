package uz.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
//import com.squareup.picasso.Picasso
import uz.models.Useer
import uz.saidarabxon.akramov.homeworkviewpager.R
import uz.saidarabxon.akramov.homeworkviewpager.databinding.ItemViewpagerBinding

class MyViewPagerAdapter(val list:ArrayList<Useer>,val context: Context):PagerAdapter() {


    override fun instantiateItem(container: ViewGroup, position: Int): Any {


        val layoutInflater = LayoutInflater.from(context)
        val view =ItemViewpagerBinding.inflate(layoutInflater,container,false)

//        view.itemTv.text = list[position].name
//        Picasso.get().load(list[position].image).into(view.itemImage)

        container.addView(view.root)

        return view.root
    }

    override fun getCount(): Int {
return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
return view==`object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as View)
    }
}