pipeline {
    agent any

    stages {

        stage("build") {

            tools {
                jdk "jdk-11"
            }

            steps {
                sh 'java -version'

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