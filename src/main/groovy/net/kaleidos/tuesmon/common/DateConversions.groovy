package net.kaleidos.tuesmon.common

trait DateConversions {

    final String TUESMON_FULLDATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ"
    final String TUESMON_DATE_FORMAT = "yyyy-MM-dd"

    Date parse(String stringDate) {
        stringDate ? Date.parse(TUESMON_FULLDATE_FORMAT, stringDate) : null
    }

    Date parse(String stringDate, String format) {
        stringDate ? Date.parse(format, stringDate) : null
    }

    String format(Date date) {
        date?.format(TUESMON_FULLDATE_FORMAT)
    }

    String format(Date date, String format) {
        date?.format(format)
    }
}