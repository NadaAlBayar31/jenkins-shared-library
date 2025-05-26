def call(imageName) {
    echo "Pushing Docker image ${imageName}"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-access', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh '''
            echo $DOCKER_PASSWORD | docker login -u $DOCKER_USER --password-stdin
        '''
        sh "docker push ${imageName}"
    }
}

