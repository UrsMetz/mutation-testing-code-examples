mvn clean test-compile org.pitest:pitest-maven:mutationCoverage -DtargetClasses=mutation.testing.examples.order.processor* -DtargetTests=mutation.testing.examples.order.processor* && ./finished.sh
