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
			//cleanWs()	
			script
			{ 

			datas = readYaml (file: 'jenkins.yaml') 
			println " Reading jenkins.yaml file successfully"

			
			}
			
			
		}
	
	}
}
}
}
