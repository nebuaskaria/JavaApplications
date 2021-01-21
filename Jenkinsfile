def gv

pipeline{

	agent any
	environment {
		APP_VERSION = "1.0.0"
		GIT_CREDENTIALS = credentials("git_credentials")
	}
	tools {
		gradle "Gradle-6.8"
	}
	parameters {
		string (name: "VERSION", defaultValue: "1.0.0", description: "Version_String")
		choice (name: "VERSIONS", choices: ["1.0.1", "1.0.2", "1.0.3"], description: "Version_Choice")
		booleanParam (name: "executeTests", defaultValue: "true", description: "executeTests")
	}
	
	stages{
		stage ("init"){
			steps{
				script{
					gv = load "script.groovy"
					git "https://github.com/nebuaskaria/JavaApplications.git"
				}
			}
		}
		stage ("build"){
			when {
		  	 	expression {
					BRANCH_NAME == "master"
				}
			}
			steps {				
				echo "Building the Java Application version : ${APP_VERSION}"
				withCredentials([
					usernamePassword(credentialsId: "git_credentials", 
							 usernameVariable: "USER_NAME", 
							 passwordVariable: "PASSWORD")]){
					echo "Git Credential ${USER_NAME} and ${PASSWORD}"
				}
				sh "gradle -v"
				
				//To make the Jenkinsfile Clean and Simple
				script{
					gv.buildAppWithScript()
				}				
			}
		}
		
		stage ("test"){
			when {
				expression {
					params.executeTests
				}			
			}
			steps {
				echo "Testing the Java Application: Condition is : ${params.executeTests}"
				
				//Groovy Script can access the environmental variables of Jenkins
				script {
					gv.testAppWithScript()
				}
			}
		}
		
		stage ("deploy"){
			steps {
				echo "Deploying the Java Application"
			}
		}
	}
	post {
		always {
			echo "POST - ALL STAGES ARE OVER"					   
		}
		success {
			echo "POST - Build was successful, Sending Success Mails"
		}
		failure {
			echo "POST - Build has failed, Sending Failure Mails"
		}
	}
}  
