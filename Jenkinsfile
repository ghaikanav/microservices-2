pipeline {
    agent any
    
    tools {
        maven "maven"
    }
    
    stages {
        stage('build') {
            steps {
    git branch: 'master' , url: 'https://github.com/aarsh2211/microservices-2.git'
                
sh 'mvn clean install package'
sh 'docker-compose up'    

        }
         post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        
        }

        
    }
}
