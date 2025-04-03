pipeline {
    agent any
    stages {
        stage("Pull") {
            steps{
                git 'https://github.com/Shubham-Patil26/studentapp.ui.git'
                echo "pull is successful"
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
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