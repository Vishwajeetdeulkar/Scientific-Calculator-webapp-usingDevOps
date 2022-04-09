pipeline {

    /* The environment specifies the credentials required to push my image to dockerhub */
    environment {
        registry = "vishwajeet1321/scientific-calculator-webapp-devops"
        registryCredential = 'docker-cred'
        dockerImage = ''
    }
    agent any

    stages {
        stage('stage 1 Git') {
            steps {
                // Get some code from a GitHub repository
                			git url: 'https://github.com/Vishwajeetdeulkar/Scientific-Calculator-Webapp-using-devops.git', branch: 'master',
                 credentialsId: 'gitcred'
            }
        }

        stage('stage 2 Build maven') {
            steps {
                // Compile and package code without unit testing.
                sh "mvn -B -DskipTests clean package"
            }
        }
        stage('stage 3 Test') {
            steps {
                // Unit testing on compiled source code.
                sh "mvn test"
            }
        }
        stage('stage 4 Building docker image') {
            steps{
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
        stage('step 5 Push docker image to dockerhub') {
            steps{
                script {
                    docker.withRegistry( '', registryCredential ) {
                    dockerImage.push()
                    }
                }
            }
        }


    }
}