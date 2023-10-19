def call() {
    sh 'trivy image manikanta202/youtube:latest > trivyimage.txt'
}