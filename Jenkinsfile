pipeline {
    agent any

    tools {
        maven 'maven-3'
    }

    stages {

        stage("build") {

            steps {
                sh 'mvn --version'
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