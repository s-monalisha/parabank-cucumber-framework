pipeline {

    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/username/parabank-cucumber-framework.git'
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Automation Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: 'reports/**', fingerprint: true
            }
        }

    }

    post {

        always {
            echo 'Pipeline execution finished'
        }

        success {
            echo 'Automation tests passed'
        }

        failure {
            echo 'Automation tests failed'
        }

    }
}
