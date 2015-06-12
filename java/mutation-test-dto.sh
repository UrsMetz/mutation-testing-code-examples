mvn clean test-compile org.pitest:pitest-maven:mutationCoverage -DtargetClasses=mutation.testing.examples.dto.creator* -DtargetTests=mutation.testing.examples.dto.creator* && ./finished.sh
