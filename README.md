POC of middleware project


#Technologies
- Project built with Maven (https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- 
- Communication over HTTP / ZeroMQ

# First example is just a Echo Client / Server 
For a baseline understanding of communication inbetween client and server
Do the following to try it out:
1. Run Portscanner class once -> see no server at port 7
2. Start EchoServer 
3. Run Portscanner again -> see a server at port 7 (this is the EchoServer)
4. Start EchoClient
5. Type something in the console -> see the same thing getting returned from the server in the console

