package com.blundell.amd

import com.dropbox.affectedmoduledetector.AffectedModuleConfiguration
import com.dropbox.affectedmoduledetector.AffectedModuleDetectorPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class BlundellAffectedModulesPlugin : Plugin<Project> {

    override fun apply(project: Project) = project.run {
        project.plugins.apply(AffectedModuleDetectorPlugin::class.java)
        pluginManager.withPlugin("com.dropbox.affectedmoduledetector") {
            val config = rootProject.extensions.findByType(AffectedModuleConfiguration::class.java)!!
            config.logFolder = "${project.buildDir}/amd-output"
            config.logFilename = "output.log"
            logger.lifecycle("We can now interact with the plugin programmatically (as above).")
        }
    }

}