pipeline {
    agent any

    tools { 
        maven 'maven' 
        jdk 'jdk-11' 
    }

    stages {

        stage("build") {

            steps {
                sh 'java -version'
                sh 'mvn -v'

                sh 'mvn clean package'
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