pipeline {
    
    environment { 
        registry = "YourDockerhubAccount/YourRepository" 
        registryCredential = 'dockerhub_id' 
        dockerImage = '' 
    }
    
    agent any
    
    tools {
        maven "maven"
        jdk "Java"
    }
    
    stages {

        stage('clone'){
            steps {
                  git branch: 'master' , url: 'https://github.com/aarsh2211/microservices-2.git'
              
        }
        }
            stage('Running Tests'){
            steps{
               script{
                   try{
                      sh "mvn test"
                    
                   }
                   catch(error){
                       throw error
                   }
               }
            }
            
        }

       stage('Building Project'){
        steps{
            script{
                 sh "mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install"
            }
        }
    }
        
        //Sonar Quality Check

        stage('quality-check'){
            steps {
                  
                script{
                  withSonarQubeEnv('SonarQube'){
                      sh "mvn sonar:sonar"
                  }
                }

            }
        }
        
        
        //Sonar Quality Gate

        stage("Quality gate") {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
        

        stage("Dockerising")
        {
            steps{
                 script{

                        docker.withRegistry('', registryCredential) { 
                        sh 'docker-compose up  --no-start'
                        sh 'docker-compose push'
                    }'
                }
         }
        }

             
    }

}
