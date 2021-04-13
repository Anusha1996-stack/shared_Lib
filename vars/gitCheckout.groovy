

/*def call(Map stageParams) {
	 checkout([
		$class: 'GitSCM', 
		branches: [[name: 
		stageParams.branch]],extensions: [], 
		 userRemoteConfigs: [[
		url: stageParams.url ]]
	]) 
	
	
checkout([
		$class: 'GitSCM', 
		branches: [[name: stageParams.branch]], 
		extensions: [], userRemoteConfigs: 
		[[credentialsId: 'f.anusha@globaledgesoft.com', 
		  url: stageParams.url ]]
	])
*/

def call(String gitURLString, String branchID, /*String gitUserID,*/ String submodule) //String clonedir)
{
	dir(branchID)
	{
            checkout([
            $class: 'GitSCM',
            branches: [[name: branchID]],
            doGenerateSubmoduleConfigurations: false,
	    //[[$class: 'RelativeTargetDirectory', relativeTargetDir: clonedir]
            extensions: [ [$class: 'CloneOption', timeout: 120, depth: 1, noTags: false, reference: '', shallow: true], [$class: 'SubmoduleOption', recursiveSubmodules: submodule], [$class: 'CleanBeforeCheckout'], [$class: 'CleanCheckout']],
            submoduleCfg: [],
            userRemoteConfigs: [[credentialsId: gitUserID, url: gitURLString]]
            ])
	 }

}	

