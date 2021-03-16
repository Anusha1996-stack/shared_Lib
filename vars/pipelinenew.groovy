java.lang.ProcessImpl.waitfor()

def call() 
{
  node {
	stage('python running')
	{
		def task = "python myfile/p1.py".execute()
	task.waitFor()
	println task.txt	
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