pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t order-service1:latest .'
            }
        }

        stage('Deploy To Kubernetes') {
            steps {
                bat 'kubectl apply -f k8s/'
            }
        }
    }
}