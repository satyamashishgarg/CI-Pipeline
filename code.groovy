pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your/repository.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'docker build -t your_image_name .'
            }
        }
        
        stage('Test') {
            steps {
                sh 'docker run your_image_name npm test'
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'docker push your_image_name'
                // Additional deployment steps can be added here
            }
        }
    }
}
