all : hw
	mv hw ./bin

hw: src/hw.c
	gcc src/hw.c -o hw -Wall

clean:
	rm -f hw