#def call(Map config = [:]) {
#    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
#}

def call(String name, String dayOfWeek) {
    sh "echo Hello ${name}. Today is ${dayOfWeek}."
}
