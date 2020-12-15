package io.github.zmunm.insight

import android.graphics.*
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = Bitmap.createBitmap(1080, 1080, Bitmap.Config.ARGB_8888)

        val canvas = Canvas(bitmap)

        val pnt = Paint()
        pnt.isAntiAlias = true


        val gradient =
            LinearGradient(0f, 0f, 0f, 1080f, Color.CYAN, Color.MAGENTA, Shader.TileMode.CLAMP)
        val sat = LinearGradient(
            0f,
            0f,
            1080f,
            0f,
            Color.TRANSPARENT,
            Color.YELLOW,
            Shader.TileMode.CLAMP
        )

        val merged = ComposeShader(gradient, sat, PorterDuff.Mode.MULTIPLY)
        pnt.shader = merged
        canvas.drawRect(RectF(0f, 0f, 1080f, 1080f), pnt)

        findViewById<ImageView>(R.id.image).apply {
            setImageBitmap(bitmap)
        }
    }
}