def call() {
    echo "Building Python virtual environment and installing dependencies..."
    sh '''
        python3 -m venv venv
        . venv/bin/activate
        pip install -r requirements.txt
    '''
}

