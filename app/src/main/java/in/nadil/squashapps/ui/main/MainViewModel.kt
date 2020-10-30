package `in`.nadil.squashapps.ui.main

import `in`.nadil.squashapps.R
import `in`.nadil.squashapps.dataprovider.VideoModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {

    private val _videolist = MutableLiveData<ArrayList<VideoModel>>()
    private val _clickeditem = MutableLiveData<Int>()
    private val _popup = MutableLiveData<Boolean>()

    val videolist: LiveData<ArrayList<VideoModel>> = _videolist
    val clickeditem: LiveData<Int> = _clickeditem
    val popup: LiveData<Boolean> = _popup

    init {
        _popup.value = false
        getvideolist()
    }

    fun onclicked(it:Int){
        _clickeditem.value = it
    }
    fun switchpop(){
        _popup.value = _popup.value != true
    }
    private fun getvideolist() {
        val templist: ArrayList<VideoModel> = ArrayList()
        templist.add(VideoModel(1,"15.2K", R.drawable.first))
        templist.add(VideoModel(2,"1000", R.drawable.second))
        templist.add(VideoModel(3,"8546", R.drawable.third))

        templist.add(VideoModel(4,"1000", R.drawable.second))
        templist.add(VideoModel(5,"8546", R.drawable.third))
        templist.add(VideoModel(6,"15.2K", R.drawable.first))

        templist.add(VideoModel(7,"8546", R.drawable.third))
        templist.add(VideoModel(8,"15.2K", R.drawable.first))
        templist.add(VideoModel(9,"1000", R.drawable.second))

        _videolist.value = templist
    }
}