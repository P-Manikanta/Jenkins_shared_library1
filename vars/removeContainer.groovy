def call(){
    sh 'docker stop youtube1'
    sh 'docker rm -f youtube1'
}
