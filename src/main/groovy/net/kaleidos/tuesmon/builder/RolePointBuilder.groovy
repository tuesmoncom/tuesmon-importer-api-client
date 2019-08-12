package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.Project
import net.kaleidos.domain.UserStory
import net.kaleidos.tuesmon.common.DateConversions
import net.kaleidos.tuesmon.common.SafeJson

class RolePointBuilder implements TuesmonEntityBuilder<UserStory.RolePoint>, DateConversions, SafeJson {

    UserStory.RolePoint build(Map json, Project project) {
        def rolePoint = new UserStory.RolePoint()

        rolePoint.with {
            role = json.role
            points = nullSafe(json.points)
        }

        rolePoint
    }
}