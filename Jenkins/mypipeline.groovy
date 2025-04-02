pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "building is successful"
            }
        }
        stage('Test') {
            steps {
                echo "testing is successful"
            }
        }
        stage('Deploy') {
            steps {
                echo "deployment is successful"
            }
        }
    }
}