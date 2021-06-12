package io.github.zmunm.insight.service

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.spec.IsolationMode

internal class ProjectConfig : AbstractProjectConfig() {
    override val isolationMode = IsolationMode.InstancePerLeaf
}
