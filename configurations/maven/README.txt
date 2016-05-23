settings.xml is maven seting is to be used under {user_home}/.m2/settings.xml
	* username and password should be replaced wi an oracle username and password 
	that have been user to accept @ following link
		https://www.oracle.com/webapps/maven/register/license.html
		
settings-security.xml is to hold global maven password

wagon-http-2.8-shaded.jar ( http://central.maven.org/maven2/org/apache/maven/wagon/wagon-http/2.8/wagon-http-2.8-shaded.jar )
is to be added to maven installation under 
{maven installation folder for instance "C:\Program Files\apache-maven-3.3.9"}\lib\ext

Maven 3.1.n or later should be used

command line "mvn install" command should be used as the previous lib is part of command line maven not eclipse maven