package io.github.zmunm.insight.util

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ComposeShader
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.RectF
import android.graphics.Shader

@Suppress("MagicNumber")
val rainbowBitmap: Bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.RGB_565).apply {
    val canvas = Canvas(this)

    val pnt = Paint()
    pnt.isAntiAlias = true

    val gradient1 = LinearGradient(
        0f,
        0f,
        0f,
        200f,
        Color.CYAN,
        Color.WHITE,
        Shader.TileMode.CLAMP
    )
    val gradient2 = LinearGradient(
        0f,
        0f,
        200f,
        0f,
        Color.WHITE,
        Color.MAGENTA,
        Shader.TileMode.CLAMP
    )
    val sat = LinearGradient(
        0f,
        0f,
        200f,
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
    canvas.drawRect(RectF(0f, 0f, 200f, 200f), pnt)
}
