pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Checkout Code') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/rfnsyed99-dotcom/Restassured-Cucumber-CI-CD.git',
                        credentialsId: 'github-pat'
                    ]]
                ])
            }
        }

        stage('Run API Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            publishHTML([
                allowMissing: true,
                keepAll: true,
                reportDir: 'target',
                reportFiles: 'cucumber-report.html',
                reportName: 'Cucumber API Test Report'
            ])
        }
    }
}