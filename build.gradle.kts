import io.izzel.taboolib.gradle.*
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    java
    id("io.izzel.taboolib") version "2.0.27"
    kotlin("jvm") version "2.2.20"
}

taboolib {
    env {
        // 安装模块
        install(Basic, Bukkit, BukkitHook, BukkitNMSUtil)
        install(BukkitUI)           // UI界面
        install(Database)           // 数据库
        install(Kether)             // 条件判断
        install(CommandHelper)      // 命令系统
    }
    version {
        taboolib = "6.2.3-664550e"
        coroutines = "1.8.1"
    }
    // relocate("top.maplex.arim","top.maplex.youerproject.arim") 工具库重定向
}

repositories {
    mavenCentral()
    maven {
        // 枫溪的仓库
        url = uri("https://nexus.maplex.top/repository/maven-public/")
        isAllowInsecureProtocol = true
    }
}

dependencies {
    compileOnly("ink.ptms.core:v12004:12004:mapped")
    compileOnly("ink.ptms.core:v12004:12004:universal")
    compileOnly(kotlin("stdlib"))
    compileOnly(fileTree("libs"))
    compileOnly("com.google.code.gson:gson:2.8.8")
    // taboo("top.maplex.arim:Arim:1.3.2") 小工具库
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.fromTarget("1.8")
    }
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
