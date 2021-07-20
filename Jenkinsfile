pipeline {
    
    environment { 
        registry = "YourDockerhubAccount/YourRepository" 
        registryCredential = 'docker_id' 
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
                  git branch: 'patch-1' , url: 'https://github.com/ghaikanav/microservices-2.git'
              
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
                 sh "mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -DskipTests=true"
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
        

        stage("Dockerising and pushing")
        {
            steps{
                 script{

                        docker.withRegistry('', registryCredential) { 
                        sh 'docker-compose up --no-start && docker-compose rm -fsv'
                        sh 'docker-compose push'
                    }
                }
         }
        }

             
    }

}
