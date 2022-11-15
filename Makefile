filename = RunMatrix

all: build run

build:
	javac RunMatrix.java

run:
	java RunMatrix.java

clean:
	rm RunMatrix.class
