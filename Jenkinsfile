pipeline {
    agent any

    stages {
        stage('step 1 Git') {
            steps {
                // Get some code from a GitHub repository
                			git url: 'https://github.com/Vishwajeetdeulkar/Scientific-Calculator-Webapp-using-devops.git', branch: 'master',
                 credentialsId: 'gitcred'
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