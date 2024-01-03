def call(Map config = [:]) {
  sh "echo Hello ${config.name}, TOday is ${config.dayOfweek}"
}
