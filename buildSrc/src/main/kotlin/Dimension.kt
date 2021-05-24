sealed class Dimension(
    val type: String,
    val flavor: String
) {
    sealed class Service(flavor: String) : Dimension(
        NAME,
        flavor
    ) {
        object Retrofit : Service("retrofit")
        object Volley : Service("volley")
        object Ktor : Service("ktor")

        companion object {
            const val NAME = "service"
        }
    }

    sealed class Cache(flavor: String) : Dimension(
        NAME,
        flavor
    ) {
        object Room : Cache("room")
        object Realm : Cache("realm")

        companion object {
            const val NAME = "cache"
        }
    }

    val implement = "${flavor}Implementation"
    operator fun invoke(action: Dimension.() -> Unit) = action()
}
