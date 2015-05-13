#!/bin/bash

if [ $1 == "g" ]
then
	cd /usr/local/lib
	curl -O http://www.antlr.org/download/antlr-4.5-complete.jar
	cd -	
	export CLASSPATH=".:/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH"
	alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
	alias grun='java org.antlr.v4.runtime.misc.TestRig'
	antlr4 -no-listener -visitor x_path_grammar.g4
	javac *.java
	grun x_path_grammar r -gui	
elif [ $1 == "o" ]
then
	java XPathRunner
fi
