pipeline {
    agent any
    
    tools {
        maven "maven"
    }
    
    stages {
        stage('build') {
            steps {
				git branch: 'master' , url: 'https://tools.publicis.sapient.com/bitbucket/scm/psba/training.git'
                bat 'mvn clean install package'
            }
        }
    }
}
