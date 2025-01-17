pipeline{
    agent any
        tools{
            maven 'Maven'

        }
        stages{
            stage("Creating the Maven Build "){
                steps{
                    checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/saimadala187/JenkinsFirstProject']])
                    bat 'mvn clean install'
                }
        }
        stage("Building the docker Image"){
            steps{
                script{
                    bat "docker build -t saikumar835/app ."
                }
            }
        }
        stage("Deploying the Image to Docker Hub"){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dckpwd', variable: 'DockerHubPwd')]) {
                    bat "docker login -u saikumar835 -p ${DockerHubPwd}"
                    bat "docker push saikumar835/app"
}
                }
            }
        }
    }

}