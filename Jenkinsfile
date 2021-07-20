pipeline {
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

        stage('Analysing Coverage'){
            steps{
                script{

                    withSonarQubeEnv('SonarQube'){
                       sh "mvn sonar:sonar"

                    }
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

                        sh 'docker login -u akshit2707 -p Akshit619$$$'
                }
         }
        }



    
        stage("Calling docker compose file")
        {
            steps{
                 script{

                          sh 'docker-compose up  --no-start'
                }
         }
        }
             
    }

}
