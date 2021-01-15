pipeline{

	agent any
	
	tools {
		Gradle "6.8"
	}
	
	stages{
		stage ("build"){
			steps{
				echo "Building the Java Application"
				//sh ´./gradlew -v´
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
}  
