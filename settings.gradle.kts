rootProject.name = "insight"
include(
    ":app",
    ":entity",
    ":usecase",
    ":repository",

    ":service:remote:verifier",
    ":service:remote:retrofit",
    ":service:remote:ktor",

    ":service:local:verifier",
    ":service:local:room",
    ":service:local:realm"
)