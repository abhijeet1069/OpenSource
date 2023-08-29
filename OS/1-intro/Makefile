all : cpu mem threads io
	mv cpu ./bin
	mv mem ./bin
	mv threads ./bin
	mv io ./bin

cpu : cpu.c common.h
	gcc -o cpu cpu.c -Wall

mem : mem.c common.h
	gcc -o mem mem.c -Wall

threads: threads.c common.h common_threads.h
	gcc -o threads threads.c -Wall -pthread

clean:
	rm -f cpu mem

io: io.c common.h
	gcc -o io io.c -Wall