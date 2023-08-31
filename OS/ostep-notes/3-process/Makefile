CC=gcc
CFLAGS=-Wall -std=c11
SOURCE=test/test-printf.c
BUILD=test/build
DEPS = ../common/logger.h

%.o: %.c $(DEPS)
	$(CC) -c -o $@ $< $(CFLAGS)

build: $(SOURCE)
	$(CC) $(SOURCE) $(CCFLAGS) -o $(BUILD)

run: build
	./$(BUILD)