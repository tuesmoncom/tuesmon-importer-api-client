package net.kaleidos.tuesmon

import spock.lang.Specification

class TuesmonClientSpec extends Specification {

    TuesmonClient tuesmonClient
    ConfigObject config

    def setup() {
        config = new ConfigSlurper().parse(new File('src/test/resources/tuesmon.groovy').text)
        tuesmonClient = new TuesmonClient(config.host)
    }

    void 'authenticate a user'() {
        when: 'a user tries to login'
            tuesmonClient.authenticate(config.user, config.passwd)

        then: 'the authorization header is set in the client'
            tuesmonClient.client.httpClient.defaultHeaders.Authorization.contains('Bearer')
            !tuesmonClient.client.httpClient.defaultHeaders.Authorization.contains('Bearer null')
    }
}