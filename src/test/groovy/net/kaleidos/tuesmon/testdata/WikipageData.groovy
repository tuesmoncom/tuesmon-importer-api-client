package net.kaleidos.tuesmon.testdata

import net.kaleidos.domain.Project
import net.kaleidos.domain.Wikipage

trait WikipageData {

    Wikipage buildBasicWikipage(Project project) {
        // tag::createWikipage[]
        new Wikipage()
            .setProject(project)
            .setSlug('home')
            .setContent('Lorem ipsum...')
        // end::createWikipage[]
    }

}