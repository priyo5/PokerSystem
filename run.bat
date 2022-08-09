echo Building...
CALL mvn package
echo build complete. now running
cd target
java -jar PokerSystem-1.0-SNAPSHOT.jar
cd ../ 
pause