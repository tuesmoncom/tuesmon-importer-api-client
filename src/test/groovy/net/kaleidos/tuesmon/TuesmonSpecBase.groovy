package net.kaleidos.tuesmon

import net.kaleidos.tuesmon.testdata.TuesmonTestData
import spock.lang.Specification

class TuesmonSpecBase extends Specification implements TuesmonTestData {

    def setup() {
        tuesmonClient = createAuthenticatedTuesmonClient()
    }

}