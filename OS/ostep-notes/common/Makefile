CC=gcc
CFLAGS=-std=c11 -Wall
DEPS = logger.c main.c

%.o: %.c $(DEPS)
	$(CC) -c -o $@ $< $(CFLAGS)

build: logger.o
	echo "Build Successful!! \nI/P : LOG(Hello,World!!) \nO/P : [09:25:55 31-08-2023] [main:7] Hello,World!!"