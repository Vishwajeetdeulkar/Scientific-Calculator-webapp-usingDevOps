pipeline {
    /* The environment specifies the credentials required to push my image to dockerhub */
    environment {
        github-credentials : 'gitcred'
    }

    agent any

    stages {
        stage('step 1 Git') {
            steps {
                // Get some code from a GitHub repository
                			git url: 'https://github.com/Vishwajeetdeulkar/Scientific-Calculator-Webapp-using-devops.git', branch: 'master',
                 credentialsId: github-credentials
            }
        }

        stage('step 2 Build maven') {
            steps {
                // Compile and package code without unit testing.
                sh "mvn -B -DskipTests clean package"
            }
        }
    }
}