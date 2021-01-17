def buildAppWithScript(){
	echo "Building the application with Groovy Script"
}

//Groovy Script can access the environmental variables of Jenkins
def testAppWithScript(){
  echo "Testing the Application version : ${VERSION}"
}

return this
