pipeline {
    agent any

    tools {
        // Assuming Gradle version is specified in your Jenkins Global Tool Configuration
        gradle 'Gradle' 
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
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Generate Report') {
            steps {
                // Assuming you have a task in your Gradle build to generate a report
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
