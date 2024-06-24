pipeline {
    agent any

    tools {
        gradle 'Gradle' // Assuming Gradle version is configured in Jenkins Global Tool Configuration
        jdk 'JDK 11'       
    }

    environment {
        JAVA_HOME = tool name: 'JDK 11', type: 'jdk'
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
        BUILD_ID = "${env.BUILD_ID ?: 'NoBuildID'}" // Ensure to enclose in double quotes
        BUILD_NAME = "${env.JOB_NAME ?: 'NoJobName'}"
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
                cucumber 'result/cucumber-report.json'
            }
        }

    }
}