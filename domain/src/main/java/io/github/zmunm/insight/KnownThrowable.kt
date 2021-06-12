package io.github.zmunm.insight

class KnownThrowable(
    message: String,
    cause: Throwable,
) : Throwable(
    message,
    cause
)
