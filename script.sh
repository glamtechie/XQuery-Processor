#!/bin/bash
#cd /usr/local/lib
        #curl -O http://www.antlr.org/download/antlr-4.5-complete.jar
        #cd -
        export CLASSPATH=".:/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH"
        #antlr4='java -jar /usr/local/lib/antlr-4.5-complete.jar'
        #grun='java org.antlr.v4.runtime.misc.TestRig'
        java -jar /usr/local/lib/antlr-4.5-complete.jar -no-listener -visitor x_path_grammar.g4
        javac *.java

if [ $1 == "g" ]
then
	java org.antlr.v4.runtime.misc.TestRig x_path_grammar r -gui	
elif [ $1 == "o" ]
then
	java XPathRunner
fi
