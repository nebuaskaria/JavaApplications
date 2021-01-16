pipeline{

	agent any
	environment {
		APP_VERSION = "1.0.0"
		GIT_CREDENTIALS = credentials("git_credentials")
	}
	tools {
		gradle "Gradle-6.8"
	}
	
	stages{
		stage ("build"){
			when {
		  	 	expression {
					BRANCH_NAME == "master"
				}
			}
			steps {				
				echo "Building the Java Application version : ${APP_VERSION}"
				withCredentials([usernamePassword(credentials: "git_credentials", usernameVariable: USER, passwordVariable: PWD)]){
					echo "Git Credential ${USER} and ${PWD}"
				}
				sh "gradle -v"
			}
		}
		
		stage ("test"){
			steps {
				echo "Testing the Java Application"
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
