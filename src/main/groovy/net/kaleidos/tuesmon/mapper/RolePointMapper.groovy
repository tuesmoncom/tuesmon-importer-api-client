package net.kaleidos.tuesmon.mapper

import net.kaleidos.domain.UserStory
import net.kaleidos.tuesmon.common.DateConversions

class RolePointMapper implements Mapper<UserStory.RolePoint>, DateConversions {

    @Override
    Map map(UserStory.RolePoint rolePoint) {
        [
            role  : rolePoint.role,
            points: rolePoint.points
        ]
    }
}