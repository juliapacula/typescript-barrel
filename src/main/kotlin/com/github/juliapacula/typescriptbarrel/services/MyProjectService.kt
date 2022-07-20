package com.github.juliapacula.typescriptbarrel.services

import com.intellij.openapi.project.Project
import com.github.juliapacula.typescriptbarrel.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
