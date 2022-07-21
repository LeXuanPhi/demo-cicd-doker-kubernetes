pipeline {
    agent any
    stages {
//         stage('Clone code') {
//             steps {
//                git credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/rahulwagh/spring-boot-docker.git'
//             }
//         }
        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true clean'
            }
        }
    }
}