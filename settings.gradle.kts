rootProject.name = "insight"
include(
    ":app",
    ":entity",
    ":usecase",
    ":repository",

    ":service:remote:retrofit",
    ":service:remote:ktor",

    ":service:local:room",
    ":service:local:realm",

    ":feature:detail"
)