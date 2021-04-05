/*java.lang.ProcessImpl.waitfor()*/

def call() 
{
	 stash 'jenkins.yaml, vars'
	
  node {
	unstash 'jenkins.yaml, vars'
	def datas = readYaml file:'Jenkins.yml'
	stage('git checkout')
	{
		println"checkout.......... "

		
		gitclone( gitrepo[i], gitbranch[i],"f52a7452-5c1d-2220-4a97-676f-6bd6-5a6492ae0e36", submodule[i]) //relativedir[i] ) //getAt(i) ) 
		println"checkout completed.........."	
	}
	}      
}















/*
node {
  stage ('checkout')
  {
     git branch: "master", url: "https://github.com/Anusha1996-stack/shared_Lib.git" 
  }                  
        
  stage('Running python script')
  {
  	  
	def task = "python myfile/p1.py".execute()
	task.waitfor()
	println task.txt
  }
}*/
