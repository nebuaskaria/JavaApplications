pipeline{

	agent any
	
	tools {
		//gradle ´Gradle-6.2´
	}
	
	stages{
		stage ("build"){
			steps{
				echo "Building the Java Application"
				sh ´./gradlew -v´
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