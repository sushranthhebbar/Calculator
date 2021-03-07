def IMAGE
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
                script{
                    IMAGE = docker.build("sushranthhebbar/calculator")
                }
                //sh 'echo Hello'
            }
        }
        stage('Push Image'){
            steps{
                script{
                    docker.withRegistry('https://registry.hub.docker.com/', 'system_password'){
                        IMAGE.push("${env.BUILD_NUMBER}") 
                        IMAGE.push("latest") 
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
