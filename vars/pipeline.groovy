#!/usr/bin/groovy
def call ()
{
	node {
  		stage ('checkout')
  		{
     			git branch: "master", url: "https://github.com/Anusha1996-stack/shared_Lib.git" 
  		}                  
        
  		stage('Running python script')
  		{
			echo "python call here"
  		}
	}	
}		
