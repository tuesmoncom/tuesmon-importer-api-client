package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.Milestone
import net.kaleidos.domain.Project
import net.kaleidos.tuesmon.common.DateConversions

class MilestoneBuilder implements TuesmonEntityBuilder<Milestone>, DateConversions {

    Milestone build(Map json, Project project) {
        def milestone = new Milestone()

        milestone.with {
            name = json.name
            isClosed = json.closed
            delegate.project = project
            startDate = parse(json.estimated_start, TUESMON_DATE_FORMAT)
            endDate = parse(json.estimated_finish, TUESMON_DATE_FORMAT)
        }

        milestone
    }
}