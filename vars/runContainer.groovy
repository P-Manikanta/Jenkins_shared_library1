 def call(){
    sh "docker run -d --name youtube1 -p 3000:3000 manikanta202/youtube:latest"
}
