rootProject.name = "insight"
include(
    ":app",
    ":entity",
    ":usecase",
    ":repository",

    ":service:remote:retrofit-flow",
    ":service:remote:retrofit-rx",

    ":service:local:room",
    ":service:local:realm"
)