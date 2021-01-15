pipeline{

	agent any
	
	tools {
		gradle "Gradle-6.8"
	}
	
	stages{
		stage ("build"){
			steps{
				echo "Building the Java Application"
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
