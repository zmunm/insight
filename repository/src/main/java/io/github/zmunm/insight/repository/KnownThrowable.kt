package io.github.zmunm.insight.repository

class KnownThrowable(
    message: String,
    cause: Throwable,
) : Throwable(
    message,
    cause
)
