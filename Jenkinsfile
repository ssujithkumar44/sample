pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'set M2_HOME=D:/L1/apache-maven-3.3.9-bin/apache-maven-3.3.9'
        bat 'set path=D:/L1/apache-maven-3.3.9-bin/apache-maven-3.3.9/bin:%path%;'
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