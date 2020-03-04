pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'mvn -DskipTests clean package'
      }
    }
    stage('Testing') {
      steps {
        bat 'mvn test'
      }
    }
    stage('Deployment') {
      steps {
        bat 'copy target\\sample-0.0.1-SNAPSHOT.jar D:\\jenkins'
      }
    }
  }
}