package com.github.viclovsky.swagger.coverage;

public final class SwaggerCoverageConstants {

    public static final String BODY_PARAM_NAME = "body";
    public static final String COVERAGE_HTML_REPORT_NAME = "swagger-coverage-report.html";
    public static final String COVERAGE_RESULTS_NAME = "swagger-coverage-results.json";

    public static final String OUTPUT_DIRECTORY = "swagger-coverage-output";
    public static final String COVERAGE_OUTPUT_FILE_SUFFIX = "-coverage.json";

    private SwaggerCoverageConstants() {
        throw new IllegalStateException("Do not instance");
    }

}
