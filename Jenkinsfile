#!/usr/bin/env groovy

@Library('shared_Lib@master') _
node {
  stage ('checkout')
  {
     git branch: "master", url: "https://github.com/Anusha1996-stack/shared_Lib.git" 
  }                  
        
  stage('secret')
  {
    call('world')
  }
/*  stage ('Build') {
     
      sh "mvn clean package -Dmaven.test.skip=True"  
    
  }*/
}
  
          
 
    
  

