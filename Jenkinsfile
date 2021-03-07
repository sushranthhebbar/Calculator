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
        stage('Package'){
            steps{
                sh 'sudo docker login'
                sh 'sudo docker build -t sushranthhebbar/calculator:latest .'
                sh 'sudo docker push sushranthhebbar/calculator:latest'
            }
        }
        stage('Deliver'){
            steps {
                script {
                    step([
                        $class: "RundeckNotifier",
                        includeRundeckLogs: true,
                        rundeckInstance: "Rundeck Server",
                        jobId: "76c56f9d-5014-44af-9e15-ee25adbaa6e7",
                        shouldWaitForRundeckJob: true,
                        shouldFailTheBuild: true,
                        tailLog: true
                    ])
                }
            }
        }
    }
}