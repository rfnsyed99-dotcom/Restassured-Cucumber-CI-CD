pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Clean Workspace') {
            steps {
                deleteDir()
            }
        }

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Run API Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            script {
                def reportPath = 'target/cucumber-report.html'
                if (fileExists(reportPath)) {
                    publishHTML([
                        allowMissing: false,
                        keepAll: true,
                        reportDir: 'target',
                        reportFiles: 'cucumber-report.html',
                        reportName: 'Cucumber API Test Report'
                    ])
                } else {
                    echo "Report not found at ${reportPath}. Skipping publishHTML."
                }
            }
        }
    }
}