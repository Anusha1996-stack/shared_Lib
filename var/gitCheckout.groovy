#!/usr/bin/env groovy

def call(Map stageParams) {
	 checkout([
		$class: 'GitSCM', 
		branches: [[name: 
		stageParams.branch]],extensions: [], 
		 userRemoteConfigs: [[
		url: stageParams.url ]]
	])
}
