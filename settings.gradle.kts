rootProject.name = "insight"
include(
    ":app",
    ":entity",
    ":usecase",
    ":repository",

    ":service:remote:verifier",
    ":service:remote:retrofit",
    ":service:remote:volley",
    ":service:remote:ktor",

    ":service:local:verifier",
    ":service:local:room",
    ":service:local:realm"
)