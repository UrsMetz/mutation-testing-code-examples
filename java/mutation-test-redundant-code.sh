mvn clean test-compile org.pitest:pitest-maven:mutationCoverage -DtargetClasses=mutation.testing.examples.redundantcode* -DtargetTests=mutation.testing.examples.redundantcode* && ./finished.sh
