package net.kaleidos.tuesmon.testdata

import net.kaleidos.domain.Project
import net.kaleidos.tuesmon.TuesmonClient

trait TuesmonTestData implements ProjectData, IssueData, UserStoryData,
    AttachmentData, MembershipData, HistoryData, UserData, WikipageData,
    WikilinkData, TaskData, MilestoneData {

    TuesmonClient tuesmonClient

    TuesmonClient createAuthenticatedTuesmonClient() {
        def config = new ConfigSlurper().parse(new File('src/test/resources/tuesmon.groovy').text)
        def client = new TuesmonClient(config.host)

        return client.authenticate(config.user, config.passwd)
    }

    Project createProject() {
        tuesmonClient.createProject(buildProject())
    }

    void deleteProject(Project project) {
        tuesmonClient.deleteProject(project)
    }
}