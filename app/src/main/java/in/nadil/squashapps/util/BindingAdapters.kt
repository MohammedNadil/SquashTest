package `in`.nadil.squashapps.util




import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, id: Int?) {
    id?.let {
     imgView.setImageResource(id)
    }
}




