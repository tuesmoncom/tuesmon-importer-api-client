package net.kaleidos.tuesmon.mapper

import net.kaleidos.domain.Attachment
import net.kaleidos.tuesmon.common.DateConversions

class AttachmentMapper implements Mapper<Attachment>, DateConversions {

    @Override
    Map map(Attachment attachment) {
        [
            attached_file: [
                name: attachment.name,
                data: attachment.data,
            ],
            owner: attachment.owner,
            created_date: format(attachment.createdDate),
            description: attachment.description,
        ]
    }
}