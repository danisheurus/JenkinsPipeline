def call(){

    def COLOR_MAP = [
    'SUCCESS': 'good',
    'ABORTED': 'warning',
    'FAILURE': 'danger'
]
    slackSend channel: 'danishjenkinstest',
                    color: COLOR_MAP[currentBuild.currentResult],
                    message: "Status : *${currentBuild.currentResult}:* \n Job name: ${env.JOB_NAME} build no. : ${env.BUILD_NUMBER} \n\n For more Information: ${env.BUILD_URL}"
}

