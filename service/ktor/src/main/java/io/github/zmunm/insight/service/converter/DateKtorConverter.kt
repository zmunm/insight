package io.github.zmunm.insight.service.converter

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateKtorConverter : KSerializer<Date> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        "Date",
        PrimitiveKind.STRING
    )
    private val dateFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.ROOT)

    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeString(dateFormat.format(value))
    }
    override fun deserialize(decoder: Decoder): Date = dateFormat.parse(decoder.decodeString())
        ?: error("fail format ${decoder.decodeString()}")
}
