def call(String emaillist)
{
def datas
pipeline 
{
	agent {
		node {
			label 'master'
		}
	}
node {
	datas = readYaml (file: 'jenkins.yaml') 
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

			String build_tool = datas.compile.buildtool
			println build_tool	
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


