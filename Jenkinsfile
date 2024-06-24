pipeline {
    agent any

    tools {
        gradle 'Gradle' // Assuming Gradle version is configured in Jenkins Global Tool Configuration
        jdk 'JDK 11'       
    }

    environment {
        JAVA_HOME = tool name: 'JDK 11', type: 'jdk'
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/SetiaBudii/gradleautomationtest.git'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x ./gradlew' // Grant execute permission to gradlew
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                sh 'chmod +x ./gradlew' // Grant execute permission to gradlew
                sh './gradlew test'
            }
        }

        stage('Generate Report') {
            steps {
                sh 'chmod +x ./gradlew' // Grant execute permission to gradlew
                sh './gradlew generateReport'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'screenshots/*.png', allowEmptyArchive: true
            // Additional post-build actions specific to Gradle can be added here
        }
    }
}
