/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.testFramework

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ex.ProjectManagerEx

// FIX ME WHEN BUNCH 193 REMOVED
fun ProjectManagerEx.forceCloseProjectEx(project: Project, dispose: Boolean): Boolean {
    if (!dispose) error("dispose should be true")
    return this.forceCloseProject(project)
}

// FIX ME WHEN BUNCH 193 REMOVED
typealias TestApplicationManager = com.intellij.testFramework.TestApplicationManager