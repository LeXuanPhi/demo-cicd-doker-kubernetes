pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               git credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/rahulwagh/spring-boot-docker.git'
            }
        }
    }
}