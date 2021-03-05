pipeline{
    agent any
    stages{
        stage('Compile'){
            steps{
                sh 'mvn compile'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Deliver'){
            steps{
                sh 'chmod +x delivery.sh'
                sh './delivery.sh'
            }
        }
    }
}