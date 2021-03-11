
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
    println "hello" */
    evaluate(new File("./vars/signintool.groovy"))
  }
}

/*  stage ('Build') {
     
      sh "mvn clean package -Dmaven.test.skip=True"  
    
  }*/
  

