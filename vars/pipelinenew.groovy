def call(String emaillist)
{
def datas
	node {
		datas = readYaml (file: 'jenkins.yaml') 
	}
pipeline 
{
	agent {
		node {
			label 'master'
		}
	}


stages
{
	

	stage('Checkout')
	{
		steps
		{
				
			script
			{ 

			//datas = readYaml (file: 'jenkins.yaml') 
			println " Reading jenkins.yaml file successfully"

			String git_repo = datas.sourcecode.gitrepo
    			String[] gitrepo;
    			gitrepo = git_repo.split(',') ;
    			
				for(int i = 0; i < gitrepo.size(); i++)
				{
					println gitrepo[i] 
				}

			
			}
		}
	}
	stage('Compile')
        {
                steps
                {
			println "compile running"	
		}
	}
}
}
}


