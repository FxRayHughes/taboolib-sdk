package io.github.username.project

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info

object ExamplePlugin : Plugin() {

    override fun onEnable() {
        info("已成功运行 ExamplePlugin!")
    }
}
