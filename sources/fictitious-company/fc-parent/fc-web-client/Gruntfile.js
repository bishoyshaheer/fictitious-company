module.exports = function(grunt) {
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.initConfig({
        jshint: {
            files: ['Gruntfile.js', 'src/main/resources/javascript/*.js','src/test/resources/javascript/*.js']
        }
    });
    grunt.registerTask('default', ['jshint']);
};