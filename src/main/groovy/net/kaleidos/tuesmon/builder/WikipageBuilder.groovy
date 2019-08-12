package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.Project
import net.kaleidos.domain.Wikipage
import net.kaleidos.tuesmon.common.DateConversions

class WikipageBuilder implements TuesmonEntityBuilder<Wikipage>, DateConversions {

    Wikipage build(Map json, Project project) {
        def wikipage = new Wikipage()

        wikipage.with {
            delegate.project = project
            slug = json.slug
            content = json.content
            createdDate = parse(json.created_date)
            owner = json.owner
            attachments = json.attachments.collect { new AttachmentBuilder().build(it, project) }
        }

        wikipage
    }
}