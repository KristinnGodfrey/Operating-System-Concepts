## Description
This is a thread application. This means: two communicating processes
running at the same time, each having its own main method, and are thus started in two
separate Java virtual machines.

## Usage
- Open a terminal and cd to this working directory
	- compile the java file:
	javac ConnectionLessServer.java
	- run server by running the new compiled class file:
	java ConnectionLessServer.java


- Open a new terminal tab and cd to this working directory
	- compile the java file:
	javac connectionLessClient.java
	- run server by running the new compiled class file with following parameters:
	java ConnectionLessServer.java startCounter hostname nIterations
	- example of running the client:
	java ConnectionLessServer.java 4 localhost 6

	- following is a description of the given parameters:
		- startCounter: start counting from this number
		- hostname: localhost
		- nIterations: how many times we should count, starting from startCounter
