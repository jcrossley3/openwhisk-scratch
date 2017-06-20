#!/bin/bash

javac -cp gson-2.8.1.jar Hello.java
jar cvf hello.jar Hello.class
