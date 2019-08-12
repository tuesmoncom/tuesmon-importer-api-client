package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.Project
import net.kaleidos.domain.Wikilink

class WikilinkBuilder implements TuesmonEntityBuilder<Wikilink> {

    Wikilink build(Map json, Project project) {
        def wikilink = new Wikilink()

        wikilink.with {
            delegate.project = project
            title = json.title
            href = json.href
        }

        wikilink
    }
}