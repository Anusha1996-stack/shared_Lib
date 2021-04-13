def call(String emaillist)
{
def datas
pipeline 
{


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
