package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_1.vcs.GitVcsRoot

object GitHubEclipseBuildship : GitVcsRoot({
    name = "Buildship"
    url = "https://gradlewaregitbot@github.com/eclipse/buildship.git"
    branchSpec = "+:refs/heads/*"
    userForTags = "Gradleware GitHubEclipseBuildship Bot <gradlewaregitbot@gradleware.com>"
    agentGitPath = "%env.TEAMCITY_GIT_PATH%"
    agentCleanFilesPolicy = GitVcsRoot.AgentCleanFilesPolicy.NON_IGNORED_ONLY
    useMirrors = false
    authMethod = password {
        userName = "gradlewaregitbot"
        password = "credentialsJSON:4da2f871-8c1f-40d7-a147-860ebfae275e"
    }
})