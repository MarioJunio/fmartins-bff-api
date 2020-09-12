pipeline {
    agent any

    tools {
        maven 'maven-3'
    }

    stages {

        stage("build") {

            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage("test") {

            steps  {
                sh 'mvn test'
            }
        }

        stage("deploy") {

            steps {
                echo "Implementar deploy na AWS invocando o terraform"
            }
        }
    }
}