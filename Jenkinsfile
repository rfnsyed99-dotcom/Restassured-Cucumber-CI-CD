pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/<your-username>/Restassured-Cucumber-CI-CD.git'
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
