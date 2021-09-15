package com.github.dot888.firstideaplugin.services

import com.intellij.openapi.project.Project
import com.github.dot888.firstideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
