properties([
    parameters([
        booleanParam(defaultValue: false, description: '''Please select to the apply changes
''', name: 'terraformApply'), 
booleanParam(defaultValue: false, description: 'Please select to destroy everything', name: 'terraformDestroy'), 
booleanParam(defaultValue: false, description: 'Please select to run the job in debugMode', name: 'debugMode'),
 choice(choices: ['dev', 'qa', 'stage', 'prod'], description: 'Please select the environment', name: 'environment')
 ])
 
 ])
println("Hello World ")

