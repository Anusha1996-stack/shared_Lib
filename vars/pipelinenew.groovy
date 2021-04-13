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

stages
{
	stage('Checkout')
	{
		steps
		{
				
			script
			{ 

			datas = readYaml (file: 'jenkins.yaml') 
			println " Reading jenkins.yaml file successfully"

			String git_repo = datas.sourcecode.gitrepo
    			//String git_branch = datas.sourcecode.gitbranch
    			//String sub_module = datas.sourcecode.submodule
			//String relative_dir = datas.sourcecode.checkoutdirectory
   
    			String[] gitrepo;
    			//String[] gitbranch;
    			//String[] submodule;
			//String[] relativedir;
   
    			gitrepo = git_repo.split(',') ;
    			//gitbranch = git_branch.split(',');
    			//submodule = sub_module.split(',');
			//relativedir = relative_dir.split(',');
   

    			for(int i = 0; i < gitrepo.size(); i++)
			{
				println gitrepo[i]
			//gitclone( gitrepo[i], gitbranch[i], "570d9806-0dc7-4d24-a611-5dc7227f2842", submodule[i]) //relativedir[i] ) //getAt(i) ) 
			}

			}
		}
	}
}
}
}


