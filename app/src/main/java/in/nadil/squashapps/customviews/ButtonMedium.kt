package `in`.nadil.squashapps.customviews

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet

class ButtonMedium : androidx.appcompat.widget.AppCompatButton {
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
            Typeface.createFromAsset(context.assets, "fonts/Roboto-Medium.ttf")
        setTypeface(tf, Typeface.NORMAL)
    }
}