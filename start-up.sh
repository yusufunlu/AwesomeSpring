/gradlew clean build -DskipTests;
docker-compose down
docker-compose build
docker-compose up -d
