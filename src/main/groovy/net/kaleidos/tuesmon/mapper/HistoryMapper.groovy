package net.kaleidos.tuesmon.mapper

import net.kaleidos.domain.History
import net.kaleidos.tuesmon.common.DateConversions

class HistoryMapper implements Mapper<History>, DateConversions {

    @Override
    Map map(History history) {
        [
            user      : [history.user.email, history.user.name],
            created_at: format(history.createdAt),
            type      : 1,
            comment   : history.comment,
        ]
    }
}