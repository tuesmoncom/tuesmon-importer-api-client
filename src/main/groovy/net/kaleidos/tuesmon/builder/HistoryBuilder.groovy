package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.History
import net.kaleidos.domain.Project
import net.kaleidos.tuesmon.common.DateConversions

class HistoryBuilder implements TuesmonEntityBuilder<History>, DateConversions {

    History build(Map json, Project project) {
        def history = new History()

        history.with {
            createdAt = parse(json.created_at)
            comment = json.comment
            user = new UserBuilder().build(json, project)
        }

        history
    }
}