pipeline{
    agent any
    environment{
	    PASSWORD = credentials('system_password')
	}
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
                sh 'echo Hello'
                sh 'echo $PASSWORD_PSW | sudo -S ./package.sh'
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
