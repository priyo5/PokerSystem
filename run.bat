echo Building...
Call mvn package
echo build complete
echo Running...
cd target
java -jar PokerSystem-1.0-SNAPSHOT.jar
cd ../ 
pause