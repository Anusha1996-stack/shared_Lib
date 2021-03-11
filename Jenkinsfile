
@Library('shared_Lib@master')_
/*import myfile.signintool */

node {
  stage ('checkout')
  {
     git branch: "master", url: "https://github.com/Anusha1996-stack/shared_Lib.git" 
  }                  
        
  stage('Running python script')
  {
  /* t = new signintool()
   python_call ()
    println "hello" 
    evaluate(new File("./vars/signintool.groovy"))*/
    sh 'python -u C:\Windows\system32\config\systemprofile\AppData\Local\Jenkins\.jenkins\workspace\shared_lib_demo\myfile\f1.py'
  }
}

/*  stage ('Build') {
     
      sh "mvn clean package -Dmaven.test.skip=True"  
    
  }*/
  

