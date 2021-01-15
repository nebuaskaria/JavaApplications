pipeline{

	agent any
	
	tools {
		gradle "Gradle-6.8"
	}
	
	stages{
		stage ("Nebu"){
			steps{
				echo "Building the Java Application"
				sh "gradle -v"
			}
		}
		
		stage ("Molu"){
			steps {
				echo "Testing the Java Application"
			}
		}
		
		stage ("Vava"){
			steps {
				echo "Deploying the Java Application"
			}
		}
	}
}  
