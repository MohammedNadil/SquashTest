package `in`.nadil.squashapps.customviews

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class TextViewRegular : AppCompatTextView {
    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyle: Int
    ) : super(context, attrs, defStyle) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
        init()
    }

    constructor(context: Context) : super(context) {
        init()
    }

    fun init() {
        val tf =
            Typeface.createFromAsset(context.assets, "fonts/Roboto-Regular.ttf")
        setTypeface(tf, Typeface.NORMAL)
    }
}