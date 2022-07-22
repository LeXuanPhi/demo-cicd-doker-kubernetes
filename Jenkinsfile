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
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true clean install'
            }
        }

        stage("Docker build"){
                sh 'docker version'
                sh 'docker build -t demo-cicd-docker-kubernetes .'
                sh 'docker image list'
                sh 'docker tag demo-cicd-docker-kubernetes lexuanphi/demo-cicd-docker-kubernetes:demo-cicd-docker-kubernetes'
            }
        //DOCKER_ID
    }
}