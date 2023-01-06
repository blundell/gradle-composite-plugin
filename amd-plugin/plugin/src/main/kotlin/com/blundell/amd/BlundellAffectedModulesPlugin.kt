package com.blundell.amd

import org.gradle.api.Plugin
import org.gradle.api.Project

class BlundellAffectedModulesPlugin : Plugin<Project> {

    override fun apply(project: Project) = project.run {
        println("Initial setup does nothing")
    }

}