Jenkinsfile (Declarative Pipeline)

/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'maven:3.8.1' } }
    stages {
        stage('build') {
            steps {
                sh './mvnw spring-boot:run'
            }
        }
    }
}

