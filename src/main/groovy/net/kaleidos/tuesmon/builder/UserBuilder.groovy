package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.Project
import net.kaleidos.domain.User

class UserBuilder implements TuesmonEntityBuilder<User> {

    User build(Map json, Project project) {
        def user = new User()

        user.with {
            email = json.user[0]
            name = json.user[1]
        }

        user
    }
}