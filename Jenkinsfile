#!/usr/bin/env groovy

@Library('shared_Lib@master') _
pipeline {
  agent any {
    
    stages {
      stage ('checkout') {
        steps {
            gitCheckout(
                    branch: "master",
                    url: "https://github.com/Anusha1996-stack/shared_Lib.git"
                    )
        }
      }
    }
    stages {
      stage ('Build') {
        steps {
          Build()
        }
      }
    }
    
  }
}
