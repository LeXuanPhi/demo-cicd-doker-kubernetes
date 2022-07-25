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
            steps {
                sh 'docker version'
                sh 'docker build -t demo-cicd-docker-kubernetes .'
                sh 'docker image list'
                sh 'docker tag demo-cicd-docker-kubernetes lexuanphi/demo-cicd-docker-kubernetes:latest'
            }
        }
        stage("login"){
            steps{
                withCredentials([string(credentialsId: 'DOCKER_ID', variable: 'PASSWORD')]) {
                        sh 'docker login -u lexuanphi -p $PASSWORD'
                        sh 'docker push  lexuanphi/demo-cicd-docker-kubernetes:latest'
                }
            }
        }
        stage("ssh Server"){
            steps{
//                 sshagent(['CONNECT_SERVER_KUBERNETES']) {
//                         sh 'ssh -o StrictHostKeyChecking=no -l ec2-user 3.86.230.238'
//                         sh 'sshPut remote: remote, from: 'k8s-spring-boot-deployment.yml', into: '.' '
//                 }
               // sshPublisher(publishers: [sshPublisherDesc(configName: 'KUBERNETES_SERVER', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: 'k8s-spring-boot-deployment.yml')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
          sshPublisher(publishers: [sshPublisherDesc(configName: 'KUBERNETES_SERVER', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: 'sshCommand remote: remote, command: "kubectl apply -f k8s-spring-boot-deployment.yml"', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: 'k8s-spring-boot-deployment.yml')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
            }
            //docker run -itd --rm -p 8080:8080 lexuanphi/demo-cicd-docker-kubernetes:latest

       }

    }
}