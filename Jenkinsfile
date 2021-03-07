def dockerImage
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
        stage('Build Image'){
            steps{
                //sh 'echo Hello'
                dockerImage = docker.build("sushranthhebbar/calculator")
            }
        }
        stage('Push Image'){
            steps{
                script{
                    docker.withRegistry('https://registry.hub.docker.com/', 'system_password'){
                        dockerImage.push("${env.BUILD_NUMBER}") 
                        dockerImage.push("latest") 
                    }      
                }
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
