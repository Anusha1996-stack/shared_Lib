
pipeline 
{
	agent any
	
	stages
	{
		stage('Parallel') {
			script{
				parallel 
				(
					"private": { echo "private"},
					"public": {echo "public"}
					)
			}
		}
	}



















/*node {
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
