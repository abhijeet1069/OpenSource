all : cpu mem threads
	mv cpu ./bin
	mv mem ./bin
	mv threads ./bin

cpu : cpu.c common.h
	gcc -o cpu cpu.c -Wall

mem : mem.c common.h
	gcc -o mem mem.c -Wall

threads: threads.c common.h common_threads.h
	gcc -o threads threads.c -Wall -pthread

clean:
	rm -f cpu mem