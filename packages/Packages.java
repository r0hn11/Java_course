package com.complete.packages;

public class Packages{
	public static void main(String[] args) {
/*
		Packages :
		Packages are used to  group related classes.
				Helps in avoiding naming conflicts.
		Helps in organizing the different classes.

		Types :
		Built-in (Java API) (path: jdk-version/lib/src.zip)
		User defined (custom packages)

		Adding .java files to a package :
		Mentioned file will be transferred to a new folder with packagename mentioned inside .java file.
		(Note: .java file must contain a packagename and a classname)
		Following command compile .java file to create .class file and adds inside mentioned package/folder.
				Sub packages can be created using . in front of base packagename. e.g. superpack.subpack

		javac -d . Main.java (separate filename)
		javac -d . *.java (all existing java files in that package)
		javac -d foldername *.java (all existing java files in the mentioned folder which will contain the mentioned package. e.g. foldername/packagename.)

		Command :
		javac : java compiler
		-d : specify path
			. : add package in the same path (replace '.' with folder name to group inside a folder).

		classes can be added even after compilation.

				Using a package :
		Any custom/ built-in package can be accessed by importing & using name as follows
		e.g. import packagename.classname

*/
	}
}