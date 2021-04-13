def call(String emaillist)
{
def datas
	node {
		script {

		datas = readYaml (file: 'jenkins.yaml')
		} 
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
			String git_branch = datas.sourcecode.gitbranch
			//String git_UserID = datas.sourcecode.gitUserID
			String sub_module = datas.sourcecode.submodule
    			String[] gitrepo;
    			gitrepo = git_repo.split(',') ;
    			
				//for(int i = 0; i < gitrepo.size(); i++)
				//{
					gitCheckout(git_repo[0], git_branch, /*git_UserID,*/ sub_module) 
				//}

			println"checkout completed"
			}
		}
	}
	stage('Compile')
        {
                steps
                {
			script{
				String[] build_tool = datas.compile.buildtool
				
				println build_tool[0]
				println "compile running"
			}	
		}
	}
}
}
}


