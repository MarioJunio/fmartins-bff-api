pipeline {
    agent any

    stages {

        stage("build") {

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