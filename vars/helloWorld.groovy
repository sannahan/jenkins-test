def call(String name = 'human') {
    sh 'echo Hello ${name}'
}