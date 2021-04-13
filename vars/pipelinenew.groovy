def call(String emaillist)
{
def datas
pipeline 
{
	agent {
		node {
			none
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
