package io.github.zmunm.insight

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ComposeShader
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.RectF
import android.graphics.Shader
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.orhanobut.logger.Logger
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.movies.observe(this) {
            Logger.i(it.toString())
        }

        val bitmap = Bitmap.createBitmap(1080, 1080, Bitmap.Config.ARGB_8888)

        val canvas = Canvas(bitmap)

        val pnt = Paint()
        pnt.isAntiAlias = true

        val gradient1 =
            LinearGradient(
                0f,
                0f,
                0f,
                1080f,
                Color.CYAN,
                Color.WHITE,
                Shader.TileMode.CLAMP
            )
        val gradient2 =
            LinearGradient(
                0f,
                0f,
                1080f,
                0f,
                Color.WHITE,
                Color.MAGENTA,
                Shader.TileMode.CLAMP
            )
        val sat = LinearGradient(
            0f,
            0f,
            1080f,
            0f,
            Color.YELLOW,
            Color.WHITE,
            Shader.TileMode.CLAMP
        )

        val merged = ComposeShader(
            ComposeShader(gradient1, gradient2, PorterDuff.Mode.MULTIPLY),
            sat,
            PorterDuff.Mode.MULTIPLY
        )
        pnt.shader = merged
        canvas.drawRect(RectF(0f, 0f, 1080f, 1080f), pnt)

        findViewById<ImageView>(R.id.image).apply {
            setImageBitmap(bitmap)
        }
    }
}
