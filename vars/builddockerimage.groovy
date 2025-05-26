def call(imageName) {
    echo "Building Docker Image for ${imageName}"
    sh "docker build -t ${imageName} ."
}
