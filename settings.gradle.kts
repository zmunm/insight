rootProject.name = "insight"
include(
    ":app",
    ":domain",
    ":repository",

    ":service:verifier",
    ":service:retrofit",
    ":service:volley",
    ":service:ktor",

    ":cache:verifier",
    ":cache:room",
    ":cache:realm",
    ":cache:sqldelight"
)