package net.kaleidos.tuesmon.mapper

import net.kaleidos.domain.Wikilink
import net.kaleidos.tuesmon.common.DateConversions

class WikilinkMapper implements Mapper<Wikilink>, DateConversions {

    @Override
    Map map(Wikilink wikilink) {
        [
            title      : wikilink.title,
            href       : wikilink.href,
        ]
    }
}