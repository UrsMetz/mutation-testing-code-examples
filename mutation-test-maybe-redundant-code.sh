mvn clean test-compile org.pitest:pitest-maven:mutationCoverage -DtargetClasses=mutation.testing.examples.maybe.redundantcode* -DtargetTests=mutation.testing.examples.maybe.redundantcode* && notify-send "mvn fertig"
