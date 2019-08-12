package net.kaleidos.tuesmon.mapper

import net.kaleidos.domain.Milestone
import net.kaleidos.tuesmon.common.DateConversions

class MilestoneMapper implements Mapper<Milestone>, DateConversions {

    @Override
    Map map(Milestone milestone) {
        [
            name            : milestone.name,
            closed          : milestone.isClosed,
            estimated_start : format(milestone.startDate, TUESMON_DATE_FORMAT),
            estimated_finish: format(milestone.endDate, TUESMON_DATE_FORMAT),
        ]
    }
}