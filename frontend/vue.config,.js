module.exports = {
    outputDir: "../src/main/resources/static",  //빌드 결과물의 경로 
    devServer: {
        proxy: {
            '/api': {
                // '/api' 로 들어오면 포트 8081(스프링 서버)로 보낸다
                target: 'http://localhost:8081',
                changeOrigin: true // cross origin 허용
            }
        }
    }
};