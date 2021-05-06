sealed class Dimension(
    val type: String,
    val flavor: String
) {
    sealed class Remote(flavor: String) : Dimension(
        NAME,
        flavor
    ) {
        object Retrofit : Remote("retrofit")
        object Ktor : Remote("ktor")

        companion object {
            const val NAME = "remote"
        }
    }

    sealed class Local(flavor: String) : Dimension(
        NAME,
        flavor
    ) {
        object Room : Local("room")

        companion object {
            const val NAME = "local"
        }
    }

    val implement = "${flavor}Implementation"
    operator fun invoke(action: Dimension.() -> Unit) = action()
}
