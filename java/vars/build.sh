#!/bin/bash

javac -cp ../gson-2.8.1.jar Vars.java
jar cvf vars.jar Vars.class
