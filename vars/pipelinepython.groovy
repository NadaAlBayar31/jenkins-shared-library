def call() {
    pipeline {
        agent any

        environment {
            IMAGE_NAME = 'nadaalbayar31/python-app:v1'
        }

        stages {
            stage('Build Docker Image') {
                steps {
                    buildPythonApp(env.IMAGE_NAME)
                }
            }

            stage('Push Docker Image') {
                steps {
                    pushDockerImage(env.IMAGE_NAME)
                }
            }
        }
    }
}
