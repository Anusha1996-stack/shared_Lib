@Library('shared_Lib@master') _

node {
  stage ('checkout')
  {
     git branch: "master", url: "https://github.com/Anusha1996-stack/shared_Lib.git" 
  }                  
        
  stage('Running python script')
  {
   sh '''
   #!bin/sh
   echo "executing python script"
   '''
   /* " ''' +python_exec_path+'''" -m venv "'''+venv+'''"&&"'''+venv+'''\\vars\\signintool.py
   '''*/
  }
}

/*  stage ('Build') {
     
      sh "mvn clean package -Dmaven.test.skip=True"  
    
  }*/
  

