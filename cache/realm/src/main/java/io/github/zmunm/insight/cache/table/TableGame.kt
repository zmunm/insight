package io.github.zmunm.insight.cache.table

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.Date

internal open class TableGame(
    @PrimaryKey var id: Int = 0,
    var name: String = "",
    var backgroundImage: String = "",
    var addedAt: Date = Date(),
) : RealmObject()
