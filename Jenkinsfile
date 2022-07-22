pipeline {
    agent any
    tools {
            maven 'Maven 3.8.6'
        }
    stages {
//         stage('Clone code') {
//             steps {
//                git credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/rahulwagh/spring-boot-docker.git'
//             }
//         }
        stage('Build') {
             sh 'mvn -Dmaven.test.failure.ignore=true clean'
        }
    }
}