// vars/buildpythonapp.groovy
def call(){
    echo "building python app"
    sh '''
      python -m venv venv
      . venv/bin/activate
      pip install -r requirements.txt
    '''
}
