package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.Project

interface TuesmonEntityBuilder<T> {

    T build(Map json, Project project)

}