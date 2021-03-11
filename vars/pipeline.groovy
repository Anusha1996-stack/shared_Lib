#!/usr/bin/groovy

pipeline
{
	stages
	{
		stage('checkout')
		{
			steps
			{
				git branch: "master", url: "https://github.com/Anusha1996-stack/shared_Lib.git"
			}
		}
	}
}
				
