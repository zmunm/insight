package io.github.zmunm.insight.cache.table

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

internal open class TableLike(
    @PrimaryKey var id: Long = 0,
    var like: Boolean = false,
) : RealmObject()
