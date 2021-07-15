pipeline {
    agent any
    
    tools {
        maven "maven"
    }
    
    stages {
        stage('build') {
            steps {
				git branch: 'master' , url: 'https://github.com/aarsh2211/microservices-2.git'
                bat 'mvn clean install package'
            }
        }
    }
}
