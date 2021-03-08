

def call(Map stageParams) {
/*	 checkout([
		$class: 'GitSCM', 
		branches: [[name: 
		stageParams.branch]],extensions: [], 
		 userRemoteConfigs: [[
		url: stageParams.url ]]
	]) 
*/	
	checkout([
		$class: 'GitSCM', 
		branches: [[name: stageParams.branch]], 
		extensions: [], userRemoteConfigs: 
		[[credentialsId: 'f.anusha@globaledgesoft.com', 
		  url: stageParams.url ]]
	])
}
