package com.github.ngarbezza.testywebstormplugin.services

import com.intellij.openapi.project.Project
import com.github.ngarbezza.testywebstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
