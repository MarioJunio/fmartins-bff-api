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
                echo "Fazendo test do projeto..."
            }
        }

        stage("deploy") {

            steps {
                echo "Realizando deploy na aws..."
            }
        }
    }
}